/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.com.uricer.dao;

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
public class ClienteDAOImpl implements ClienteDAO {
    
    private Connection conn;

    public ClienteDAOImpl() {
        //this.conn = con;
    }

    @Override
    public Cliente gravar(Cliente cliente) throws Exception {
        // Abre uma conexao com o banco de dados
        this.conn = DataBase.getConnection();
        String sql = "";
        if (cliente.getId() == null) {
            sql = "INSERT INTO CLIENTES (NOME, EMAIL, CPF, TELEFONE, CEP, BAIRRO, ENDERECO, ID_CIDADE, PORCENTAGEM  ) VALUES ('" + cliente.getNome() + "', '" + cliente.getEmail() + "', '" + cliente.getCpf() + "', '" + cliente.getTelefone() + "', '" + cliente.getCep() + "','" + cliente.getBairro() + "', '" + cliente.getEndereco() + "', NULL, " + cliente.getPorcentagem() + ");";
        } else {
            sql = "UPDATE INTO CLIENTES SET NOME = '" + cliente.getNome() + "', EMAIL = '" + cliente.getEmail() + "', CPF = '" + cliente.getCpf() + "', TELEFONE = '" + cliente.getTelefone() + "', + CEP = '" + cliente.getCep() + "', BAIRRO = '" + cliente.getBairro() + "', ENDERECO = '" + cliente.getEndereco() + "', ID_CIDADE = NULL, PORCENTAGEM = " + cliente.getPorcentagem() + ";";
        }
        System.out.println(sql);
        try (PreparedStatement stm = conn.prepareStatement(sql)) {
            stm.execute();
            //    conn.commit();
        } catch (Exception ex) {
            System.out.println("Erro ao tentar Adicionar/Atualizar: " + ex.getMessage());
        }
        return cliente;
    }
    
    public void delete(Cliente cliente) throws SQLException {
        this.conn = DataBase.getConnection();
        String sql = "delete from Clientes where id = ?";        
        try (PreparedStatement stm = conn.prepareStatement(sql)) {
            stm.setInt(1, cliente.getId());
            stm.executeUpdate();
            
            conn.commit();
        } catch (Exception ex) {
            System.out.println("Erro ao tentar excluir: " + ex.getMessage());
            conn.rollback();
        }
    }
    
    
    @Override
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

    @Override
    public List<Cliente> getClientes() {
        // Abre uma conexao com o banco de dados
        this.conn = DataBase.getConnection();

        String sql = "SELECT * FROM CLIENTES;";
        List<Cliente> clientes = new ArrayList<>();
        Cliente cli = null;
        // Executa SQL
        try(PreparedStatement stm = conn.prepareStatement(sql)) {
            ResultSet rs = stm.executeQuery();
            // Percore os estados
            while(rs.next()) {
                cli = new Cliente();
                cli.setId(rs.getInt("id"));
                cli.setNome(rs.getString("nome"));
                cli.setCpf(rs.getString("cpf"));
                cli.setTelefone(rs.getString("telefone"));
                cli.setBairro(rs.getString("bairro"));
                cli.setEndereco(rs.getString("endereco"));
                cli.setEmail(rs.getString("email"));
                cli.setCep(rs.getString("cep"));
                cli.setPorcentagem(rs.getString("porcentagem"));
                clientes.add(cli);
            }
            stm.close();
            this.conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return clientes;
    }

    @Override
    public List<Cliente> findByNome(String nome) {
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
}
