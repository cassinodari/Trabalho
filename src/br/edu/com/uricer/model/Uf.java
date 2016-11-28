package br.edu.com.uricer.model;

import java.util.Objects;

/**
 *
 * @author Cassi
 */
public class Uf {

    private Integer id;
    private String descricao;
    private String uf;

    public Uf(Integer id, String descricao, String uf) {
        super();
        this.id = id;
        this.descricao = descricao;
        this.uf = uf;
    }

    public Uf() {
        super();
    }

    public Uf(Integer id) {
        this.id = id;
    }

    public Uf(String uf) {
        super();
        this.uf = uf;
    }

    public Integer getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getUf() {
        return uf;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return uf + " - " + descricao;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this.id);
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
        final Uf other = (Uf) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
}
