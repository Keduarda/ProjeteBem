/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projetebem.Views;

import projetebem.Controllers.SistemaController;


public class CertezaSair extends javax.swing.JFrame {

    private Login login;
    
    public CertezaSair() {
        initComponents();
        login = new Login();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoSimSair = new javax.swing.JButton();
        botaoNaoSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botaoSimSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSimSairActionPerformed(evt);
            }
        });
        getContentPane().add(botaoSimSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 90, 30));
        botaoSimSair.setOpaque(false);
        botaoSimSair.setContentAreaFilled(false);
        botaoSimSair.setBorderPainted(false);

        botaoNaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNaoSairActionPerformed(evt);
            }
        });
        getContentPane().add(botaoNaoSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 100, 30));
        botaoNaoSair.setOpaque(false);
        botaoNaoSair.setContentAreaFilled(false);
        botaoNaoSair.setBorderPainted(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetebem/Views/imagens/login.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSimSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSimSairActionPerformed
        //System.exit(0);
         SistemaController.telaInicial.dispose();
         this.dispose();
         login.setVisible(true);
    }//GEN-LAST:event_botaoSimSairActionPerformed

    private void botaoNaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNaoSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoNaoSairActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoNaoSair;
    private javax.swing.JButton botaoSimSair;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
