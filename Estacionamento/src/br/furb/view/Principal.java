/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.furb.view;

import br.furb.factory.ParkFactory;
import javax.swing.JOptionPane;


/**
 *
 * @author flavioomar
 */
public class Principal extends javax.swing.JFrame {
   
    public Principal() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        try {
            ParkFactory.getFactory("Pessoa").createModel().criarDiretorio();
            ParkFactory.getFactory("Veiculo").createModel().criarDiretorio();
            ParkFactory.getFactory("Estadia").createModel().criarDiretorio();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Problemas ao criar diretórios necessários do sistema!\n" + e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imagemJLabel = new javax.swing.JLabel();
        pessoaJButton = new javax.swing.JButton();
        veiculoJButton = new javax.swing.JButton();
        estadiaJButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("StockCar");
        setName("principal"); // NOI18N
        setResizable(false);

        imagemJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagemJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/furb/image/icon-estacionamento-infra.png"))); // NOI18N
        imagemJLabel.setInheritsPopupMenu(false);

        pessoaJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/furb/image/person-add_icon-icons.com_50077.png"))); // NOI18N
        pessoaJButton.setText("Cadastrar Pessoas");
        pessoaJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pessoaJButtonActionPerformed(evt);
            }
        });

        veiculoJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/furb/image/model-s_icon-icons.com_50092.png"))); // NOI18N
        veiculoJButton.setText("Cadastrar Veículos");
        veiculoJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veiculoJButtonActionPerformed(evt);
            }
        });

        estadiaJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/furb/image/ios7-plus-outline_icon-icons.com_50195.png"))); // NOI18N
        estadiaJButton.setText("Registrar Estadia");
        estadiaJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadiaJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pessoaJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(veiculoJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(estadiaJButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(imagemJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(imagemJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pessoaJButton)
                    .addComponent(estadiaJButton)
                    .addComponent(veiculoJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void estadiaJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadiaJButtonActionPerformed
        View estadia = ParkFactory.getFactory("Estadia").createView(this);
        estadia.abreJanela();
    }//GEN-LAST:event_estadiaJButtonActionPerformed

    private void pessoaJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pessoaJButtonActionPerformed
        View pessoa = ParkFactory.getFactory("Pessoa").createView(this);
        pessoa.abreJanela();
    }//GEN-LAST:event_pessoaJButtonActionPerformed

    private void veiculoJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veiculoJButtonActionPerformed
        View veiculo = ParkFactory.getFactory("Veiculo").createView(this);
        veiculo.abreJanela();
    }//GEN-LAST:event_veiculoJButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton estadiaJButton;
    private javax.swing.JLabel imagemJLabel;
    private javax.swing.JButton pessoaJButton;
    private javax.swing.JButton veiculoJButton;
    // End of variables declaration//GEN-END:variables
}
