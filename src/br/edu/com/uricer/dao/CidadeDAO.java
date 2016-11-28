package br.edu.com.uricer.dao;

import br.edu.com.uricer.model.Cidade;
import br.edu.com.uricer.model.Uf;
import java.util.List;

/**
 * Interface que define as operações para uma implementação de um objeto DAO.
 * Concentra as operacoes pra uma persistencia das instancias de classes de
 * entidades.
 *
 * @author Cassi
 */
public interface CidadeDAO {

    /**
     * Método para armazenar um objeto no banco de dados. será utilizado para
     * operaçoes de insercao e alteracao de dados do objeto. se o ID do objeto
     * está null, fará uma inclusão, caso hover id, fará uma alteração
     *
     * @param objeto objeto Instância do objeto a ser inserido
     * @return Instancia atualizada do objeto após sincronizado com o banco de
     * dados
     * @throws Exception Exceção gerada, se for o caso
     */
    public Cidade gravar(Cidade cidade) throws Exception;

    /**
     * Busca todas as cidades cadastradas no banco de dados
     *
     * @return retora lista de cidades
     */
    public List<Cidade> getCidades();

    /**
     * Busca todas as cidades cadastradas no banco de dados ordenada por algum
     * campo
     *
     * @param ordem
     * @return retora lista de cidades
     */
    public List<Cidade> getCidades(String ordem);

    /**
     * Busca todas as UFS cadastradas no banco de dados
     *
     * @param ordem
     * @return retora lista de cidades
     */
    public List<Uf> getUFS();

    /**
     * Busca uma uf no banco de dados
     *
     * @param id
     * @param ordem
     * @return retora lista de cidades
     */
    public Uf getUFById(Integer id);

    /**
     * Busca uma uf no banco de dados
     *
     * @param id
     * @param ordem
     * @return retora lista de cidades
     */
    public Uf getUFByUF(String UF);

    /**
     * Busca a instancia de um objeto do banco de dados pelo seu id.
     *
     * @param id id a ser buscado
     * @return Instancia do objeto respectivo ao id informado
     * @throws Exception Exeção caso houver
     */
    public Cidade findById(Integer id) throws Exception;

    // public Cidade findByNome(String descricao);
    /**
     * Busca a instancia de um objeto do banco de dados com base no campo
     * descricao do objeto
     *
     * @return Instancia do objeto respectivo a string informada
     * @throws Exception Exeção caso houver
     */
    public Cidade findByDescricao(String descricao) throws Exception;

    /**
     * Deleta uma instanicia do banco de dados de um determinado objeto com base
     * no id informado
     *
     * @param id id a ser deletado
     * @throws Exception Exeção caso houver
     */
    public void delete(Integer id) throws Exception;
}
