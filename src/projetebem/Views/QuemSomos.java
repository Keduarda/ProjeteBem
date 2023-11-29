package projetebem.Views;

import projetebem.Controllers.SistemaController;

public class QuemSomos extends javax.swing.JFrame {

    
    public QuemSomos() {
        initComponents();
        //SistemaController.quemSomos = this;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoVoltar = new javax.swing.JButton();
        fundoQuemSomos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela quem somos");
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

        fundoQuemSomos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetebem/Views/imagens/fundoQuemSomos.png"))); // NOI18N
        getContentPane().add(fundoQuemSomos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed

        this.hide();
        SistemaController.telaInicial.show();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JLabel fundoQuemSomos;
    // End of variables declaration//GEN-END:variables
}
