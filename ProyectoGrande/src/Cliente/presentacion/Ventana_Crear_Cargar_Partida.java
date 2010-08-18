/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Ventana_Crear_Cargar_Partida.java
 *
 * Created on 08/08/2010, 11:31:38 PM
 */

package Cliente.presentacion;

import Cliente.logica.ComunicacionCliente;

/**
 *
 * @author Robert
 */
public class Ventana_Crear_Cargar_Partida extends javax.swing.JFrame {

    /** Creates new form Ventana_Crear_Cargar_Partida */
    String nombre;
    String apellido;
    String avatar;
    String nickJugador;

    public Ventana_Crear_Cargar_Partida(String args) {
        String [] datos = args.split(":");
        nombre = datos[1];
        apellido = datos[2];
        avatar = datos[3];
        nickJugador = ComunicacionCliente.peticionServidor("8:" + nombre, 100);
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBCrearr_P = new javax.swing.JButton();
        jBCargar_P = new javax.swing.JButton();
        jBSalir_cuenta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusCycleRoot(false);
        setName("JFCrear_Cargar_Partida"); // NOI18N

        jBCrearr_P.setText("Crear Partida");
        jBCrearr_P.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCrearr_PActionPerformed(evt);
            }
        });

        jBCargar_P.setText("Cargar Partida");
        jBCargar_P.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCargar_PActionPerformed(evt);
            }
        });

        jBSalir_cuenta.setText("Cerrar Sesion");
        jBSalir_cuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalir_cuentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jBCrearr_P, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBSalir_cuenta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBCargar_P, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jBCrearr_P)
                .addGap(18, 18, 18)
                .addComponent(jBCargar_P, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBSalir_cuenta)
                .addGap(47, 47, 47))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-221)/2, (screenSize.height-270)/2, 221, 270);
    }// </editor-fold>//GEN-END:initComponents

    private void jBCrearr_PActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCrearr_PActionPerformed
        this.setVisible(false);
        VentanaCrearPartida Ventana = new VentanaCrearPartida();
        Ventana.setVisible(true);
        String resultado = ComunicacionCliente.peticionServidor("2:"+  Cliente.logica.SesionAbierta.Nick_sesion/*nickJugador*/ + ":12/01/10", 2);
        
        System.out.println(resultado);


}//GEN-LAST:event_jBCrearr_PActionPerformed

    private void jBCargar_PActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCargar_PActionPerformed
        //LO QUE HARA EL BOTON
      //  String resultado = ComunicacionCliente.peticionServidor(apellido, WIDTH)
        Ventana_Cargar_Partida Ventana = new Ventana_Cargar_Partida();
        Ventana.setVisible(true);
        this.dispose();
}//GEN-LAST:event_jBCargar_PActionPerformed

    private void jBSalir_cuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalir_cuentaActionPerformed
        // TODO add your handling code here:
        this.dispose();
        VentanaInicio verVentana = new VentanaInicio();
        verVentana.setVisible(true);

    }//GEN-LAST:event_jBSalir_cuentaActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Crear_Cargar_Partida("a").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCargar_P;
    private javax.swing.JButton jBCrearr_P;
    private javax.swing.JButton jBSalir_cuenta;
    // End of variables declaration//GEN-END:variables

}
