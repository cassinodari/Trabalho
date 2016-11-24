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
public class BorderoDAOImpl implements BorderoDAO{
    
    private Connection conn;

    public BorderoDAOImpl() {
        //this.conn = con;
    }
    
     public Bordero gravar(Bordero bordero) throws Exception {
        // Abre uma conexao com o banco de dados
        java.sql.Connection conn = DataBase.getConnection();
        String sql = "";
        if (bordero.getId() == null) {
            sql = "INSERT INTO BORDEROS (ID, ID_CLIENTE) VALUES ('" + bordero.getId() + "', EMAIL = '" + bordero.getId_cliente() + "';";
        } else {
           // sql = "UPDATE INTO BORDEROS SET ID_CLIENTE = '" + bordero.getId() + "', EMAIL = '" + bordero.getId().getId_cliente());
        }
        try (PreparedStatement stm = conn.prepareStatement(sql)) {
            stm.execute();
            //    conn.commit();
        } catch (Exception ex) {
            System.out.println("Erro ao tentar Adicionar/Atualizar: " + ex.getMessage());
        }
        return bordero;
    }
     
     public List<Bordero> getBorderos() {
        // Abre uma conexao com o banco de dados
        this.conn = DataBase.getConnection();

        String sql = "SELECT * FROM BORDEROS;";
        List<Bordero> borderos = new ArrayList<>();
        Bordero bord = null;
        // Executa SQL
        try(PreparedStatement stm = conn.prepareStatement(sql)) {
            ResultSet rs = stm.executeQuery();
            
            // Percorre os estados
            while(rs.next()) {
                bord = new Bordero();
                bord.setId(rs.getInt("id"));
            //    bord.setId_cliente(rs.getString("id_cliente"));
                //cid.setUf(this.getUFById(rs.getInt("id_uf")));
                borderos.add(bord);
            }
            stm.close();
            this.conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(CidadeDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return borderos;
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

        return cidades;
    }
    //***** Ajustar este método abaixo
    /* public List<Cliente> findByNome(String nome) {
        this.conn = DataBase.getConnection();
        String sql = "Select * from Clientes c where upper(c.nome) like ?";
        List<Cliente> clientes = new ArrayList<>();
        Cliente cliente = null;
        try(PreparedStatement stm = conn.prepareStatement(sql)) {
            
            stm.setString(1, "%" + nome.toUpperCase() + "%");
            stm.execute();
            
            try(ResultSet resultSet = stm.getResultSet()) {
                while(resultSet.next()) {
                    cliente = new Cliente();
                    cliente.setId(resultSet.getInt("id"));
                    cliente.setNome(resultSet.getString("nome"));
                    cliente.setCpf(resultSet.getString("cpf"));
                    cliente.setTelefone(resultSet.getString("telefone"));
                    clientes.add(cliente);
                }
            }
            stm.close();
            this.conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return clientes;
    }

    */
    
    @Override
     public Cidade getCidadeById(Integer id) {
        // Abre uma conexao com o banco de dados
        this.conn = DataBase.getConnection();

        String sql = "SELECT * FROM CIDADES WHERE ID = "+id+";";
        Cidade cidade = new Cidade();
        // Executa SQL
        try(PreparedStatement stm = conn.prepareStatement(sql)) {
            ResultSet rs = stm.executeQuery();
            while(rs.next()) {
                cidade.setId(rs.getInt("id"));
                cidade.setDescricao(rs.getString("descricao"));
            }
            stm.close();
            this.conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(CidadeDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return cidade;
    }

    
}

   

