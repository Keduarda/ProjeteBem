package projetebem.Views;

import java.util.concurrent.TimeUnit;
import javax.swing.SwingUtilities;
import projetebem.Controllers.ProjetosController;
import projetebem.Models.ProjetosModel;
import projetebem.Controllers.SistemaController;

public class CadastrarTarefa extends javax.swing.JFrame {

    private ProjetosController projetosController;
    private ProjetosModel projetosModel;
    
    public CadastrarTarefa() {
        
        initComponents();
        mensagemErro.setVisible(false);
        mensagemCerto.setVisible(false);
        projetosController = new ProjetosController();
        projetosModel = new ProjetosModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cadastrarTarefa = new javax.swing.JLabel();
        campoColaboradores = new javax.swing.JTextField();
        campoData = new javax.swing.JTextField();
        campoNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        botaoCriar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoDescricao = new javax.swing.JTextArea();
        ComboBoxSetor = new javax.swing.JComboBox<>();
        mensagemCerto = new javax.swing.JLabel();
        mensagemErro = new javax.swing.JLabel();
        botaoVoltar = new javax.swing.JButton();
        fundoCadastroTarefa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela criação de tarefa");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cadastrarTarefa.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        cadastrarTarefa.setForeground(new java.awt.Color(15, 46, 89));
        cadastrarTarefa.setText("criar tarefa");
        getContentPane().add(cadastrarTarefa, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 158, -1, 50));

        campoColaboradores.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoColaboradores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoColaboradoresActionPerformed(evt);
            }
        });
        getContentPane().add(campoColaboradores, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 510, 360, -1));

        campoData.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDataActionPerformed(evt);
            }
        });
        getContentPane().add(campoData, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, 360, -1));

        campoNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(campoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 360, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(15, 46, 89));
        jLabel1.setText("data");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(15, 46, 89));
        jLabel2.setText("setor");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(15, 46, 89));
        jLabel3.setText("descrição");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(15, 46, 89));
        jLabel4.setText("colaboradores");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 480, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(15, 46, 89));
        jLabel5.setText("nome");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, -1, -1));

        botaoCriar.setBackground(new java.awt.Color(15, 46, 89));
        botaoCriar.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        botaoCriar.setForeground(new java.awt.Color(255, 255, 255));
        botaoCriar.setText("criar");
        botaoCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCriarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCriar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 560, 210, -1));

        campoDescricao.setColumns(20);
        campoDescricao.setRows(5);
        jScrollPane1.setViewportView(campoDescricao);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 360, 60));

        ComboBoxSetor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ComboBoxSetor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "administrativo", "comercial", "compras ", "financeiro", "marketing", "operacoes", "recursos humanos" }));
        getContentPane().add(ComboBoxSetor, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, 360, -1));

        mensagemCerto.setForeground(new java.awt.Color(0, 204, 0));
        mensagemCerto.setText("jLabel6");
        getContentPane().add(mensagemCerto, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 620, -1, -1));

        mensagemErro.setForeground(new java.awt.Color(204, 0, 0));
        mensagemErro.setText("jLabel6");
        getContentPane().add(mensagemErro, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 620, -1, -1));

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

        fundoCadastroTarefa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetebem/Views/imagens/fundoCadastroTarefa.png"))); // NOI18N
        getContentPane().add(fundoCadastroTarefa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campoColaboradoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoColaboradoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoColaboradoresActionPerformed

    private void botaoCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCriarActionPerformed
        String nome = campoNome.getText();
        String descricao = campoDescricao.getText();
        String data = campoData.getText();
        String setor = ComboBoxSetor.getSelectedItem().toString();
        String colaboradores = campoColaboradores.getText();
        
        mensagemErro.setVisible(false);
        mensagemCerto.setVisible(false);
        
        if(nome.isEmpty() || descricao.isEmpty() || data.isEmpty() || setor.isEmpty() || colaboradores.isEmpty()){
            mensagemErro.setText("campos vazios!");
            mensagemErro.setVisible(true);
        }else{
                    projetosModel.setNome(campoNome.getText());
                    projetosModel.setDescricao(campoDescricao.getText());
                    projetosModel.setData(campoData.getText());
                    projetosModel.setSetor(ComboBoxSetor.getSelectedItem().toString());
                    projetosModel.setColaborador(campoColaboradores.getText());

                    projetosController.cadastrarProjeto(projetosModel, ComboBoxSetor.getSelectedItem().toString());
                    
                    mensagemCerto.setText("Projeto cadastrado com sucesso.");
                    mensagemCerto.setVisible(true); 
                    
                        
                        campoNome.setText("");
                        campoDescricao.setText("");
                        campoData.setText("");
                        campoColaboradores.setText("");
                       
                        try{               
                            //Thread.sleep(3000);
                            TimeUnit.SECONDS.sleep(3);
                        }
                        catch(InterruptedException x) { }
                        SwingUtilities.invokeLater(() -> {
                        this.dispose();
                        SistemaController.telaInicial.show();
                        });
                        // this.hide();
                        // SistemaController.telaInicial.show();
             }     
    }//GEN-LAST:event_botaoCriarActionPerformed

    private void campoDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDataActionPerformed
         this.dispose();
         SistemaController.telaInicial.show();
    }//GEN-LAST:event_campoDataActionPerformed

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed

    }//GEN-LAST:event_botaoVoltarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxSetor;
    private javax.swing.JButton botaoCriar;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JLabel cadastrarTarefa;
    private javax.swing.JTextField campoColaboradores;
    private javax.swing.JTextField campoData;
    private javax.swing.JTextArea campoDescricao;
    private javax.swing.JTextField campoNome;
    private javax.swing.JLabel fundoCadastroTarefa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mensagemCerto;
    private javax.swing.JLabel mensagemErro;
    // End of variables declaration//GEN-END:variables
}
