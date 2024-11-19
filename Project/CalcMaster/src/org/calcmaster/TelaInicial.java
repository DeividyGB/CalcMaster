package org.calcmaster;
import javax.swing.*;
/*@designer diogo @author Skullius*/
public class TelaInicial extends javax.swing.JFrame {
    public TelaInicial() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtN1 = new javax.swing.JTextField();
        txtN2 = new javax.swing.JTextField();
        txtRes = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnPlus = new javax.swing.JButton();
        btnSubtract = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btnMult = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnPow2 = new javax.swing.JButton();
        btnSquare = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Calculadora"));

        jLabel1.setText("Número 1");

        jLabel2.setText("Número 2");

        jLabel3.setText("Resultado");

        btnPlus.setText("+");
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusActionPerformed(evt);
            }
        });

        btnSubtract.setText("-");
        btnSubtract.setToolTipText("");
        btnSubtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtractActionPerformed(evt);
            }
        });

        btnDivision.setText("/");
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });

        btnMult.setText("*");
        btnMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultActionPerformed(evt);
            }
        });

        btnExit.setText("Sair");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnPow2.setText("x²");
        btnPow2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPow2ActionPerformed(evt);
            }
        });

        btnSquare.setText("√");
        btnSquare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSquareActionPerformed(evt);
            }
        });

        btnClear.setText("C");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(45, 45, 45))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(txtN1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtN2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(txtRes, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSubtract, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSquare, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMult, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPow2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(92, 92, 92))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtN2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPlus)
                    .addComponent(btnPow2)
                    .addComponent(btnClear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDivision)
                    .addComponent(btnSubtract))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSquare)
                    .addComponent(btnMult)
                    .addComponent(btnExit))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubtractActionPerformed
        double n1, n2, r;
        n1 = Double.parseDouble(txtN1.getText());
        n2 = Double.parseDouble(txtN2.getText());
        r = n1 - n2;
        txtRes.setText(String.valueOf(r));
    }//GEN-LAST:event_btnSubtractActionPerformed

    private void btnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusActionPerformed
        double n1, n2, r;
        n1 = Double.parseDouble(txtN1.getText());
        n2 = Double.parseDouble(txtN2.getText());
        r = n1 + n2;
        txtRes.setText(String.valueOf(r));
    }//GEN-LAST:event_btnPlusActionPerformed

    private void btnPow2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPow2ActionPerformed
        double n1, n2, r1 = 1, r2 = 1;
        n1 = Double.parseDouble(txtN1.getText());
        n2 = Double.parseDouble(txtN2.getText());
        for(int i = 0; i < 2; i++){
            r1 *= n1;
        }
        for(int i = 0; i < 2; i++){
            r2 *= n2;
        }
        txtRes.setText(String.valueOf(r1 + " , " + r2));
    }//GEN-LAST:event_btnPow2ActionPerformed

    private void btnMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultActionPerformed
        double n1, n2, r;
        n1 = Double.parseDouble(txtN1.getText());
        n2 = Double.parseDouble(txtN2.getText());
        r = n1 * n2;
        txtRes.setText(String.valueOf(r));
    }//GEN-LAST:event_btnMultActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
        double n1, n2, r;
        n1 = Double.parseDouble(txtN1.getText());
        n2 = Double.parseDouble(txtN2.getText());
        if(n2 == 0){
            JOptionPane.showMessageDialog(TelaInicial.this, "Cannot divide by zero.", "Warning", JOptionPane.WARNING_MESSAGE);
        }else{
            r = n1 / n2;
            txtRes.setText(String.valueOf(r));
        }
    }//GEN-LAST:event_btnDivisionActionPerformed

    private void btnSquareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSquareActionPerformed
        double n1, n2, r1, r2;
        n1 = Double.parseDouble(txtN1.getText());
        n2 = Double.parseDouble(txtN2.getText());
        r1 = Math.sqrt(n1);
        r2 = Math.sqrt(n2);
        txtRes.setText(String.valueOf(r1 + " , " + r2));
    }//GEN-LAST:event_btnSquareActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtN1.setText("");
        txtN2.setText("");
        txtRes.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMult;
    private javax.swing.JButton btnPlus;
    private javax.swing.JButton btnPow2;
    private javax.swing.JButton btnSquare;
    private javax.swing.JButton btnSubtract;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtN1;
    private javax.swing.JTextField txtN2;
    private javax.swing.JTextField txtRes;
    // End of variables declaration//GEN-END:variables
}
