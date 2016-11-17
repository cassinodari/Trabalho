package br.edu.com.uricer.model;

import java.util.Objects;

/**
 *
 * @author Cassi
 */
public class Cliente  {
    Integer id;
    private String descricao;
    private String email;
    private String cpf;
    private String telefone;
    private String bairro;
    private String endereco;       
    Cidade id_cidade;
    private float porcentagem;

    public Cliente(Integer id, String nome, String email, String cpf, String telefone, String bairro, String endereco, Cidade id_cidade, float porcentagem) {
        this.id = id;
        this.descricao = nome;
        this.email = email;
        this.cpf = cpf;
        this.telefone = telefone;
        this.bairro = bairro;
        this.endereco = endereco;
        this.id_cidade = id_cidade;
        this.porcentagem = porcentagem;
    } 
    
    public Cliente() {
        super();
    }
    
    public Cidade getId_cidade() {
        return id_cidade;
    }

    public void setId_cidade(Cidade id_cidade) {
        this.id_cidade = id_cidade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public float getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(float porcentagem) {
        this.porcentagem = porcentagem;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nome=" + descricao + ", email=" + email + ", cpf=" + cpf + ", telefone=" + telefone + ", bairro=" + bairro + ", endereco=" + endereco + ", id_cidade=" + id_cidade + '}';
    }
    
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

