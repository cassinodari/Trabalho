package br.edu.com.uricer.model;

import java.util.List;

/**
 *
 * @author Cassi
 */
public class Pessoa {

    private Integer id;
    private String nome;
    private List<Pessoa> pessoas;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa[id: " + id + " nome: " + nome + "]";
    }

}
