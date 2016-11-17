/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.com.uricer.dao;

import br.edu.com.uricer.model.Bordero;
import br.edu.com.uricer.model.Cidade;
import br.edu.com.uricer.model.Cliente;
import br.edu.com.uricer.model.Uf;
import br.edu.com.uricer.util.DataBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cassi
 */
public class BorderoDAOImpl implements ClienteDAO {
    
    private Connection conn;

    public BorderoDAOImpl() {
        //this.conn = con;
    }

   
    /* public Bordero gravar(Cliente cliente) throws Exception {
        // Abre uma conexao com o banco de dados
        java.sql.Connection conn = DataBase.getConnection();
        String sql = "";
        if (cliente.getId() == null) {
            sql = "INSERT INTO CLIENTES (DESCRICAO, EMAIL, CPF, TELEFONE, BAIRRO, ENDERECO, ID_CIDADE, PORCENTAGEM  ) VALUES ('" + cliente.getDescricao() + "', '" + cliente.getEmail() + "', '" + cliente.getCpf() + "', '" + cliente.getTelefone() + "', '" + cliente.getBairro() + "', '" + cliente.getEndereco() + "', '" + cliente.getId() + "', '" + cliente.getPorcentagem() + "';";
        } else {
            sql = "UPDATE INTO CLIENTES SET DESCRICAO = '" + cliente.getDescricao() + "', EMAIL = '" + cliente.getEmail() + "', CPF = '" + cliente.getCpf() + "', TELEFONE = '" + cliente.getTelefone() + "', BAIRRO = '" + cliente.getBairro() + "', ENDERECO = '" + cliente.getEndereco() + "', ID = '" + cliente.getId() + "', PORCENTAGEM = '" + cliente.getPorcentagem() + "';";
        }
        try (PreparedStatement stm = conn.prepareStatement(sql)) {
            stm.execute();
            //    conn.commit();
        } catch (Exception ex) {
            System.out.println("Erro ao tentar Adicionar/Atualizar: " + ex.getMessage());
        }
        return cliente;
    }
    
    
 
    public List<Cidade> getCidades() {
        // Abre uma conexao com o banco de dados
        this.conn = DataBase.getConnection();

        String sql = "SELECT * FROM CIDADES;";
        List<Cidade> cidades = new ArrayList<Cidade>();
        
        // Executa SQL
        try(PreparedStatement stm = conn.prepareStatement(sql)) {
            ResultSet rs = stm.executeQuery();
            // Percore os estados
            while(rs.next()) {
                Cidade cid = new Cidade();
                cid.setId(rs.getInt("id"));
                cid.setDescricao(rs.getString("descricao"));
                cidades.add(cid);
            }
            stm.close();
            this.conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(CidadeDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return bordero;
    }

    
    /* public Bordero getCidadeById(Integer id) {
        // Abre uma conexao com o banco de dados
        this.conn = DataBase.getConnection();

        String sql = "SELECT * FROM CIDADES WHERE ID = "+id+";";
        Bordero bordero = new Bordero();
        // Executa SQL
        try(PreparedStatement stm = conn.prepareStatement(sql)) {
            ResultSet rs = stm.executeQuery();
            while(rs.next()) {
                bordero.setId(rs.getInt("id"));
                bordero.setDescricao(rs.getString("descricao"));
            }
            stm.close();
            this.conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(CidadeDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return cidade;
    }
*/

    @Override
    public Cliente gravar(Cliente cliente) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cidade> getCidades() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cidade getCidadeById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
