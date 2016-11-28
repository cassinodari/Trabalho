package br.edu.com.uricer.model;

import java.sql.Date;
import java.util.Objects;

/**
 *
 * @author Cassi
 */
public class Bordero {

    private Integer id;
    private Cliente id_cliente;
    private String cpf;
    private int num_cheque;
    private String dono_cheque;
    private Date data_ini;
    private Date data_fin;
    private String banco;
    private int dias;
    private float valor;
    private float juros;

    public Bordero() {
        super();
    }

    public Bordero(Integer id, Cliente id_cliente, String cpf, int num_cheque, String dono_cheque, Date data_ini, Date data_fin, String banco, int dias, float valor, float juros) {
        this.id = id;
        this.id_cliente = id_cliente;
        this.cpf = cpf;
        this.num_cheque = num_cheque;
        this.dono_cheque = dono_cheque;
        this.data_ini = data_ini;
        this.data_fin = data_fin;
        this.banco = banco;
        this.dias = dias;
        this.valor = valor;
        this.juros = juros;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cliente getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Cliente id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getNum_cheque() {
        return num_cheque;
    }

    public void setNum_cheque(int num_cheque) {
        this.num_cheque = num_cheque;
    }

    public String getDono_cheque() {
        return dono_cheque;
    }

    public void setDono_cheque(String dono_cheque) {
        this.dono_cheque = dono_cheque;
    }

    public Date getData_ini() {
        return data_ini;
    }

    public void setData_ini(Date data_ini) {
        this.data_ini = data_ini;
    }

    public Date getData_fin() {
        return data_fin;
    }

    public void setData_fin(Date data_fin) {
        this.data_fin = data_fin;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getJuros() {
        return juros;
    }

    public void setJuros(float juros) {
        this.juros = juros;
    }

    @Override
    public String toString() {
        return "Bordero{" + "id=" + id + ", id_cliente=" + id_cliente + '}';
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
