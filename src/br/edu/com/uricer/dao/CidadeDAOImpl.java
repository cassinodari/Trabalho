package br.edu.com.uricer.dao;

import br.edu.com.uricer.model.Cidade;
import br.edu.com.uricer.model.Pessoa;
import br.edu.com.uricer.model.Uf;
import br.edu.com.uricer.util.DataBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Alert;

/**
 *
 * @author Cassi
 */
public class CidadeDAOImpl implements CidadeDAO {

    private Connection conn;

    public CidadeDAOImpl() {
        //this.conn = con;
    }

    @Override
    public Cidade gravar(Cidade cidade) throws Exception {
        // Abre uma conexao com o banco de dados
        this.conn = DataBase.getConnection();
        String sql = "";
        if (cidade.getId() == null) {
            sql = "INSERT INTO CIDADES (DESCRICAO, ID_UF) VALUES ('"+cidade.getDescricao()+"', "+cidade.getUf().getId()+");";
        } else {
            sql = "UPDATE INTO CIDADES SET DESCRICAO = '"+cidade.getDescricao()+"', ID_UF = "+cidade.getUf().getId()+";";
        }
        try (PreparedStatement stm = conn.prepareStatement(sql)) {
            stm.execute();
            conn.commit();
        } catch (Exception ex) {
            System.out.println("Erro ao tentar Adicionar/Atualizar: " + ex.getMessage());
        }
        return cidade;
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
            
            // Percorre os estados
            while(rs.next()) {
                Cidade cid = new Cidade();
                cid.setId(rs.getInt("id"));
                cid.setDescricao(rs.getString("descricao"));
                cid.setUf(this.getUFById(rs.getInt("id_uf")));
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
    public List<Cidade> getCidades(String ordem) {
        return null;
    }

    @Override
    public Cidade findById(Integer id) throws Exception {
        return null;
    }

    @Override
    public Cidade findByDescricao(String descricao) throws Exception {
        return null;
    }

    @Override
    public void delete(Integer id) throws Exception {
        
    }

    @Override
    public List<Uf> getUFS() {
        // Abre uma conexao com o banco de dados
        this.conn = DataBase.getConnection();

        String sql = "SELECT * FROM UFS;";
        List<Uf> ufs = new ArrayList<Uf>();
        
        // Executa SQL
        try(PreparedStatement stm = conn.prepareStatement(sql)) {
            ResultSet rs = stm.executeQuery();
            // Percore os estados
            while(rs.next()) {
                Uf uf = new Uf();
                uf.setId(rs.getInt("id"));
                uf.setDescricao(rs.getString("descricao"));
                uf.setUf(rs.getString("uf"));
                ufs.add(uf);
            }
            stm.close();
            this.conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(CidadeDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return ufs;
    }

    @Override
    public Uf getUFById(Integer id) {
        // Abre uma conexao com o banco de dados
        this.conn = DataBase.getConnection();

        String sql = "SELECT * FROM UFS WHERE ID = "+id+";";
        Uf uf = new Uf();
        // Executa SQL
        try(PreparedStatement stm = conn.prepareStatement(sql)) {
            ResultSet rs = stm.executeQuery();
            while(rs.next()) {
                uf.setId(rs.getInt("id"));
                uf.setDescricao(rs.getString("descricao"));
                uf.setUf(rs.getString("uf"));
            }
            stm.close();
            this.conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(CidadeDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return uf;
    }

    @Override
    public Uf getUFByUF(String UF) {
        // Abre uma conexao com o banco de dados
        this.conn = DataBase.getConnection();

        String sql = "SELECT * FROM UFS WHERE UF = '"+UF+"';";
        Uf uf = new Uf();
        // Executa SQL
        try(PreparedStatement stm = conn.prepareStatement(sql)) {
            ResultSet rs = stm.executeQuery();
            while(rs.next()) {
                uf.setId(rs.getInt("id"));
                uf.setDescricao(rs.getString("descricao"));
                uf.setUf(rs.getString("uf"));
            }
            stm.close();
            this.conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(CidadeDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return uf;
    }
}
