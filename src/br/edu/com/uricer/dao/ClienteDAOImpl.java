package br.edu.com.uricer.dao;

import br.edu.com.uricer.model.Cidade;
import br.edu.com.uricer.model.Cliente;
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
        float porcentagem = 0;
        if ("".equals(cliente.getPorcentagem())) {
            porcentagem = 0;
        } else {
            porcentagem = cliente.getPorcentagem();
        }
        if (cliente.getId() == 0) {
            sql = "INSERT INTO CLIENTES (NOME, EMAIL, CPF, TELEFONE, CEP, BAIRRO, ENDERECO, ID_CIDADE, PORCENTAGEM  ) VALUES ('" + cliente.getNome() + "', '" + cliente.getEmail() + "', '" + cliente.getCpf() + "', '" + cliente.getTelefone() + "', '" + cliente.getCep() + "','" + cliente.getBairro() + "', '" + cliente.getEndereco() + "', " + cliente.getId_cidade().getId() + ", " + cliente.getPorcentagem() + ");";
        } else {
            sql = "UPDATE CLIENTES SET NOME = '" + cliente.getNome() + "', EMAIL = '" + cliente.getEmail() + "', CPF = '" + cliente.getCpf() + "', TELEFONE = '" + cliente.getTelefone() + "', CEP = '" + cliente.getCep() + "', BAIRRO = '" + cliente.getBairro() + "', ENDERECO = '" + cliente.getEndereco() + "', ID_CIDADE = " + cliente.getId_cidade().getId() + ", PORCENTAGEM = " + cliente.getPorcentagem() + " WHERE ID = " + cliente.getId() + ";";
        }
        System.out.println(sql);
        try (PreparedStatement stm = conn.prepareStatement(sql)) {
            stm.execute();
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
        }
    }

    @Override
    public List<Cidade> getCidades() {
        // Abre uma conexao com o banco de dados
        this.conn = DataBase.getConnection();

        String sql = "SELECT * FROM CIDADES;";
        List<Cidade> cidades = new ArrayList<Cidade>();

        // Executa SQL
        try (PreparedStatement stm = conn.prepareStatement(sql)) {
            ResultSet rs = stm.executeQuery();
            // Percore os estados
            while (rs.next()) {
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

        String sql = "SELECT * FROM CIDADES WHERE ID = " + id + ";";
        Cidade cidade = new Cidade();
        // Executa SQL
        try (PreparedStatement stm = conn.prepareStatement(sql)) {
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
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

    public Cliente getClienteById(Integer id) {
        this.conn = DataBase.getConnection();

        String sql = "SELECT * FROM CLIENTES WHERE ID = " + id + ";";
        Cliente cliente = new Cliente();
        // Executa SQL
        try (PreparedStatement stm = conn.prepareStatement(sql)) {
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                cliente.setId(rs.getInt("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setEmail(rs.getString("email"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setBairro(rs.getString("bairro"));
                cliente.setEndereco(rs.getString("endereco"));
                cliente.setPorcentagem(Float.parseFloat(rs.getString("porcentagem")));
                cliente.setCep(rs.getString("cep"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setId_cidade(getCidadeById(rs.getInt("id_cidade")));
            }
            stm.close();
            this.conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(CidadeDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cliente;
    }

    @Override
    public List<Cliente> getClientes() {
        // Abre uma conexao com o banco de dados
        this.conn = DataBase.getConnection();

        String sql = "SELECT * FROM CLIENTES;";
        List<Cliente> clientes = new ArrayList<>();
        Cliente cli = null;
        // Executa SQL
        try (PreparedStatement stm = conn.prepareStatement(sql)) {
            ResultSet rs = stm.executeQuery();
            // Percore os estados
            while (rs.next()) {
                cli = new Cliente();
                cli.setId(rs.getInt("id"));
                cli.setNome(rs.getString("nome"));
                cli.setCpf(rs.getString("cpf"));
                cli.setTelefone(rs.getString("telefone"));
                cli.setBairro(rs.getString("bairro"));
                cli.setEndereco(rs.getString("endereco"));
                cli.setEmail(rs.getString("email"));
                cli.setCep(rs.getString("cep"));
                cli.setPorcentagem(rs.getFloat("porcentagem"));
                cli.setId_cidade(getCidadeById(rs.getInt("id_cidade")));
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
        try (PreparedStatement stm = conn.prepareStatement(sql)) {

            stm.setString(1, "%" + nome.toUpperCase() + "%");
            stm.execute();

            try (ResultSet resultSet = stm.getResultSet()) {
                while (resultSet.next()) {
                    cliente = new Cliente();
                    cliente.setId(resultSet.getInt("id"));
                    cliente.setNome(resultSet.getString("nome"));
                    cliente.setCpf(resultSet.getString("cpf"));
                    cliente.setTelefone(resultSet.getString("telefone"));
                    cliente.setBairro(resultSet.getString("bairro"));
                    cliente.setEndereco(resultSet.getString("endereco"));
                    cliente.setEmail(resultSet.getString("email"));
                    cliente.setCep(resultSet.getString("cep"));
                    cliente.setPorcentagem(resultSet.getFloat("porcentagem"));
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
