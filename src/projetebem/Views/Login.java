package projetebem.Views;

import projetebem.Controllers.UsuarioController;
import projetebem.Models.UsuarioModel;

import projetebem.Controllers.SistemaController;

public class Login extends javax.swing.JFrame {

    public static UsuarioModel usuarioLogado;
    
    public Login() {
        initComponents();
        SistemaController.login = this;
        mensagemDeErro.setVisible(false);
        usuarioLogado = new UsuarioModel();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoEmail = new javax.swing.JTextField();
        campoSenha = new javax.swing.JPasswordField();
        botaoEntrar = new javax.swing.JButton();
        aindaNpossuiCadastro = new javax.swing.JLabel();
        botaoFazercad = new javax.swing.JButton();
        mensagemDeErro = new javax.swing.JLabel();
        fundoLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de login");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campoEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoEmail.setForeground(new java.awt.Color(15, 46, 89));
        campoEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEmailActionPerformed(evt);
            }
        });
        getContentPane().add(campoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 250, -1));

        campoSenha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoSenha.setForeground(new java.awt.Color(15, 46, 89));
        campoSenha.setCaretColor(new java.awt.Color(102, 102, 102));
        campoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(campoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 250, -1));

        botaoEntrar.setBackground(new java.awt.Color(15, 46, 89));
        botaoEntrar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        botaoEntrar.setForeground(new java.awt.Color(255, 255, 255));
        botaoEntrar.setText("entrar");
        botaoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 460, 250, 60));

        aindaNpossuiCadastro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        aindaNpossuiCadastro.setForeground(new java.awt.Color(15, 46, 89));
        aindaNpossuiCadastro.setText("Ainda não possui cadastro?");
        getContentPane().add(aindaNpossuiCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 550, -1, -1));

        botaoFazercad.setForeground(new java.awt.Color(15, 46, 89));
        botaoFazercad.setText("fazer cadastro");
        botaoFazercad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(15, 46, 89)));
        botaoFazercad.setFocusPainted(false);
        botaoFazercad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFazercadActionPerformed(evt);
            }
        });
        getContentPane().add(botaoFazercad, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 580, 110, -1));

        mensagemDeErro.setForeground(new java.awt.Color(204, 0, 0));
        mensagemDeErro.setText("senha incorreta");
        getContentPane().add(mensagemDeErro, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, 250, -1));

        fundoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetebem/Views/imagens/fundoLogin.png"))); // NOI18N
        getContentPane().add(fundoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEmailActionPerformed

    }//GEN-LAST:event_campoEmailActionPerformed

    private void campoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSenhaActionPerformed

    }//GEN-LAST:event_campoSenhaActionPerformed

    private void botaoEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEntrarActionPerformed
        String email = campoEmail.getText();
        String senha = campoSenha.getText();
        mensagemDeErro.setVisible(false);
        if (email.isEmpty() || senha.isEmpty()) {
            mensagemDeErro.setText("campos vazios");
            mensagemDeErro.setVisible(true);
        } else {
            UsuarioModel usuarioModel = new UsuarioModel();
            usuarioModel.setEmail(email);
            usuarioModel.setSenha(senha);

            UsuarioController usuarioController = new UsuarioController();
            UsuarioModel usuarioAutenticado = usuarioController.autenticarUsuario(usuarioModel);

            if (usuarioAutenticado != null) {
                usuarioLogado = usuarioController.listarUsuarioPorEmail(email);
                TelaInicial telaInicial = new TelaInicial(usuarioLogado);
                telaInicial.setVisible(true);
                dispose();
            } else {
                 mensagemDeErro.setText("email ou senha incorreta");
                mensagemDeErro.setVisible(true);
            }
        }
    }//GEN-LAST:event_botaoEntrarActionPerformed

    private void botaoFazercadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFazercadActionPerformed
        Cadastro fazerCadastro = new Cadastro();
        fazerCadastro.setVisible(true);
        this.hide();
    }//GEN-LAST:event_botaoFazercadActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aindaNpossuiCadastro;
    private javax.swing.JButton botaoEntrar;
    private javax.swing.JButton botaoFazercad;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JLabel fundoLogin;
    private javax.swing.JLabel mensagemDeErro;
    // End of variables declaration//GEN-END:variables
}
