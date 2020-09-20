package proyecto1.Vista;

import java.awt.HeadlessException;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import proyecto1.Control.Control;

/**
 *
 * @author Britany Rojas
 */
public class VentanaAplicacion extends javax.swing.JFrame 
             implements Observer {


    public VentanaAplicacion(Control gestorPrincipal) throws HeadlessException {
        this.gestorPrincipal = gestorPrincipal;
        initComponents();
    }            
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelBarraEstado = new javax.swing.JPanel();
        etqEstado = new javax.swing.JLabel();
        PanelPrincipal = new javax.swing.JPanel();
        MenuPrincipal = new javax.swing.JMenuBar();
        MenuArchivo = new javax.swing.JMenu();
        ItemSalir = new javax.swing.JMenuItem();
        MenuEdicion = new javax.swing.JMenu();
        MenuRegistrar = new javax.swing.JMenu();
        MenuVer = new javax.swing.JMenu();
        MenuAyuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelBarraEstado.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        etqEstado.setText("Estado");
        PanelBarraEstado.add(etqEstado);

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 366, Short.MAX_VALUE)
        );

        MenuArchivo.setText("Archivo");

        ItemSalir.setText("Salir");
        ItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemSalirActionPerformed(evt);
            }
        });
        MenuArchivo.add(ItemSalir);

        MenuPrincipal.add(MenuArchivo);

        MenuEdicion.setText("Edición");
        MenuPrincipal.add(MenuEdicion);

        MenuRegistrar.setText("Registrar");
        MenuPrincipal.add(MenuRegistrar);

        MenuVer.setText("Ver");
        MenuPrincipal.add(MenuVer);

        MenuAyuda.setText("Ayuda");
        MenuPrincipal.add(MenuAyuda);

        setJMenuBar(MenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelBarraEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelBarraEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItemSalirActionPerformed

   public void mostrarMensaje(String mensaje) {
        throw new UnsupportedOperationException();
    }

    public void init() {
        gestorPrincipal.registrar(this);
        setSize(getMinimumSize());
        setVisible(true);
    }

    @Override
    public void update(Observable modelo, Object evt) {
        mostrarMensaje(evt.toString());
    }

    
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            JFrame.setDefaultLookAndFeelDecorated(true);
        } catch (ClassNotFoundException
                | IllegalAccessException
                | InstantiationException
                | UnsupportedLookAndFeelException ex) {
            System.err.printf("Excepción: '%s'%n", ex.getMessage());
        }

        java.awt.EventQueue.invokeLater(() -> {
            new VentanaAplicacion(null).setVisible(true);
        });
    }

    
    private final Control gestorPrincipal;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ItemSalir;
    private javax.swing.JMenu MenuArchivo;
    private javax.swing.JMenu MenuAyuda;
    private javax.swing.JMenu MenuEdicion;
    private javax.swing.JMenuBar MenuPrincipal;
    private javax.swing.JMenu MenuRegistrar;
    private javax.swing.JMenu MenuVer;
    private javax.swing.JPanel PanelBarraEstado;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JLabel etqEstado;
    // End of variables declaration//GEN-END:variables
}
