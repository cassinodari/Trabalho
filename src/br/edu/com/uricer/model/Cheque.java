package br.edu.com.uricer.model;

import java.sql.Date;

/**
 *
 * @author Cassi
 */
public class Cheque {
    private int id;
    private String cpf;
    private int num_cheque;
    private String dono_cheque;
    private Date data_ini;
    private Date data_fin;
    private int id_banco;
    private int dias;
    private float valor;
    private float juros;

    public Cheque(int id, String cpf, int num_cheque, String dono_cheque, Date data_ini, Date data_fin, int id_banco, int dias, float valor, float juros) {
        this.id = id;
        this.cpf = cpf;
        this.num_cheque = num_cheque;
        this.dono_cheque = dono_cheque;
        this.data_ini = data_ini;
        this.data_fin = data_fin;
        this.id_banco = id_banco;
        this.dias = dias;
        this.valor = valor;
        this.juros = juros;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getId_banco() {
        return id_banco;
    }

    public void setId_banco(int id_banco) {
        this.id_banco = id_banco;
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
    
    
    
    
    
}
