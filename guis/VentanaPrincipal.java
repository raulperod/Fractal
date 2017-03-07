package guis;

import evento.EscuchadorVentana;
import javax.swing.JFrame;

/**
 *
 * @author Raul Perez
 * Fecha: Noviembre 2015
 * 
 */
public class VentanaPrincipal extends JFrame {
    
    /**
     * Metodo que construye una ventanaPrincipal
     */
    public VentanaPrincipal(){
    
        this.setTitle("Fractal");
        this.setLayout(null);
        this.setSize(1200, 600);
        this.setResizable(false);
        // pone al centro la ventana
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        // agrega un EscuchadorVentana
        this.addWindowListener( new EscuchadorVentana());
        
    }
    
}
