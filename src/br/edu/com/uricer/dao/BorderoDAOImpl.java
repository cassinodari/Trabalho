package br.edu.com.uricer.dao;

import br.edu.com.uricer.model.Bordero;
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
public class BorderoDAOImpl implements BorderoDAO {

    private Connection conn;
    private ClienteDAOImpl clienteDao = new ClienteDAOImpl();

    public BorderoDAOImpl() {
        //this.conn = con;
    }

    public Bordero gravar(Bordero bordero) throws Exception {
        System.out.println("Chegou");
        this.conn = DataBase.getConnection();
        String sql = "";
        if (bordero.getId() == 0) {
            sql = "INSERT INTO BORDEROS (ID_CLIENTE, CPF, NUM_CHEQUE, DONO_CHEQUE, DT_INI, DT_FIN, BANCO, DIAS, VALOR, JUROS) VALUES (" + bordero.getId_cliente().getId() + ", '" + bordero.getCpf() + "', " + bordero.getNum_cheque() + ", '" + bordero.getDono_cheque() + "', '" + bordero.getData_ini() + "', '" + bordero.getData_fin() + "', '" + bordero.getBanco() + "', " + bordero.getDias() + ", " + bordero.getValor() + ", " + bordero.getJuros() + ");";
        } else {
            sql = "UPDATE BORDEROS SET ID_CLIENTE = " + bordero.getId_cliente().getId() + ", CPF = '" + bordero.getCpf() + "', NUM_CHEQUE = " + bordero.getNum_cheque() + ", DONO_CHEQUE = '" + bordero.getDono_cheque() + "', DT_INI = '" + bordero.getData_ini() + "', DT_FIN = '" + bordero.getData_fin() + "', BANCO = '" + bordero.getBanco() + "', DIAS = " + bordero.getDias() + ", VALOR = " + bordero.getValor() + ", JUROS = " + bordero.getJuros() + " WHERE ID = " + bordero.getId() + ";";
        }
        System.out.println(sql);
        try (PreparedStatement stm = conn.prepareStatement(sql)) {
            stm.execute();
            //    conn.commit();
        } catch (Exception ex) {
            System.out.println("Erro ao tentar Adicionar/Atualizar: " + ex.getMessage());
        }
        return bordero;
    }

    public List<Bordero> getBorderos(Cliente cliente) {
        // Abre uma conexao com o banco de dados
        this.conn = DataBase.getConnection();
        String sql = "SELECT * FROM BORDEROS WHERE ID_CLIENTE = " + cliente.getId() + ";";
        List<Bordero> borderos = new ArrayList<>();
        Bordero bord = null;
        // Executa SQL
        try (PreparedStatement stm = conn.prepareStatement(sql)) {
            ResultSet rs = stm.executeQuery();
            // Percorre os estados
            while (rs.next()) {
                bord = new Bordero();
                bord.setId(rs.getInt("id"));
                bord.setId_cliente(clienteDao.getClienteById(rs.getInt("id_cliente")));
                bord.setCpf(rs.getString("cpf"));
                bord.setNum_cheque(rs.getInt("num_cheque"));
                bord.setDono_cheque(rs.getString("dono_cheque"));
                bord.setData_ini(rs.getDate("dt_ini"));
                bord.setData_fin(rs.getDate("dt_fin"));
                bord.setBanco(rs.getString("banco"));
                bord.setDias(rs.getInt("dias"));
                bord.setValor(rs.getFloat("valor"));
                bord.setJuros(rs.getFloat("juros"));
                borderos.add(bord);
            }
            stm.close();
            this.conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(BorderoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return borderos;
    }

    public List<Cidade> getCidades() {
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
}
