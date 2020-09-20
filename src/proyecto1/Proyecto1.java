package proyecto1;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import proyecto1.Vista.VentanaAplicacion;
import proyecto1.Control.Control;

/**
 *
 * @author Britany Rojas 
 * 
 */
public class Proyecto1 {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            JFrame.setDefaultLookAndFeelDecorated(true);
        } catch (ClassNotFoundException
                | IllegalAccessException
                | InstantiationException
                | UnsupportedLookAndFeelException ex) {
            System.err.printf("Excepción: '%s'%n", ex.getMessage());
        }

        SwingUtilities.invokeLater(() -> {
            new VentanaAplicacion(new Control()).init();
        });
    }
    
}
