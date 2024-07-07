
package UI;


import javax.swing.JOptionPane;
import proyecto.InfoSesion;


public class Login extends javax.swing.JFrame {

    
    
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JP_Principal = new javax.swing.JPanel();
        JP_Secundario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JL_Usuario = new javax.swing.JLabel();
        JL_Contrasenia = new javax.swing.JLabel();
        JTF_Usuario = new javax.swing.JTextField();
        JPF_Contrasenia = new javax.swing.JPasswordField();
        JB_IniciarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JP_Principal.setBackground(new java.awt.Color(102, 102, 102));
        JP_Principal.setForeground(new java.awt.Color(242, 232, 220));
        JP_Principal.setPreferredSize(new java.awt.Dimension(1080, 720));

        JP_Secundario.setBackground(new java.awt.Color(204, 204, 204));
        JP_Secundario.setForeground(new java.awt.Color(123, 140, 134));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(1, 10, 38));
        jLabel1.setText("INICIO DE SESIÓN ");

        JL_Usuario.setForeground(new java.awt.Color(1, 10, 38));
        JL_Usuario.setText("Usuario");

        JL_Contrasenia.setForeground(new java.awt.Color(1, 10, 38));
        JL_Contrasenia.setText("Contraseña");

        JTF_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTF_UsuarioActionPerformed(evt);
            }
        });

        JPF_Contrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JPF_ContraseniaActionPerformed(evt);
            }
        });

        JB_IniciarSesion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JB_IniciarSesion.setForeground(new java.awt.Color(1, 10, 38));
        JB_IniciarSesion.setText("Iniciar Sesion");
        JB_IniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_IniciarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JP_SecundarioLayout = new javax.swing.GroupLayout(JP_Secundario);
        JP_Secundario.setLayout(JP_SecundarioLayout);
        JP_SecundarioLayout.setHorizontalGroup(
            JP_SecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_SecundarioLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(JP_SecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JP_SecundarioLayout.createSequentialGroup()
                        .addGroup(JP_SecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JL_Contrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JL_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP_SecundarioLayout.createSequentialGroup()
                        .addGroup(JP_SecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JPF_Contrasenia, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTF_Usuario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(52, 52, 52))))
            .addGroup(JP_SecundarioLayout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(JB_IniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 337, Short.MAX_VALUE))
        );
        JP_SecundarioLayout.setVerticalGroup(
            JP_SecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_SecundarioLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(JL_Usuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTF_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(JL_Contrasenia)
                .addGap(18, 18, 18)
                .addComponent(JPF_Contrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(JB_IniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(182, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout JP_PrincipalLayout = new javax.swing.GroupLayout(JP_Principal);
        JP_Principal.setLayout(JP_PrincipalLayout);
        JP_PrincipalLayout.setHorizontalGroup(
            JP_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP_PrincipalLayout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addComponent(JP_Secundario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
        );
        JP_PrincipalLayout.setVerticalGroup(
            JP_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_PrincipalLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(JP_Secundario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        JP_Secundario.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JP_Principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JP_Principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JPF_ContraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JPF_ContraseniaActionPerformed
        
    }//GEN-LAST:event_JPF_ContraseniaActionPerformed

    private void JTF_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTF_UsuarioActionPerformed
        
    }//GEN-LAST:event_JTF_UsuarioActionPerformed

    private void JB_IniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_IniciarSesionActionPerformed
        String usuario = JTF_Usuario.getText();
        String contrasenia = JPF_Contrasenia.getText();
        InfoSesion infoSesion = new InfoSesion("admin","admin");
        
        // Autenticar usuario
    if (!infoSesion.autenticar(usuario, contrasenia)) {
        JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos. Saliendo del sistema...", "Error", JOptionPane.ERROR_MESSAGE);
        System.exit(0);
    } else {
        JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso.", "Información", JOptionPane.INFORMATION_MESSAGE);
        // Aquí puedes abrir la ventana principal o realizar cualquier otra acción
        abrirMenuPrincipal();
    }   
    }//GEN-LAST:event_JB_IniciarSesionActionPerformed
     //mETODO PARA ABRIR MENU PRINCIPAL
    private void abrirMenuPrincipal() {
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.setVisible(true);
        this.dispose(); // Cierra la ventana de login
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_IniciarSesion;
    private javax.swing.JLabel JL_Contrasenia;
    private javax.swing.JLabel JL_Usuario;
    private javax.swing.JPasswordField JPF_Contrasenia;
    private javax.swing.JPanel JP_Principal;
    private javax.swing.JPanel JP_Secundario;
    private javax.swing.JTextField JTF_Usuario;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
