package br.edu.com.uricer.dao;

import br.edu.com.uricer.model.Cidade;
import br.edu.com.uricer.model.Cliente;
import br.edu.com.uricer.util.DataBase;
import com.sun.jndi.ldap.Connection;
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
public abstract class ClienteDAOImpl2 implements ClienteDAO {

    private Connection conn;

    public ClienteDAOImpl2() {
        super();
    }

    @Override
    public Cliente gravar(Cliente cliente) throws Exception {
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
/*
    public List<Cliente> getClientes() {
        // Abre uma conexao com o banco de dados
        java.sql.Connection conn = DataBase.getConnection();
        //this.conn = DataBase.getConnection();    
        String sql = "SELECT * FROM CLIENTES;";
        List<Cliente> clientes = new ArrayList<Cliente>();

        // Executa SQL
        try (PreparedStatement stm = conn.prepareStatement(sql)) {
            ResultSet rs = stm.executeQuery();

            // Percorre os estados
            while (rs.next()) {
                Cliente cli = new Cliente();

                cli.setDescricao(rs.getString("nome"));
                cli.setEmail(rs.getString("email"));
                cli.setCpf(rs.getString("cpf"));
                cli.setTelefone(rs.getString("telefone"));
                cli.setBairro(rs.getString("bairro"));
                cli.setEndereco(rs.getString("endereco"));

                cli.setPorcentagem(rs.getFloat("porcentagem"));
                //cli.setId_cidade(this.getrs.getString("cpf"));
                clientes.add(cli);
            }
            stm.close();
            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(CidadeDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return clientes;
    }

    public List<Cliente> getCidades(String ordem) {
        return null;
    }

    public Cliente findById(Integer id) throws Exception {
        return null;
    }

    public Cidade findByDescricao(String descricao) throws Exception {
        return null;
    }

    public void delete(Integer id) throws Exception {

    }
*/
}
