/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.com.uricer.view;

import br.edu.com.uricer.dao.BorderoDAO;
import br.edu.com.uricer.dao.CidadeDAOImpl;
import br.edu.com.uricer.dao.ClienteDAOImpl;
import br.edu.com.uricer.model.Bordero;
import br.edu.com.uricer.model.Cidade;
import br.edu.com.uricer.model.Cliente;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author Cassi
 */
public class TelaBorderos extends javax.swing.JFrame {

   // BorderoDAOImpl borderoDAO = new BorderoDAOImpl();
    
    /**
     * Creates new form TelaBorderos
     */
    public TelaBorderos() {
        initComponents();
    //    inicializar();
    }
    /*private void inicializar() {
        try {
            cidadeDAO = new CidadeDAOImpl();
            clienteDAO = new ClienteDAOImpl();
            borderoDAO = new BorderoDAOImlp();
        } catch (Exception ex) {
            Logger.getLogger(TelaClientes.class.getName()).log(Level.SEVERE, null, ex);
        }

        //pessoas = new ArrayList<>();
        //pessoaTableModel = new PessoaTableModel(pessoas);
        //tbPessoas.setModel(pessoaTableModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ed_banco = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        painelprincipal = new javax.swing.JTabbedPane();
        pn_pesquisa = new javax.swing.JPanel();
        lb_nome = new javax.swing.JLabel();
        ed_nome = new javax.swing.JTextField();
        bt_pesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_bordero = new javax.swing.JTable();
        pn_cadastro = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lb_id = new javax.swing.JLabel();
        ed_id = new javax.swing.JTextField();
        lb_nome_bor = new javax.swing.JLabel();
        ed_nome_bor = new javax.swing.JTextField();
        lb_porc = new javax.swing.JLabel();
        ed_porc = new javax.swing.JTextField();
        lb_porce = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        painel_cadastroo = new javax.swing.JPanel();
        lb_cpf = new javax.swing.JLabel();
        ed_cpf = new javax.swing.JTextField();
        lb_numerp = new javax.swing.JLabel();
        ed_numero = new javax.swing.JTextField();
        lb_dataini = new javax.swing.JLabel();
        ed_dataini = new javax.swing.JTextField();
        lb_donocheque = new javax.swing.JLabel();
        ed_donocheque = new javax.swing.JTextField();
        lb_datafin = new javax.swing.JLabel();
        ed_datafin = new javax.swing.JTextField();
        lb_banco = new javax.swing.JLabel();
        ed_banco_cli = new javax.swing.JTextField();
        ed_dias = new javax.swing.JLabel();
        ed_dias_bord = new javax.swing.JTextField();
        lb_valor = new javax.swing.JLabel();
        ed_valor = new javax.swing.JTextField();
        lb_juro = new javax.swing.JLabel();
        ed_juro = new javax.swing.JTextField();
        bt_novo1 = new javax.swing.JButton();
        bt_gravar1 = new javax.swing.JButton();
        bt_excluir1 = new javax.swing.JButton();
        bt_cancelar1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_cadas_bordero = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(890, 541));

        painelprincipal.setPreferredSize(new java.awt.Dimension(890, 541));

        lb_nome.setText("Nome:");

        ed_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ed_nomeActionPerformed(evt);
            }
        });

        bt_pesquisar.setIcon(new javax.swing.ImageIcon("C:\\Users\\cassi\\Desktop\\Sistema de Borderô de cheques\\Bordero\\images\\pesquisar.png")); // NOI18N
        bt_pesquisar.setText("Pesquisar");

        tb_bordero.setModel(new javax.swing.table.DefaultTableModel(
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
        tb_bordero.setRowHeight(30);
        jScrollPane1.setViewportView(tb_bordero);

        javax.swing.GroupLayout pn_pesquisaLayout = new javax.swing.GroupLayout(pn_pesquisa);
        pn_pesquisa.setLayout(pn_pesquisaLayout);
        pn_pesquisaLayout.setHorizontalGroup(
            pn_pesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_pesquisaLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(pn_pesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 807, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pn_pesquisaLayout.createSequentialGroup()
                        .addComponent(lb_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ed_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(bt_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        pn_pesquisaLayout.setVerticalGroup(
            pn_pesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_pesquisaLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(pn_pesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ed_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
                .addContainerGap())
        );

        painelprincipal.addTab("Pesquisa", pn_pesquisa);

        jPanel2.setPreferredSize(new java.awt.Dimension(885, 513));
        jPanel2.setRequestFocusEnabled(false);

        lb_id.setText("ID:");

        ed_id.setEnabled(false);

        lb_nome_bor.setText("Cliente:");

        lb_porc.setText("Porcentagem:");

        lb_porce.setText("%");

        lb_cpf.setText("CPF/CNPJ:");

        lb_numerp.setText("Número:");

        lb_dataini.setText("Data Inicial:");

        lb_donocheque.setText("Dono do Cheque:");

        lb_datafin.setText("Data Final:");

        lb_banco.setText("Banco:");

        ed_dias.setText("Dias:");

        lb_valor.setText("Valor:");

        lb_juro.setText("Juro:");

        bt_novo1.setIcon(new javax.swing.ImageIcon("C:\\Users\\cassi\\Desktop\\Sistema de Borderô de cheques\\Bordero\\images\\novo.png")); // NOI18N
        bt_novo1.setText("Novo");
        bt_novo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_novo1ActionPerformed(evt);
            }
        });

        bt_gravar1.setIcon(new javax.swing.ImageIcon("C:\\Users\\cassi\\Desktop\\Sistema de Borderô de cheques\\Bordero\\images\\gravar.png")); // NOI18N
        bt_gravar1.setText("Gravar");
        bt_gravar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_gravar1ActionPerformed(evt);
            }
        });

        bt_excluir1.setIcon(new javax.swing.ImageIcon("C:\\Users\\cassi\\Desktop\\Sistema de Borderô de cheques\\Bordero\\images\\excluir.png")); // NOI18N
        bt_excluir1.setText("Excluir");
        bt_excluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_excluir1ActionPerformed(evt);
            }
        });

        bt_cancelar1.setIcon(new javax.swing.ImageIcon("C:\\Users\\cassi\\Desktop\\Sistema de Borderô de cheques\\Bordero\\images\\cancelar.png")); // NOI18N
        bt_cancelar1.setText("Cancelar");
        bt_cancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancelar1ActionPerformed(evt);
            }
        });

        tb_cadas_bordero.setModel(new javax.swing.table.DefaultTableModel(
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
        tb_cadas_bordero.setRowHeight(30);
        jScrollPane2.setViewportView(tb_cadas_bordero);

        javax.swing.GroupLayout painel_cadastrooLayout = new javax.swing.GroupLayout(painel_cadastroo);
        painel_cadastroo.setLayout(painel_cadastrooLayout);
        painel_cadastrooLayout.setHorizontalGroup(
            painel_cadastrooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_cadastrooLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_cadastrooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painel_cadastrooLayout.createSequentialGroup()
                        .addGroup(painel_cadastrooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painel_cadastrooLayout.createSequentialGroup()
                                .addGroup(painel_cadastrooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painel_cadastrooLayout.createSequentialGroup()
                                        .addComponent(ed_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ed_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ed_donocheque, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(painel_cadastrooLayout.createSequentialGroup()
                                        .addComponent(lb_cpf)
                                        .addGap(69, 69, 69)
                                        .addComponent(lb_numerp)
                                        .addGap(43, 43, 43)
                                        .addComponent(lb_donocheque)))
                                .addGap(18, 18, 18)
                                .addGroup(painel_cadastrooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ed_dataini, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lb_dataini))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(painel_cadastrooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_datafin)
                                    .addComponent(ed_datafin, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painel_cadastrooLayout.createSequentialGroup()
                                .addGroup(painel_cadastrooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(painel_cadastrooLayout.createSequentialGroup()
                                        .addGroup(painel_cadastrooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(painel_cadastrooLayout.createSequentialGroup()
                                                .addComponent(lb_banco, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(ed_banco_cli))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(painel_cadastrooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ed_dias_bord, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ed_dias))
                                        .addGap(29, 29, 29)
                                        .addGroup(painel_cadastrooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(painel_cadastrooLayout.createSequentialGroup()
                                                .addComponent(lb_valor)
                                                .addGap(58, 58, 58)
                                                .addComponent(lb_juro))
                                            .addGroup(painel_cadastrooLayout.createSequentialGroup()
                                                .addComponent(ed_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(ed_juro, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(painel_cadastrooLayout.createSequentialGroup()
                                        .addComponent(bt_novo1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(bt_gravar1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(bt_excluir1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bt_cancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 64, Short.MAX_VALUE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        painel_cadastrooLayout.setVerticalGroup(
            painel_cadastrooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_cadastrooLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_cadastrooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_numerp)
                    .addComponent(lb_dataini, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_donocheque)
                    .addComponent(lb_datafin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_cadastrooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ed_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ed_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ed_dataini, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ed_donocheque, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ed_datafin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel_cadastrooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_banco, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ed_dias)
                    .addComponent(lb_valor)
                    .addComponent(lb_juro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_cadastrooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ed_dias_bord, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ed_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ed_juro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ed_banco_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_cadastrooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_novo1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_gravar1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_excluir1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_cancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painel_cadastroo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_nome_bor, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_id, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ed_id, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(ed_nome_bor, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(lb_porc, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ed_porc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lb_porce, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(184, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ed_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_nome_bor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ed_nome_bor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_porc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ed_porc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_porce, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painel_cadastroo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pn_cadastroLayout = new javax.swing.GroupLayout(pn_cadastro);
        pn_cadastro.setLayout(pn_cadastroLayout);
        pn_cadastroLayout.setHorizontalGroup(
            pn_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pn_cadastroLayout.setVerticalGroup(
            pn_cadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_cadastroLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        painelprincipal.addTab("Cadastro", pn_cadastro);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limparEdits() {
        ed_nome_bor.setText("");
        ed_cpf.setText("");
        ed_numero.setText("");
        ed_banco_cli.setText("");
        ed_dias.setText("");
        ed_dataini.setText("");
        ed_datafin.setText("");
        ed_donocheque.setText("");
        ed_juro.setText("");
        ed_valor.setText("");
        
        
        
        
        
        
    }
    
    private void ed_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ed_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ed_nomeActionPerformed

    private void bt_novo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_novo1ActionPerformed
        // TODO add your handling code here:
        ed_cpf.grabFocus();
        ed_cpf.setEnabled(true);
        bt_novo1.setEnabled(false);
        bt_gravar1.setEnabled(true);
        bt_cancelar1.setEnabled(true);
        bt_excluir1.setEnabled(false);
    }//GEN-LAST:event_bt_novo1ActionPerformed

    private void bt_gravar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_gravar1ActionPerformed
       // TODO add your handling code here:
        Bordero bordero;
        bordero = new Bordero(null, ed_cpf.getText(), ed_numero.getText(), ed_donocheque.getText(), ed_dataini.getText(), ed_datafin.getText(), ed_banco_cli.getText(),ed_dias.getText(), ed_valor.getText(), ed_juro.getText(),  null, (float) 2.00);
        try {
            //BorderoDAO.gravar(bordero);
            JOptionPane.showMessageDialog(this, "Gravado com sucesso", "Informação", JOptionPane.INFORMATION_MESSAGE);
       } catch (Exception ex) {
            Logger.getLogger(TelaCidades.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_bt_gravar1ActionPerformed

    private void bt_excluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_excluir1ActionPerformed
        // TODO add your handling code here:
        int resultado = JOptionPane.showConfirmDialog(this, "Confirma exclusão", "Confirmação", JOptionPane.YES_NO_CANCEL_OPTION);
        if(resultado == 0) {
            //TelaCidades.delete(Cidade);
            limparEdits();
            bt_excluir1.setEnabled(false);
            bt_cancelar1.setEnabled(false);
        }
    }//GEN-LAST:event_bt_excluir1ActionPerformed

    private void bt_cancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelar1ActionPerformed
        // TODO add your handling code here:
        limparEdits();
        bt_novo1.setEnabled(true);
        bt_gravar1.setEnabled(false);
        bt_cancelar1.setEnabled(false);
        bt_excluir1.setEnabled(false);
    }//GEN-LAST:event_bt_cancelar1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaBorderos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaBorderos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaBorderos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBorderos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaBorderos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cancelar1;
    private javax.swing.JButton bt_excluir1;
    private javax.swing.JButton bt_gravar1;
    private javax.swing.JButton bt_novo1;
    private javax.swing.JButton bt_pesquisar;
    private javax.swing.JTextField ed_banco;
    private javax.swing.JTextField ed_banco_cli;
    private javax.swing.JTextField ed_cpf;
    private javax.swing.JTextField ed_datafin;
    private javax.swing.JTextField ed_dataini;
    private javax.swing.JLabel ed_dias;
    private javax.swing.JTextField ed_dias_bord;
    private javax.swing.JTextField ed_donocheque;
    private javax.swing.JTextField ed_id;
    private javax.swing.JTextField ed_juro;
    private javax.swing.JTextField ed_nome;
    private javax.swing.JTextField ed_nome_bor;
    private javax.swing.JTextField ed_numero;
    private javax.swing.JTextField ed_porc;
    private javax.swing.JTextField ed_valor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lb_banco;
    private javax.swing.JLabel lb_cpf;
    private javax.swing.JLabel lb_datafin;
    private javax.swing.JLabel lb_dataini;
    private javax.swing.JLabel lb_donocheque;
    private javax.swing.JLabel lb_id;
    private javax.swing.JLabel lb_juro;
    private javax.swing.JLabel lb_nome;
    private javax.swing.JLabel lb_nome_bor;
    private javax.swing.JLabel lb_numerp;
    private javax.swing.JLabel lb_porc;
    private javax.swing.JLabel lb_porce;
    private javax.swing.JLabel lb_valor;
    private javax.swing.JPanel painel_cadastroo;
    private javax.swing.JTabbedPane painelprincipal;
    private javax.swing.JPanel pn_cadastro;
    private javax.swing.JPanel pn_pesquisa;
    private javax.swing.JTable tb_bordero;
    private javax.swing.JTable tb_cadas_bordero;
    // End of variables declaration//GEN-END:variables
}
