package br.edu.com.uricer.model;

import java.util.Objects;

/**
 *
 * @author Cassi
 */
public class Cidade {
       
    Integer id;
    private String descricao;
    Uf id_uf;

    public Cidade(Integer id, String descricao, Uf id_uf) {
        this.id = id;
        this.descricao = descricao;
        this.id_uf = id_uf;
    }

    public Cidade() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public Uf getUf() {
        return id_uf;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setUf(Uf id_uf) {
        this.id_uf = id_uf;
    }

    @Override
    public String toString() {
        return "Cidade{" + "id=" + id + ", descricao=" + descricao + ", uf=" + id_uf + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cidade other = (Cidade) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
}
