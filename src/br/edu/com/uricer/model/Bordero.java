package br.edu.com.uricer.model;

import java.util.Objects;

/**
 *
 * @author Cassi
 */
public class Bordero {
    private Integer id;
    private Cliente id_cliente;

    public Bordero() {
        super();
    }
    
    public Bordero(Integer id, Cliente id_cliente) {
        this.id = id;
        this.id_cliente = id_cliente;
    }

    public Bordero(Object object, String text, String text0, String text1, String text2, String text3, String text4, String text5, String text6, String text7, Object object0, float f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
    
        

