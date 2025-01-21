/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.grupointer;

/**
 *
 * @author ADMIN
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLbName = new javax.swing.JLabel();
        CBxElegir = new javax.swing.JComboBox<>();
        ChBoxAlm = new javax.swing.JCheckBox();
        ChBoxTrans = new javax.swing.JCheckBox();
        ChBoxApo = new javax.swing.JCheckBox();
        RdBtMañan = new javax.swing.JRadioButton();
        RdBtTarde = new javax.swing.JRadioButton();
        BttRegis = new javax.swing.JButton();
        BttMosReg = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLbName.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 24)); // NOI18N
        jLbName.setForeground(new java.awt.Color(0, 153, 153));
        jLbName.setText("Adrian");

        CBxElegir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CBxElegir.setForeground(new java.awt.Color(153, 153, 255));
        CBxElegir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estudiante", "Profesional", "Invitado especial" }));
        CBxElegir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        ChBoxAlm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ChBoxAlm.setText("Almuerzo");

        ChBoxTrans.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ChBoxTrans.setText("Transporte");

        ChBoxApo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ChBoxApo.setText("M.de Apoyo");

        RdBtMañan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RdBtMañan.setText("Mañana");
        RdBtMañan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RdBtMañanActionPerformed(evt);
            }
        });

        RdBtTarde.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RdBtTarde.setText("Tarde");

        BttRegis.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BttRegis.setText("Registrar participante");
        BttRegis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttRegisActionPerformed(evt);
            }
        });

        BttMosReg.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BttMosReg.setText("Mostrar registros");
        BttMosReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttMosRegActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jLbName, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ChBoxAlm)
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CBxElegir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ChBoxTrans)
                                .addGap(38, 38, 38)
                                .addComponent(ChBoxApo))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(RdBtMañan)
                                .addGap(82, 82, 82))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(BttRegis)
                                .addGap(32, 32, 32)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RdBtTarde)
                            .addComponent(BttMosReg))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLbName)
                .addGap(18, 18, 18)
                .addComponent(CBxElegir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChBoxAlm)
                    .addComponent(ChBoxTrans)
                    .addComponent(ChBoxApo))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RdBtMañan)
                    .addComponent(RdBtTarde))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BttRegis)
                    .addComponent(BttMosReg))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BttRegisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttRegisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BttRegisActionPerformed

    private void BttMosRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttMosRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BttMosRegActionPerformed

    private void RdBtMañanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RdBtMañanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RdBtMañanActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BttMosReg;
    private javax.swing.JButton BttRegis;
    private javax.swing.JComboBox<String> CBxElegir;
    private javax.swing.JCheckBox ChBoxAlm;
    private javax.swing.JCheckBox ChBoxApo;
    private javax.swing.JCheckBox ChBoxTrans;
    private javax.swing.JRadioButton RdBtMañan;
    private javax.swing.JRadioButton RdBtTarde;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLbName;
    // End of variables declaration//GEN-END:variables
}
