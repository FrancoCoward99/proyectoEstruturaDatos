package UI;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import proyecto.Clientes;
import proyecto.SistemaTickets;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Franco Coward
 */
public class FormCliente extends javax.swing.JFrame {

    /**
     * Creates new form FormCliente
     */
    public FormCliente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boxTipo = new javax.swing.JComboBox<>();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        lbNombre = new javax.swing.JLabel();
        spnEdad = new javax.swing.JSpinner();
        lbId = new javax.swing.JLabel();
        resultComboTramite = new javax.swing.JLabel();
        lbEdad = new javax.swing.JLabel();
        resultComboTipo = new javax.swing.JLabel();
        lbTramite = new javax.swing.JLabel();
        lbTipo = new javax.swing.JLabel();
        boxTramite = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        boxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "P", "N", "R" }));
        boxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxTipoActionPerformed(evt);
            }
        });

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setText("Registro de Cliente");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lbNombre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbNombre.setText("Nombre:");

        lbId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbId.setText("ID");

        resultComboTramite.setBackground(new java.awt.Color(255, 255, 255));
        resultComboTramite.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbEdad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbEdad.setText("Edad:");

        resultComboTipo.setBackground(new java.awt.Color(255, 255, 255));
        resultComboTipo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbTramite.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTramite.setText("Tramite:");

        lbTipo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTipo.setText("Tipo:");

        boxTramite.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Depositos", "Retiros", "Cambio de Divisas" }));
        boxTramite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxTramiteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTramite)
                    .addComponent(lbTipo)
                    .addComponent(lbEdad)
                    .addComponent(lbId)
                    .addComponent(lbNombre))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(resultComboTramite, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(resultComboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(boxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boxTramite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel1)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(157, 157, 157)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar))
                        .addGap(210, 210, 210))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(spnEdad)
                        .addGap(474, 474, 474))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbId)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbEdad)
                            .addComponent(spnEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTramite)
                            .addComponent(resultComboTramite, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTipo)
                            .addComponent(resultComboTipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boxTramite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(boxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(320, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxTipoActionPerformed
        //Codigo del combo box para que aparezca el texto seleccionado
        String mensaje = "";
        mensaje = mensaje + boxTipo.getSelectedItem().toString();
        resultComboTipo.setText(mensaje);
    }//GEN-LAST:event_boxTipoActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
         String nombre = txtNombre.getText();
        String id = txtId.getText();
        int edad = Integer.parseInt(spnEdad.getValue().toString());
        String tramite = resultComboTramite.getText();
        String tipo =  resultComboTipo.getText();
        LocalDateTime horaCreacion = LocalDateTime.now();
        // Obtener el siguiente número de ticket y guardarlo
    int ticket = SistemaTickets.obtenerSiguienteTicket();
    SistemaTickets.guardarTicketActual(); // Guardar el número de ticket actualizado

    // Asignar la caja según el tipo
    String caja;
    switch (tipo) {
        case "P":
            caja = "Caja Preferencial";
            break;
        case "R":
            caja = "Caja Rápida";
            break;
        case "N":
            caja = "Caja Normal";
            break;
        default:
            caja = "Caja No Especificada";
            break;
    }

    // Crear el cliente con los datos
    Clientes cliente = new Clientes(nombre, id, edad, horaCreacion, tramite, tipo.charAt(0), 0, ticket, caja);

    try (BufferedWriter writer = new BufferedWriter(new FileWriter("prod.txt", true))) {
        writer.write(nombre + "\t" + id + "\t" + edad + "\t" + horaCreacion.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME) + "\t" + tramite + "\t" + tipo + "\t" + ticket + "\t" + caja);
        writer.newLine();
        JOptionPane.showMessageDialog(this, "Datos guardados correctamente.");
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error al guardar los datos: " + e.getMessage());
    }

        
    txtNombre.setText("");
    txtId.setText("");
    spnEdad.setValue(0);
    resultComboTramite.setText("");
    resultComboTipo.setText("");

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void boxTramiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxTramiteActionPerformed
        // TODO add your handling code here:
        String mensaje = "";
        mensaje = mensaje + boxTramite.getSelectedItem().toString();
        resultComboTramite.setText(mensaje);
    }//GEN-LAST:event_boxTramiteActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
       this.dispose();// Cierra la ventana de Menu principal
         MenuPrincipal menuPrincipalUI = new MenuPrincipal();
          menuPrincipalUI.setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed
    
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
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxTipo;
    private javax.swing.JComboBox<String> boxTramite;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbEdad;
    private javax.swing.JLabel lbId;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbTipo;
    private javax.swing.JLabel lbTramite;
    private javax.swing.JLabel resultComboTipo;
    private javax.swing.JLabel resultComboTramite;
    private javax.swing.JSpinner spnEdad;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
