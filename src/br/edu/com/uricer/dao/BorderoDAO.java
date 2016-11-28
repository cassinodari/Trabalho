package br.edu.com.uricer.dao;

import br.edu.com.uricer.model.Bordero;
import br.edu.com.uricer.model.Cidade;
import br.edu.com.uricer.model.Cliente;
import br.edu.com.uricer.model.Uf;
import java.util.List;

/**
 *
 * @author Cassi
 */
public interface BorderoDAO {

    public Bordero gravar(Bordero bordero) throws Exception;

    /**
     * Busca todas as UFS cadastradas no banco de dados
     *
     * @param ordem
     * @return retora lista de cidades
     */
    public List<Cidade> getCidades();

    /**
     * Busca uma uf no banco de dados
     *
     * @param id
     * @param ordem
     * @return retora lista de cidades
     */
    public Cidade getCidadeById(Integer id);
}
