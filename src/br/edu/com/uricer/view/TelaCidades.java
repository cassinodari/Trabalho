package br.edu.com.uricer.view;

import br.edu.com.uricer.dao.CidadeDAO;
import br.edu.com.uricer.dao.CidadeDAOImpl;
import br.edu.com.uricer.dao.PessoaDAO;
import br.edu.com.uricer.model.Cidade;
import br.edu.com.uricer.model.Pessoa;
import br.edu.com.uricer.model.Uf;
import br.edu.com.uricer.util.DataBase;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cassi
 */
public class TelaCidades extends javax.swing.JFrame {
    
    CidadeDAOImpl cidadeDAO = new CidadeDAOImpl();
   
    /**
     * Creates new form Cidades
     */
    public TelaCidades() {
        initComponents();
        carregaCidades();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jp_cidades = new javax.swing.JScrollPane();
        tb_cidades = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        bt_pesquisar = new javax.swing.JButton();
        tf_pesquisar = new javax.swing.JTextField();
        lb_pesquisar = new javax.swing.JLabel();
        bt_novo = new javax.swing.JButton();
        bt_excluir = new javax.swing.JButton();
        bt_gravar = new javax.swing.JButton();
        bt_cancelar = new javax.swing.JButton();
        cb_uf = new javax.swing.JComboBox<>();
        lb_uf = new javax.swing.JLabel();
        tf_descricao = new javax.swing.JTextField();
        lb_cidade = new javax.swing.JLabel();
        lb_id = new javax.swing.JLabel();
        tf_id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Cidades");
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(910, 552));

        tb_cidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Título 1", "Título 2", "Título 3", "Título 4"
            }
        ));
        tb_cidades.setName(""); // NOI18N
        tb_cidades.setRowHeight(30);
        tb_cidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_cidadesMouseClicked(evt);
            }
        });
        jp_cidades.setViewportView(tb_cidades);

        bt_pesquisar.setIcon(new javax.swing.ImageIcon("C:\\Users\\cassi\\Desktop\\Sistema de Borderô de cheques\\Bordero\\images\\pesquisar.png")); // NOI18N
        bt_pesquisar.setText("Pesquisar");
        bt_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_pesquisarActionPerformed(evt);
            }
        });

        tf_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_pesquisarActionPerformed(evt);
            }
        });

        lb_pesquisar.setText("Pesquisar:");

        bt_novo.setIcon(new javax.swing.ImageIcon("C:\\Users\\cassi\\Desktop\\Sistema de Borderô de cheques\\Bordero\\images\\novo.png")); // NOI18N
        bt_novo.setText("Novo");
        bt_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_novoActionPerformed(evt);
            }
        });

        bt_excluir.setIcon(new javax.swing.ImageIcon("C:\\Users\\cassi\\Desktop\\Sistema de Borderô de cheques\\Bordero\\images\\excluir.png")); // NOI18N
        bt_excluir.setText("Excluir");
        bt_excluir.setAlignmentX(0.5F);
        bt_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_excluirActionPerformed(evt);
            }
        });

        bt_gravar.setIcon(new javax.swing.ImageIcon("C:\\Users\\cassi\\Desktop\\Sistema de Borderô de cheques\\Bordero\\images\\gravar.png")); // NOI18N
        bt_gravar.setText("Gravar");
        bt_gravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_gravarActionPerformed(evt);
            }
        });

        bt_cancelar.setIcon(new javax.swing.ImageIcon("C:\\Users\\cassi\\Desktop\\Sistema de Borderô de cheques\\Bordero\\images\\cancelar.png")); // NOI18N
        bt_cancelar.setText("Cancelar");
        bt_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancelarActionPerformed(evt);
            }
        });

        cb_uf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_ufActionPerformed(evt);
            }
        });

        lb_uf.setText("UF:");

        tf_descricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_descricaoActionPerformed(evt);
            }
        });

        lb_cidade.setText("Cidade:");

        lb_id.setText("ID: ");

        tf_id.setEnabled(false);
        tf_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_idActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 749, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lb_pesquisar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tf_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(bt_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator1)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lb_id)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lb_cidade)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(bt_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt_gravar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(bt_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(tf_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lb_uf)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cb_uf, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jp_cidades, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 552, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lb_id)
                        .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lb_cidade)
                        .addComponent(tf_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lb_uf)
                        .addComponent(cb_uf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(26, 26, 26)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bt_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bt_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bt_gravar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bt_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lb_pesquisar)
                        .addComponent(tf_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bt_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(jp_cidades, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void carregaCidades() {
        tf_descricao.setEnabled(false);
        bt_gravar.setEnabled(false);
        bt_excluir.setEnabled(false);
        bt_cancelar.setEnabled(false);
        cb_uf.setEnabled(false);
        cidades = new ArrayList<Cidade>();
        cidadeTableModel = new CidadeTableModel(cidades);
        tb_cidades.setModel(cidadeTableModel);
        cidades = cidadeDAO.getCidades();
        cidadeTableModel.setCidades(cidades);
        cidadeTableModel.fireTableDataChanged();
        
        ufs = cidadeDAO.getUFS();
        for(Uf u:ufs) {
            cb_uf.addItem(u.getUf());
        }
    }
    
    
    private void bt_gravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_gravarActionPerformed
        String id = tf_id.getText();
        int ide;
        if ("".equals(id)) {
            ide = 0;
        } else {
            ide = Integer.parseInt(id);
        }
        Cidade cidade = new Cidade(ide, tf_descricao.getText().toString(), cidadeDAO.getUFByUF(cb_uf.getSelectedItem().toString()));
        JOptionPane.showMessageDialog(this, "Gravado com sucesso", "Informação", JOptionPane.INFORMATION_MESSAGE);
        try {
            cidadeDAO.gravar(cidade);
            carregaCidades();
        } catch (Exception ex) {
            Logger.getLogger(TelaCidades.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bt_gravarActionPerformed

    private void bt_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_excluirActionPerformed

        int resultado = JOptionPane.showConfirmDialog(this, "Confirma exclusão", "Confirmação", JOptionPane.YES_NO_CANCEL_OPTION);
        if(resultado == 0) {
            try {
                //TelaCidades.delete(Cidade);
                cidadeDAO.delete(cidade);
            } catch (SQLException ex) {
                Logger.getLogger(TelaCidades.class.getName()).log(Level.SEVERE, null, ex);
            }
            carregaCidades();
            limparEdits();
            bt_excluir.setEnabled(false);
            bt_cancelar.setEnabled(false);
        }
    }//GEN-LAST:event_bt_excluirActionPerformed

    private void tf_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_idActionPerformed

    private void bt_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelarActionPerformed
        // TODO add your handling code here:
        limparEdits();
        bt_novo.setEnabled(true);
        bt_gravar.setEnabled(false);
        bt_cancelar.setEnabled(false);
        bt_excluir.setEnabled(false);
        cb_uf.setEnabled(false);
        tf_descricao.setEnabled(false);
    }//GEN-LAST:event_bt_cancelarActionPerformed

    private void tf_descricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_descricaoActionPerformed
        // TODO add your handling code here:    
        
    }//GEN-LAST:event_tf_descricaoActionPerformed

    private void bt_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_novoActionPerformed
        // TODO add your handling code here:
        //Cidade = new cidade();
        limparEdits();
        tf_descricao.grabFocus();
        tf_descricao.setEnabled(true);
        bt_novo.setEnabled(false);
        bt_gravar.setEnabled(true);
        bt_cancelar.setEnabled(true);
        bt_excluir.setEnabled(false);
        cb_uf.setEnabled(true);
    }//GEN-LAST:event_bt_novoActionPerformed

    private void bt_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_pesquisarActionPerformed
        try {
            cidades = cidadeDAO.findByNome(tf_pesquisar.getText());
            cidadeTableModel.setCidades(cidades);
            cidadeTableModel.fireTableDataChanged();
        } catch (Exception ex) {
            Logger.getLogger(CidadeDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bt_pesquisarActionPerformed

    private void cb_ufActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_ufActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_ufActionPerformed

    private void tb_cidadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_cidadesMouseClicked
                                    
        // TODO add your handling code here:
        if(evt.getClickCount() == 2) {
            int cid = cidades.get(tb_cidades.getSelectedRow()).getId();
            try {
                cidade = cidadeDAO.findById(cid);
            } catch (Exception ex) {
                Logger.getLogger(TelaCidades.class.getName()).log(Level.SEVERE, null, ex);
            }
            cidadeParaEdit();
            //painelPrincipal.setSelectedIndex(1);
            tf_descricao.setEnabled(true);
            bt_novo.setEnabled(false);
            bt_gravar.setEnabled(true);
            bt_cancelar.setEnabled(true);
            bt_excluir.setEnabled(true);
            cb_uf.setEnabled(true);
        }
    }//GEN-LAST:event_tb_cidadesMouseClicked

    private void tf_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_pesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_pesquisarActionPerformed

    private void limparEdits() {
        tf_descricao.setText("");
    }    
    
    private void editParaCidade() {
        if(tf_id.getText() != null && !tf_id.getText().isEmpty()) {
            cidade.setId(Integer.parseInt(tf_id.getText()));
        }
        cidade.setDescricao(tf_descricao.getText());
    }

    private void cidadeParaEdit() {
        tf_id.setText(cidade.getId().toString());
        tf_descricao.setText(cidade.getDescricao());
        //System.out.println(cidade.getUf().getId());
        cb_uf.getModel().setSelectedItem(cidade.getUf().getUf());
    }
    
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
            java.util.logging.Logger.getLogger(TelaCidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCidades().setVisible(true);
            }
        });       
       }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cancelar;
    private javax.swing.JButton bt_excluir;
    private javax.swing.JButton bt_gravar;
    private javax.swing.JButton bt_novo;
    private javax.swing.JButton bt_pesquisar;
    private javax.swing.JComboBox<String> cb_uf;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JScrollPane jp_cidades;
    private javax.swing.JLabel lb_cidade;
    private javax.swing.JLabel lb_id;
    private javax.swing.JLabel lb_pesquisar;
    private javax.swing.JLabel lb_uf;
    private javax.swing.JTable tb_cidades;
    private javax.swing.JTextField tf_descricao;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_pesquisar;
    // End of variables declaration//GEN-END:variables
    private Cidade cidade;
    //private CidadeDAOImpl cidadeDAO;
    private List<Cidade> cidades;
    private CidadeTableModel cidadeTableModel;
    private List<Uf> ufs;
}
