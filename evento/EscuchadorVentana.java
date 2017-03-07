package evento;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Raul Perez
 * Fecha: Noviembre 2015
 */
public class EscuchadorVentana implements WindowListener{

    @Override
    public void windowOpened(WindowEvent e) {
    }

    /**
     * Metodo que al tratar de cerrar la ventana te pregunta si realmente quieres cerrarla
     * @param e 
     */
    @Override
    public void windowClosing(WindowEvent e) {
        int valor = JOptionPane.showConfirmDialog( null ,"Seguro que quieres salir?","Salir", JOptionPane.WARNING_MESSAGE );
        if ( valor == JOptionPane.YES_NO_OPTION){
            JOptionPane.showMessageDialog(null,"Hecho por: Raul Perez Rodriguez","Autor", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }
    
}
