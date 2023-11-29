package projetebem.Views;

import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import projetebem.Controllers.SistemaController;
import projetebem.Controllers.UsuarioController;

public class Contatos extends javax.swing.JFrame {

    private ResultSet rs;
    private UsuarioController usuarioController;
    
    public Contatos() {
        initComponents();
        usuarioController = new UsuarioController();
        popularTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        painelRecursosHumanos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaContatos = new javax.swing.JTable();
        fundoContatos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de contatos");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, 90, 30));
        botaoVoltar.setOpaque(false);

        botaoVoltar.setContentAreaFilled(false);

        botaoVoltar.setBorderPainted(false);

        jLabel1.setBackground(new java.awt.Color(239, 216, 205));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(239, 216, 205));
        jLabel1.setText("contatos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, -1, -1));

        painelRecursosHumanos.setBackground(new java.awt.Color(239, 216, 205));
        painelRecursosHumanos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabelaContatos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tabelaContatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "nome", "e-mail", "setor", "telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaContatos.setGridColor(new java.awt.Color(51, 51, 51));
        tabelaContatos.setRowHeight(40);
        tabelaContatos.setShowGrid(true);
        jScrollPane1.setViewportView(tabelaContatos);

        painelRecursosHumanos.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 850, 470));

        getContentPane().add(painelRecursosHumanos, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 890, 510));

        fundoContatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetebem/Views/imagens/fundoContatos.png"))); // NOI18N
        getContentPane().add(fundoContatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        //new TelaInicial().setVisible(true);
        this.hide();
        SistemaController.telaInicial.show();
        //this.dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void popularTabela(){
        try{
            DefaultTableModel model = (DefaultTableModel) tabelaContatos.getModel();
            model.setRowCount(0);
            rs = usuarioController.listarUsuarios();

            while(rs.next()){
                Object[] rowData = {
                    rs.getObject(2),
                    rs.getObject(3),
                    rs.getObject(5),
                    rs.getObject(6),
                };
                
                model.addRow(rowData);
            }
        }catch(SQLException erro){
            System.out.println("Erro ao carregar a tabela de contatos.");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JLabel fundoContatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel painelRecursosHumanos;
    private javax.swing.JTable tabelaContatos;
    // End of variables declaration//GEN-END:variables
}
