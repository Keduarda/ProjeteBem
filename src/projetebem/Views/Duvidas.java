package projetebem.Views;

import projetebem.Controllers.SistemaController;


public class Duvidas extends javax.swing.JFrame {

   
    public Duvidas() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoVoltar = new javax.swing.JButton();
        fundoDuvidas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de dúvidas");
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

        fundoDuvidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetebem/Views/imagens/fundoDuvidas.png"))); // NOI18N
        getContentPane().add(fundoDuvidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed

        this.hide();
        SistemaController.telaInicial.show();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JLabel fundoDuvidas;
    // End of variables declaration//GEN-END:variables
}
