package projetebem.Views;

import java.util.concurrent.TimeUnit;
import projetebem.Controllers.SistemaController;
import projetebem.Controllers.UsuarioController;
import projetebem.Models.UsuarioModel;

//import projetebem.Controllers.SistemaController;

public class Cadastro extends javax.swing.JFrame {

    private UsuarioController usuarioController;
    
    public Cadastro() {
        initComponents();
        mensagemErro.setVisible(false);
        mensagemCerto.setVisible(false);
        usuarioController = new UsuarioController();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoEmail = new javax.swing.JTextField();
        campoTelefone = new javax.swing.JTextField();
        campoNome = new javax.swing.JTextField();
        campoSenha = new javax.swing.JPasswordField();
        botaoCadastro = new javax.swing.JButton();
        botaoVoltar = new javax.swing.JButton();
        mensagemCerto = new javax.swing.JLabel();
        mensagemErro = new javax.swing.JLabel();
        ComboBoxSetor = new javax.swing.JComboBox<>();
        fundoCadastro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de cadastro");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campoEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoEmail.setForeground(new java.awt.Color(15, 46, 89));
        campoEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEmailActionPerformed(evt);
            }
        });
        getContentPane().add(campoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 250, -1));

        campoTelefone.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoTelefone.setForeground(new java.awt.Color(15, 46, 89));
        campoTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTelefoneActionPerformed(evt);
            }
        });
        getContentPane().add(campoTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, 250, -1));

        campoNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoNome.setForeground(new java.awt.Color(15, 46, 89));
        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });
        getContentPane().add(campoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 250, -1));

        campoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(campoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 250, 30));

        botaoCadastro.setBackground(new java.awt.Color(15, 46, 89));
        botaoCadastro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        botaoCadastro.setForeground(new java.awt.Color(255, 255, 255));
        botaoCadastro.setText("cadastro");
        botaoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 530, 250, 60));

        botaoVoltar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botaoVoltar.setForeground(new java.awt.Color(15, 46, 89));
        botaoVoltar.setText("voltar");
        botaoVoltar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(15, 46, 89)));
        botaoVoltar.setFocusPainted(false);
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 580, 110, -1));

        mensagemCerto.setForeground(new java.awt.Color(0, 204, 0));
        mensagemCerto.setText("jLabel1");
        getContentPane().add(mensagemCerto, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 610, 290, -1));

        mensagemErro.setForeground(new java.awt.Color(204, 0, 0));
        mensagemErro.setText("jLabel1");
        getContentPane().add(mensagemErro, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 610, 290, -1));

        ComboBoxSetor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ComboBoxSetor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "administrativo", "comercial", "compras", "financeiro", "marketing", "operacoes", "recursos humanos" }));
        getContentPane().add(ComboBoxSetor, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 480, 250, 30));

        fundoCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetebem/Views/imagens/fundoCadastro.png"))); // NOI18N
        getContentPane().add(fundoCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEmailActionPerformed

    }//GEN-LAST:event_campoEmailActionPerformed

    private void campoTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTelefoneActionPerformed

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeActionPerformed

    private void campoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoSenhaActionPerformed

    private void botaoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastroActionPerformed
        String nome = campoNome.getText();
        String email = campoEmail.getText();
        String senha = campoSenha.getText();
        String telefone = campoTelefone.getText();
        String setor = ComboBoxSetor.getSelectedItem().toString();
        
        
        //mensagemErro.setVisible(false);
        //mensagemCerto.setVisible(false);
        
        if(nome.isEmpty() || email.isEmpty() || senha.isEmpty() || telefone.isEmpty() || setor.isEmpty()){
            mensagemErro.setText("campos vazios!");
            mensagemErro.setVisible(true);
        }else{
                UsuarioController user = new UsuarioController();
                if(user.verificarDuplicatas(email, telefone)){
                       mensagemErro.setText("E-mail ou telefone já cadastrado");
                       mensagemErro.setVisible(true);
                }
                else{
                     UsuarioModel usuario = new UsuarioModel(nome, email, senha, telefone, setor);
                     
                     if(usuarioController.cadastrarUsuario(usuario, ComboBoxSetor.getSelectedItem().toString())){
                        mensagemCerto.setText("Usuário cadastrado com sucesso.");
                        mensagemCerto.setVisible(true);  
                        
                        campoNome.setText("");
                        campoEmail.setText("");
                        campoSenha.setText("");
                        campoTelefone.setText("");
                       
                        try{               
                            //Thread.sleep(3000);
                            TimeUnit.SECONDS.sleep(3);
                        }
                        catch(InterruptedException x) { }

                        SistemaController.login.show();
                        this.dispose();
                     
                     }else{
                       mensagemErro.setText("Erro ao cadastrar o usuário");
                       mensagemErro.setVisible(true);
                     }
                    }
            
        }
        
    }//GEN-LAST:event_botaoCadastroActionPerformed

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
         this.dispose();
         SistemaController.login.show();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxSetor;
    private javax.swing.JButton botaoCadastro;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoNome;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JTextField campoTelefone;
    private javax.swing.JLabel fundoCadastro;
    private javax.swing.JLabel mensagemCerto;
    private javax.swing.JLabel mensagemErro;
    // End of variables declaration//GEN-END:variables
}
