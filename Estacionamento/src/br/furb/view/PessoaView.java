/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.furb.view;

import br.furb.Pessoa;
import br.furb.controller.Controller;
import br.furb.factory.ParkFactory;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author flavioomar
 */
public class PessoaView extends javax.swing.JDialog implements View {

    /**
     * Creates new form PessoaView
     */
    
    public PessoaView(Object parent) {
        super((JFrame) parent, true);
        initComponents();  
        setLocationRelativeTo(null);
        this.atualizaTabela();
        pessoasJTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (e.getValueIsAdjusting())
                    return;
                int selected = pessoasJTable.getSelectedRow();
                cpfJFormattedTextField.setText((String) pessoasJTable.getValueAt(selected, 0));
                nomeJTextField.setText((String) pessoasJTable.getValueAt(selected, 1));
            }
        });
    }
    
    public PessoaView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nomeJTextField = new javax.swing.JTextField();
        cpfJLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pessoasJTable = new javax.swing.JTable();
        lblPessoaNome = new javax.swing.JLabel();
        cpfJFormattedTextField = new javax.swing.JFormattedTextField();
        salvarJButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Pessoas");
        setModal(true);
        setResizable(false);

        cpfJLabel.setText("CPF:");

        pessoasJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(pessoasJTable);

        lblPessoaNome.setText("Nome:");

        try {
            cpfJFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpfJFormattedTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfJFormattedTextFieldActionPerformed(evt);
            }
        });

        salvarJButton.setText("Salvar");
        salvarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(salvarJButton)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPessoaNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nomeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cpfJLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cpfJFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPessoaNome)
                    .addComponent(nomeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpfJFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpfJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(salvarJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cpfJFormattedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfJFormattedTextFieldActionPerformed

    }//GEN-LAST:event_cpfJFormattedTextFieldActionPerformed

    private void salvarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarJButtonActionPerformed
        try {
            Pessoa pessoa = new Pessoa();
            pessoa.setCpf(cpfJFormattedTextField.getText());
            pessoa.setNome(nomeJTextField.getText());
            if (this.recuperar(pessoa.getCpf()) != null){
                String message = "Já exite uma pessoa cadastrada com esta CPF, deseja substituir?";
                String title = "Confirmação";
                int reply = JOptionPane.showConfirmDialog(this, message, title, JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION){
                    this.salvar(pessoa);
                    this.atualizaTabela();
                }
            } else {
                this.salvar(pessoa);
                this.atualizaTabela();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_salvarJButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PessoaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PessoaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PessoaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PessoaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PessoaView dialog = new PessoaView(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField cpfJFormattedTextField;
    private javax.swing.JLabel cpfJLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPessoaNome;
    private javax.swing.JTextField nomeJTextField;
    private javax.swing.JTable pessoasJTable;
    private javax.swing.JButton salvarJButton;
    // End of variables declaration//GEN-END:variables

    @Override
    public void salvar(Object info) {
        Controller pessoaController = ParkFactory.getFactory("Pessoa").createController();
        try {
            pessoaController.salvar(info);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar a pessoa!\n" + ex.getMessage());
        }
    }

    @Override
    public Object recuperar(String chave) {
        Controller pessoaController = ParkFactory.getFactory("Pessoa").createController();
        try {
            return pessoaController.recuperar(chave);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List recuperar() {
        Controller pessoaController = ParkFactory.getFactory("Pessoa").createController();
        try {
            return pessoaController.recuperar();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao recuperar registros!\n" + ex.getMessage());
        }
        return null;
    }

    @Override
    public void abreJanela() {
        this.setVisible(true);
    }

    @Override
    public Object abreJanelaSelecao() {
        nomeJTextField.setEnabled(false);
        cpfJFormattedTextField.setEnabled(false);
        salvarJButton.setEnabled(false);
        this.abreJanela();
        return this.recuperar(cpfJFormattedTextField.getText());
    }
    
    @Override
    public void atualizaTabela() {
        DefaultTableModel dtm = new DefaultTableModel(new String[]{"CPF", "Nome"}, 0);
        LinkedList<Pessoa> pessoas = (LinkedList) this.recuperar();
        pessoas.sort(null);
        for (Pessoa pessoa : pessoas) {
            dtm.addRow(new String[]{pessoa.getCpf(), pessoa.getNome()});
        }
        pessoasJTable.setModel((TableModel) dtm);
    }
}
