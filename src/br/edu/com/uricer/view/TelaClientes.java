package br.edu.com.uricer.view;

import br.edu.com.uricer.dao.CidadeDAOImpl;
import br.edu.com.uricer.dao.ClienteDAOImpl;
import br.edu.com.uricer.model.Cidade;
import br.edu.com.uricer.model.Cliente;
import br.edu.com.uricer.util.DataBase;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Cassi
 */
public class TelaClientes extends javax.swing.JFrame {

    CidadeDAOImpl cidadeDAO = new CidadeDAOImpl();
    ClienteDAOImpl clienteDAO = new ClienteDAOImpl();
    
    public TelaClientes() {
        initComponents();
        inicializar();
        carregaTabela();
    }
    
    public void inicializar () {
        
        bt_novo_cli.setEnabled(true);
        bt_gravar_cli.setEnabled(false);
        bt_cancelar_cli.setEnabled(false);
        bt_excluir_cli.setEnabled(false);
        ed_nome_cli.setEnabled(false);
        ed_cpf.setEnabled(false);
        ed_cep.setEnabled(false);
        ed_email.setEnabled(false);
        ed_telef.setEnabled(false);
        ed_ender.setEnabled(false);
        ed_bairro.setEnabled(false);
        ed_porc.setEnabled(false);
        cb_cidade_cli.setEnabled(false);
        cidade = cidadeDAO.getCidades();
        for(Cidade c:cidade) {
            cb_cidade_cli.addItem(c.getDescricao());
        }    
    }
    private void carregaTabela() {
        try {
            clientes = new ArrayList<Cliente>();
            clienteTableModel = new ClienteTableModel(clientes);
            tb_clientes.setModel(clienteTableModel);
            clientes = clienteDAO.getClientes();
            clienteTableModel.setClientes(clientes);
            clienteTableModel.fireTableDataChanged();
        } catch (Exception ex) {
            Logger.getLogger(TelaClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void limparEdits() {
        ed_id_cli.setText("");
        ed_nome_cli.setText("");
        ed_cpf.setText("");
        ed_email.setText("");
        ed_telef.setText("");
        ed_bairro.setText("");
        ed_cep.setText("");
        ed_ender.setText("");
        ed_porc.setText("");        
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
        painelprincipal = new javax.swing.JTabbedPane();
        pn_pesquisa = new javax.swing.JPanel();
        lb_nome = new javax.swing.JLabel();
        ed_nome = new javax.swing.JTextField();
        bt_pesquisa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_clientes = new javax.swing.JTable();
        pn_cadastro = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lb_id_cli = new javax.swing.JLabel();
        ed_id_cli = new javax.swing.JTextField();
        lb_nome_cli = new javax.swing.JLabel();
        ed_nome_cli = new javax.swing.JTextField();
        lb_cpf_cli = new javax.swing.JLabel();
        ed_cpf = new javax.swing.JTextField();
        lb_email_cli = new javax.swing.JLabel();
        lb_cep_cli = new javax.swing.JLabel();
        lb_cid_cli = new javax.swing.JLabel();
        lb_bair_cli = new javax.swing.JLabel();
        lb_end_cli = new javax.swing.JLabel();
        lb_porce_cli = new javax.swing.JLabel();
        ed_email = new javax.swing.JTextField();
        ed_cep = new javax.swing.JTextField();
        ed_bairro = new javax.swing.JTextField();
        ed_ender = new javax.swing.JTextField();
        ed_porc = new javax.swing.JTextField();
        lb_telef_cli = new javax.swing.JLabel();
        ed_telef = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        bt_novo_cli = new javax.swing.JButton();
        bt_gravar_cli = new javax.swing.JButton();
        bt_excluir_cli = new javax.swing.JButton();
        bt_cancelar_cli = new javax.swing.JButton();
        cb_cidade_cli = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Borderos");
        setPreferredSize(new java.awt.Dimension(890, 541));

        painelprincipal.setPreferredSize(new java.awt.Dimension(890, 541));

        lb_nome.setText("Nome:");

        ed_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ed_nomeActionPerformed(evt);
            }
        });

        bt_pesquisa.setIcon(new javax.swing.ImageIcon("C:\\Users\\cassi\\Desktop\\Sistema de Borderô de cheques\\Bordero\\images\\pesquisar.png")); // NOI18N
        bt_pesquisa.setText("Pesquisa");
        bt_pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_pesquisaActionPerformed(evt);
            }
        });

        tb_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tb_clientes.setRowHeight(30);
        tb_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_clientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_clientes);

        javax.swing.GroupLayout pn_pesquisaLayout = new javax.swing.GroupLayout(pn_pesquisa);
        pn_pesquisa.setLayout(pn_pesquisaLayout);
        pn_pesquisaLayout.setHorizontalGroup(
            pn_pesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_pesquisaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pn_pesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 824, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pn_pesquisaLayout.createSequentialGroup()
                        .addComponent(lb_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ed_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(bt_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        pn_pesquisaLayout.setVerticalGroup(
            pn_pesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_pesquisaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pn_pesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ed_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                .addContainerGap())
        );

        painelprincipal.addTab("Pesquisa", pn_pesquisa);

        lb_id_cli.setText("ID:");

        ed_id_cli.setEnabled(false);

        lb_nome_cli.setText("Nome:");

        lb_cpf_cli.setText("CPF:");

        lb_email_cli.setText("Email:");

        lb_cep_cli.setText("CEP:");

        lb_cid_cli.setText("Cidade:");

        lb_bair_cli.setText("Bairro:");

        lb_end_cli.setText("Endereço:");

        lb_porce_cli.setText("Porcentagem:");

        lb_telef_cli.setText("Telefone:");

        jLabel1.setText("%");

        bt_novo_cli.setIcon(new javax.swing.ImageIcon("C:\\Users\\cassi\\Desktop\\Sistema de Borderô de cheques\\Bordero\\images\\novo.png")); // NOI18N
        bt_novo_cli.setText("Novo");
        bt_novo_cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_novo_cliActionPerformed(evt);
            }
        });

        bt_gravar_cli.setIcon(new javax.swing.ImageIcon("C:\\Users\\cassi\\Desktop\\Sistema de Borderô de cheques\\Bordero\\images\\gravar.png")); // NOI18N
        bt_gravar_cli.setText("Gravar");
        bt_gravar_cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_gravar_cliActionPerformed(evt);
            }
        });

        bt_excluir_cli.setIcon(new javax.swing.ImageIcon("C:\\Users\\cassi\\Desktop\\Sistema de Borderô de cheques\\Bordero\\images\\excluir.png")); // NOI18N
        bt_excluir_cli.setText("Excluir");
        bt_excluir_cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_excluir_cliActionPerformed(evt);
            }
        });

        bt_cancelar_cli.setIcon(new javax.swing.ImageIcon("C:\\Users\\cassi\\Desktop\\Sistema de Borderô de cheques\\Bordero\\images\\cancelar.png")); // NOI18N
        bt_cancelar_cli.setText("Cancelar");
        bt_cancelar_cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancelar_cliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_bair_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_cid_cli)
                            .addComponent(lb_end_cli)
                            .addComponent(lb_cep_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_porce_cli))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(ed_id_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cb_cidade_cli, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ed_ender, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ed_bairro, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ed_nome_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ed_email))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lb_telef_cli)
                                            .addComponent(lb_cpf_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ed_cep, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(ed_porc, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel1)))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(ed_cpf, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                            .addComponent(ed_telef, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                                        .addGap(171, 171, 171))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(bt_cancelar_cli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(bt_novo_cli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(bt_excluir_cli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(bt_gravar_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(19, 19, 19))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_nome_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_id_cli)
                            .addComponent(lb_email_cli))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_id_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ed_id_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lb_nome_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ed_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lb_cpf_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ed_nome_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ed_email, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ed_telef, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lb_email_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lb_telef_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ed_cep, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_cep_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_cid_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_cidade_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(lb_end_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lb_porce_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ed_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lb_bair_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(ed_ender, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ed_porc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(bt_novo_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt_gravar_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(bt_excluir_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt_cancelar_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout pn_cadastroLayout = new javax.swing.GroupLayout(pn_cadastro);
        pn_cadastro.setLayout(pn_cadastroLayout);
        pn_cadastroLayout.setHorizontalGroup(
            pn_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_cadastroLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 210, Short.MAX_VALUE))
        );
        pn_cadastroLayout.setVerticalGroup(
            pn_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_cadastroLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        painelprincipal.addTab("Cadastro", pn_cadastro);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painelprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(painelprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 72, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_novo_cliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_novo_cliActionPerformed
        // TODO add your handling code here:
        limparEdits();
        ed_nome_cli.grabFocus();
        ed_nome_cli.setEnabled(true);
        bt_novo_cli.setEnabled(false);
        bt_gravar_cli.setEnabled(true);
        bt_cancelar_cli.setEnabled(true);
        bt_excluir_cli.setEnabled(false);
        ed_cpf.setEnabled(true);
        ed_cep.setEnabled(true);
        ed_email.setEnabled(true);
        ed_telef.setEnabled(true);
        ed_ender.setEnabled(true);
        ed_bairro.setEnabled(true);
        ed_porc.setEnabled(true);
        cb_cidade_cli.setEnabled(true);
    }//GEN-LAST:event_bt_novo_cliActionPerformed

    private void bt_gravar_cliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_gravar_cliActionPerformed
        String id = ed_id_cli.getText();
        int ide;
        if ("".equals(id)) {
            ide = 0;
        } else {
            ide = Integer.parseInt(id);
        }
        String porcentagem = ed_porc.getText();
        float porc = (float) 0.0f;
        if ("".equals(porcentagem)) {
            porc = 0;
        } else {
            porc = Float.parseFloat(porcentagem);
        }
        Cliente cliente;
        try {
            cliente = new Cliente(ide, ed_nome_cli.getText(), ed_email.getText(), ed_cpf.getText(), ed_telef.getText(), ed_bairro.getText(), ed_ender.getText(), cidadeDAO.getCidadeByNome(cb_cidade_cli.getSelectedItem().toString()), ed_cep.getText(), porc);
            clienteDAO.gravar(cliente);
            limparEdits();
            ed_nome_cli.setEnabled(false);
            ed_cpf.setEnabled(false);
            ed_cep.setEnabled(false);
            ed_email.setEnabled(false);
            ed_telef.setEnabled(false);
            ed_ender.setEnabled(false);
            ed_bairro.setEnabled(false);
            ed_porc.setEnabled(false);
            cb_cidade_cli.setEnabled(false);
            carregaTabela();
            painelprincipal.setSelectedIndex(0);
            JOptionPane.showMessageDialog(this, "Gravado com sucesso", "Informação", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(TelaCidades.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(TelaClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bt_gravar_cliActionPerformed

    private void bt_excluir_cliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_excluir_cliActionPerformed
        // TODO add your handling code here:
        int resultado = JOptionPane.showConfirmDialog(this, "Confirma exclusão", "Confirmação", JOptionPane.YES_NO_CANCEL_OPTION);
        if(resultado == 0) {
            try {
                //TelaCidades.delete(Cidade);
                clienteDAO.delete(cliente);
                painelprincipal.setSelectedIndex(0);
            } catch (Exception ex) {
                Logger.getLogger(TelaClientes.class.getName()).log(Level.SEVERE, null, ex);
            }
            carregaTabela();
            limparEdits();
            bt_novo_cli.setEnabled(true);
            bt_gravar_cli.setEnabled(false);
            bt_cancelar_cli.setEnabled(false);
            bt_excluir_cli.setEnabled(false);            
            ed_nome_cli.setEnabled(false);
            ed_cpf.setEnabled(false);
            ed_cep.setEnabled(false);
            ed_email.setEnabled(false);
            ed_telef.setEnabled(false);
            ed_ender.setEnabled(false);
            ed_bairro.setEnabled(false);
            ed_porc.setEnabled(false);
            cb_cidade_cli.setEnabled(false);
            
        }
    }//GEN-LAST:event_bt_excluir_cliActionPerformed

    private void bt_cancelar_cliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelar_cliActionPerformed
        // TODO add your handling code here:
        limparEdits();
        ed_nome_cli.grabFocus();
        bt_novo_cli.setEnabled(true);
        bt_gravar_cli.setEnabled(false);
        bt_cancelar_cli.setEnabled(false);
        bt_excluir_cli.setEnabled(false);
        ed_nome_cli.setEnabled(false);
        ed_cpf.setEnabled(false);
        ed_cep.setEnabled(false);
        ed_email.setEnabled(false);
        ed_telef.setEnabled(false);
        ed_ender.setEnabled(false);
        ed_bairro.setEnabled(false);
        ed_porc.setEnabled(false);
        cb_cidade_cli.setEnabled(false);
    }//GEN-LAST:event_bt_cancelar_cliActionPerformed

    private void bt_pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_pesquisaActionPerformed
        try {
            clientes = clienteDAO.findByNome(ed_nome.getText());
            clienteTableModel.setClientes(clientes);
            clienteTableModel.fireTableDataChanged();
        } catch (Exception ex) {
            Logger.getLogger(CidadeDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//GEN-LAST:event_bt_pesquisaActionPerformed

    private void tb_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_clientesMouseClicked
        if(evt.getClickCount() == 2) {
            cliente = clientes.get(tb_clientes.getSelectedRow());
            clienteParaEdit();
            painelprincipal.setSelectedIndex(1);
            ed_nome.setEnabled(true);
            bt_novo_cli.setEnabled(false);
            bt_gravar_cli.setEnabled(true);
            bt_cancelar_cli.setEnabled(true);
            bt_excluir_cli.setEnabled(true);            
            ed_nome_cli.setEnabled(true);
            ed_cpf.setEnabled(true);
            ed_cep.setEnabled(true);
            ed_email.setEnabled(true);
            ed_telef.setEnabled(true);
            ed_ender.setEnabled(true);
            ed_bairro.setEnabled(true);
            ed_porc.setEnabled(true);
            cb_cidade_cli.setEnabled(true);
        }
    }//GEN-LAST:event_tb_clientesMouseClicked

    private void ed_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ed_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ed_nomeActionPerformed
    
    private void clienteParaEdit() {
        ed_id_cli.setText(cliente.getId().toString());
        ed_nome_cli.setText(cliente.getNome());
        ed_cpf.setText(cliente.getCpf());
        ed_email.setText(cliente.getEmail());
        ed_telef.setText(cliente.getTelefone());
        ed_cep.setText(cliente.getCep());
        ed_bairro.setText(cliente.getBairro());
        ed_ender.setText(cliente.getEndereco());
        ed_porc.setText(Float.toString(cliente.getPorcentagem()));
        cb_cidade_cli.getModel().setSelectedItem(cliente.getId_cidade().getDescricao());
    }
    
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
            java.util.logging.Logger.getLogger(TelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cancelar_cli;
    private javax.swing.JButton bt_excluir_cli;
    private javax.swing.JButton bt_gravar_cli;
    private javax.swing.JButton bt_novo_cli;
    private javax.swing.JButton bt_pesquisa;
    private javax.swing.JComboBox<String> cb_cidade_cli;
    private javax.swing.JTextField ed_bairro;
    private javax.swing.JTextField ed_cep;
    private javax.swing.JTextField ed_cpf;
    private javax.swing.JTextField ed_email;
    private javax.swing.JTextField ed_ender;
    private javax.swing.JTextField ed_id_cli;
    private javax.swing.JTextField ed_nome;
    private javax.swing.JTextField ed_nome_cli;
    private javax.swing.JTextField ed_porc;
    private javax.swing.JTextField ed_telef;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_bair_cli;
    private javax.swing.JLabel lb_cep_cli;
    private javax.swing.JLabel lb_cid_cli;
    private javax.swing.JLabel lb_cpf_cli;
    private javax.swing.JLabel lb_email_cli;
    private javax.swing.JLabel lb_end_cli;
    private javax.swing.JLabel lb_id_cli;
    private javax.swing.JLabel lb_nome;
    private javax.swing.JLabel lb_nome_cli;
    private javax.swing.JLabel lb_porce_cli;
    private javax.swing.JLabel lb_telef_cli;
    private javax.swing.JTabbedPane painelprincipal;
    private javax.swing.JPanel pn_cadastro;
    private javax.swing.JPanel pn_pesquisa;
    private javax.swing.JTable tb_clientes;
    // End of variables declaration//GEN-END:variables
  
    private Cliente cliente;
    //private CidadeDAOImpl cidadeDAO;
    private List<Cidade> cidade;
    private List<Cliente> clientes;
    private ClienteTableModel clienteTableModel;
}
