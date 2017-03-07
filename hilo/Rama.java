package hilo;

import guis.Dibujo;
import guis.Fractal;
import guis.Movimiento;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Raul Perez
 * Fecha: Noviembre 2015 
 */
public class Rama extends Thread{
    private int x1;
    private int y1;
    private int velocidad;
    private Graphics brocha;
    private int angulo;
    private int nivel;
    private double escala;
    private Dibujo dibujo;
    private Fractal fractal;
    private Movimiento movimiento;
    private Color colorOrigen;
    private Color colorDestino;
    
    public Rama( int x1, int y1, int angulo, int nivel, Dibujo dibujo,
            Fractal fractal, Movimiento movimiento,Color colorOrigen ,Color colorDestino){
        
        this.x1 = x1;
        this.y1 = y1;
        this.fractal = fractal;
        this.movimiento = movimiento;
        this.dibujo = dibujo;
       
        this.velocidad = this.dibujo.obtenerVelocidad();
        this.brocha = fractal.getGraphics();
        this.brocha.setColor(colorOrigen);
        this.colorOrigen = colorOrigen;
        this.colorDestino = colorDestino;
        this.angulo = angulo;
        this.nivel = nivel;
        this.escala = this.movimiento.obtenerEscala();
        
        this.setPriority(Thread.MAX_PRIORITY);
    }
    
    public void run(){
        // si el nivel es 0 deja de crear nuevas ramas y termina de dibujarse el fractal
        if ( this.nivel != 0){
        
            
            // velocidad con la que se creara cada rama
            int velocidadParte = velocidad*2/10;
            int parte = 2;
            
            // crea un nuevo punto x2,y2
            int x2 = x1 + (int) (Math.cos(Math.toRadians(this.angulo))  * this.nivel * parte * this.escala);
            int y2 = y1 + (int) (Math.sin(Math.toRadians(this.angulo))  * this.nivel * parte * this.escala);
            
            // va dibujando lineas hasta completarse la rama
            // ---
            // ------
            // ---------
            int numeroDePartes = 10;
            if( this.nivel == (this.dibujo.obtenerNivel() - 1) ){
                numeroDePartes = ( int )( 10 * this.dibujo.obtenerRelacion() );
            }
            
            for( int i = 0 ; i < numeroDePartes ; ++i ){
            
                // dibuja la linea
                this.brocha.drawLine(x1, y1, x2, y2);
                // aumenta 'parte' para aser mas grande la linea
                parte++;
                // crea  un nuevo punto , para crear una linea mas larga despues
                x2 = x1 + (int) (Math.cos(Math.toRadians(this.angulo))  * this.nivel * parte * this.escala);
                y2 = y1 + (int) (Math.sin(Math.toRadians(this.angulo))  * this.nivel * parte * this.escala);
            
                // duerme la rama en 'velocidadParte' de tiempo
                try {
                    Thread.sleep(velocidadParte);
                } catch (InterruptedException ex) {
                
                }
            
            }
            // crea el punto final
            int nivell = this.nivel;
            if ( this.nivel == (this.dibujo.obtenerNivel() - 1) ) nivell++;
            
            x2 = x1 + (int) (Math.cos(Math.toRadians(this.angulo))  * nivell * numeroDePartes * this.escala);
            y2 = y1 + (int) (Math.sin(Math.toRadians(this.angulo))  * nivell * numeroDePartes * this.escala);
            // dibuja la linea final    
            this.brocha.drawLine(x1, y1, x2, y2);
            // interumpe la rama
            this.interrupt();
            
            // proceso para la creacion de las dos ramas que se crean de la rama original
            
            // separacion entre ramas, el angulo en el que estaran separadas cada rama nueva
            int separacion = ( 180 / ( this.dibujo.obtenerRamificacion() + 1 ) );
            int separacionSuma = separacion;
            //*****************************
            // color , degradacion del color
            int IncrementoRed;
            int IncrementoGreen;
            int IncrementoBlue;
            if( this.nivel != 1 ){
                IncrementoRed= (this.colorOrigen.getRed() - this.colorDestino.getRed()) / 2;
                IncrementoGreen =(this.colorOrigen.getGreen() - this.colorDestino.getGreen()) / 2 ;
                IncrementoBlue =(this.colorOrigen.getBlue() - this.colorDestino.getBlue()) / 2;
            }else{
                IncrementoRed= (this.colorOrigen.getRed() - this.colorDestino.getRed());
                IncrementoGreen =(this.colorOrigen.getGreen() - this.colorDestino.getGreen());
                IncrementoBlue =(this.colorOrigen.getBlue() - this.colorDestino.getBlue());
            }
            //*********************************************************************************
            // ramificaciones, crea una rama nueva dependiendo del numero de ramas que se dio
            for( int i = 0 ; i < this.dibujo.obtenerRamificacion() ; ++i ){
                    Rama rama = new Rama( x2,y2 ,angulo -(90-separacion),
                            nivel-1 , this.dibujo, this.fractal, 
                            this.movimiento , new Color( this.colorOrigen.getRed() - IncrementoRed,
                                    this.colorOrigen.getGreen() - IncrementoGreen ,this.colorOrigen.getBlue() - IncrementoBlue ) ,
                            this.colorDestino );
                    rama.start();
                    separacion += separacionSuma;
            
            }
        }else{
            this.interrupt();
        }
        
    }
}
