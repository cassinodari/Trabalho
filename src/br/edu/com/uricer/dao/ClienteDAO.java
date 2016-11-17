/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.com.uricer.dao;

import br.edu.com.uricer.model.Cidade;
import br.edu.com.uricer.model.Cliente;
import br.edu.com.uricer.model.Uf;
import java.util.List;

/**
 *
 * @author Cassi
 */
public interface ClienteDAO {
    
    
    public Cliente gravar(Cliente cliente) throws Exception;
    
    
    /**
     * Busca todas as UFS cadastradas no banco de dados
     * @param ordem
     * @return retora lista de cidades
     */
    public List<Cidade> getCidades();
    
    
    /**
     * Busca uma uf no banco de dados
     * @param id
     * @param ordem
     * @return retora lista de cidades
     */
    public Cidade getCidadeById(Integer id);
    
}
