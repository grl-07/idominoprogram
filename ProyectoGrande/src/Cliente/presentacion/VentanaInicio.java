/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Inicio.java
 *
 * Created on 08-ago-2010, 15:38:23
 */

package Cliente.presentacion;

//import Ventana_Crear_Cargar_Partida;
import Cliente.logica.ComunicacionCliente;
import javax.swing.*;
import ve.edu.ucab.cliente.ClienteSocket;

/**
 *
 * @author Robert
 */
public class VentanaInicio extends javax.swing.JFrame {

    /** Creates new form Inicio */
    public VentanaInicio() {
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

        jLTitulo_iDomino = new javax.swing.JLabel();
        jTFNickName = new javax.swing.JTextField();
        jLNickName = new javax.swing.JLabel();
        jLPassword = new javax.swing.JLabel();
        jBRegistrarse = new javax.swing.JButton();
        jBEntrar = new javax.swing.JButton();
        jPFPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INICIO iDOMINO");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Comic Sans MS", 0, 10));
        setLocationByPlatform(true);
        setName("jFVentanaInicio"); // NOI18N
        setResizable(false);

        jLTitulo_iDomino.setFont(new java.awt.Font("Comic Sans MS", 2, 18));
        jLTitulo_iDomino.setText("   iDomino");

        jTFNickName.setFont(new java.awt.Font("Comic Sans MS", 0, 11));

        jLNickName.setFont(new java.awt.Font("Comic Sans MS", 0, 11));
        jLNickName.setText("Nickname:");

        jLPassword.setFont(new java.awt.Font("Comic Sans MS", 0, 11));
        jLPassword.setText("PassWord:");

        jBRegistrarse.setBackground(new java.awt.Color(204, 204, 204));
        jBRegistrarse.setFont(new java.awt.Font("Comic Sans MS", 0, 11));
        jBRegistrarse.setActionCommand("jBRegistrarse");
        jBRegistrarse.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBRegistrarse.setLabel("Registrarse");
        jBRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegistrarseActionPerformed(evt);
            }
        });

        jBEntrar.setBackground(new java.awt.Color(204, 204, 204));
        jBEntrar.setFont(new java.awt.Font("Comic Sans MS", 0, 11));
        jBEntrar.setActionCommand("jBEntrar");
        jBEntrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBEntrar.setLabel("Entrar");
        jBEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLNickName)
                            .addComponent(jLPassword))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPFPassword, 0, 0, Short.MAX_VALUE)
                            .addComponent(jTFNickName, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLTitulo_iDomino, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jBRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jBEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLTitulo_iDomino, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNickName)
                    .addComponent(jTFNickName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLPassword)
                    .addComponent(jPFPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBRegistrarse)
                    .addComponent(jBEntrar))
                .addGap(32, 32, 32))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-295)/2, (screenSize.height-266)/2, 295, 266);
    }// </editor-fold>//GEN-END:initComponents

    private void jBRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegistrarseActionPerformed
        this.setVisible(false);
       VentanaRegistro verVentana = new VentanaRegistro();
       verVentana.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jBRegistrarseActionPerformed

    private void jBEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEntrarActionPerformed
// TODO add your handling code here:
        String a = jTFNickName.getText();
        String b = jPFPassword.getText();
        

        if ((jTFNickName.getText().equals("")) || (jPFPassword.getPassword().equals("")))
        {
            JOptionPane.showMessageDialog(this, "DEBE LLENAR AMBOS CAMPOS PARA PODER INGRESAR A LA APLICACION");
            this.dispose();
            this.setVisible(true);
        }
        else
        {
                String resultado = ComunicacionCliente.peticionServidor("1:" + a + ":" + b, 1);
                System.out.println(resultado);
                if (resultado.length() == 5)
                   JOptionPane.showMessageDialog(this, "USUARIO NO EXISTE");

                
                else{
                    this.dispose();
                   Ventana_Crear_Cargar_Partida verVentana = new Ventana_Crear_Cargar_Partida(resultado);
                   verVentana.setVisible(true);
                }
                    
        }



    }//GEN-LAST:event_jBEntrarActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEntrar;
    private javax.swing.JButton jBRegistrarse;
    private javax.swing.JLabel jLNickName;
    private javax.swing.JLabel jLPassword;
    private javax.swing.JLabel jLTitulo_iDomino;
    private javax.swing.JPasswordField jPFPassword;
    private javax.swing.JTextField jTFNickName;
    // End of variables declaration//GEN-END:variables

}