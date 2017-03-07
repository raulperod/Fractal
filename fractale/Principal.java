package fractale;

import guis.Dibujo;
import guis.Fractal;
import guis.Movimiento;
import guis.VentanaPrincipal;


/**
 *
 * @author Raul Perez
 * Fecha: Noviembre 2015
 */
public class Principal {

    public static void main(String[] args) {
        // crea una JFrame ( VentanaPrincipal )
        VentanaPrincipal ventana = new VentanaPrincipal();
        // crea un JPanel ( Movimiento )
        Movimiento movimiento = new Movimiento();
        // agrega movimiento a ventana
        ventana.getContentPane().add(movimiento);
        // le asigna el tamano y lugar a movimiento en la ventana
        movimiento.setBounds(890, 301, 300, 300);
        // crea un JPanel ( Dibujo )
        Dibujo dibujo = new Dibujo(ventana,movimiento);
        // agrega dibujo a ventana
        ventana.getContentPane().add(dibujo);
        // le asigna el tamano y lugar  a dibujo en la ventana
        dibujo.setBounds(890, 0, 300, 300);
        // crea un JPanel( Fractal )
        Fractal fractal = new Fractal(dibujo,movimiento);
        // agrega dibujo a fractal
        dibujo.agregarFractal(fractal);
        // agrega fractal a ventana
        ventana.getContentPane().add(fractal);
        // hace visible ventana
        ventana.setVisible(true);
       
    }
    
}
