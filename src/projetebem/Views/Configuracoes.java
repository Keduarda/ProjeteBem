package projetebem.Views;

import javax.swing.SwingUtilities;
import projetebem.Controllers.SistemaController;
import projetebem.Controllers.UsuarioController;
import projetebem.Models.UsuarioModel;

public class Configuracoes extends javax.swing.JFrame {

    private UsuarioController usuarioController;
    private UsuarioModel usuarioLogado;
    
    public Configuracoes(UsuarioModel usuarioLogado) {
        initComponents();
        usuarioController = new UsuarioController();
        this.usuarioLogado = usuarioLogado;
        
        campoNome.setText(usuarioLogado.getNome());
        campoNome.setEditable(false);
        
        campoEmail.setText(usuarioLogado.getEmail());
        campoEmail.setEditable(false);
        
        campoTelefone.setText(usuarioLogado.getTelefone());
        campoTelefone.setEditable(false);
        
        campoSetor.setText(usuarioLogado.getSetor());
        campoSetor.setEditable(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoSetor = new javax.swing.JTextField();
        campoNome = new javax.swing.JTextField();
        campoTelefone = new javax.swing.JTextField();
        campoEmail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        botaoVoltar = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();
        botaoAlterar = new javax.swing.JButton();
        fundoConfiguracoes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de configurações");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campoSetor.setBackground(new java.awt.Color(239, 216, 205));
        campoSetor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSetorActionPerformed(evt);
            }
        });
        getContentPane().add(campoSetor, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, 760, 40));

        campoNome.setBackground(new java.awt.Color(239, 216, 205));
        campoNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoNome.setForeground(new java.awt.Color(15, 46, 89));
        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });
        getContentPane().add(campoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 760, 40));

        campoTelefone.setBackground(new java.awt.Color(239, 216, 205));
        campoTelefone.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTelefoneActionPerformed(evt);
            }
        });
        getContentPane().add(campoTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 760, 40));

        campoEmail.setBackground(new java.awt.Color(239, 216, 205));
        campoEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEmailActionPerformed(evt);
            }
        });
        getContentPane().add(campoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 760, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(15, 46, 89));
        jLabel1.setText("email:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(15, 46, 89));
        jLabel3.setText("setor:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(15, 46, 89));
        jLabel4.setText("telefone:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(15, 46, 89));
        jLabel5.setText("nome:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, -1, -1));

        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, 90, 30));
        botaoVoltar.setOpaque(false);

        botaoVoltar.setContentAreaFilled(false);

        botaoVoltar.setBorderPainted(false);

        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 510, 160, 60));
        botaoSalvar.setOpaque(false);

        botaoSalvar.setContentAreaFilled(false);

        //botaoSalvar.setBorderPainted(false);

        botaoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 510, 160, 60));
        botaoAlterar.setOpaque(false);

        botaoAlterar.setContentAreaFilled(false);

        //botaoAlterar.setBorderPainted(false);

        fundoConfiguracoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetebem/Views/imagens/fundoConfiguracoes.png"))); // NOI18N
        getContentPane().add(fundoConfiguracoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campoSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSetorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoSetorActionPerformed

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeActionPerformed

    private void campoTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTelefoneActionPerformed

    private void campoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEmailActionPerformed

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        SwingUtilities.invokeLater(() -> {
                        this.dispose();
                        SistemaController.telaInicial.show();
        });
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void botaoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlterarActionPerformed
        campoNome.setEditable(true);
        campoEmail.setEditable(true);
        campoTelefone.setEditable(true);
    }//GEN-LAST:event_botaoAlterarActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        usuarioController.editarUsuario(usuarioLogado.getId(), campoNome.getText(), campoEmail.getText(), campoTelefone.getText());
    }//GEN-LAST:event_botaoSalvarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAlterar;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoSetor;
    private javax.swing.JTextField campoTelefone;
    private javax.swing.JLabel fundoConfiguracoes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
