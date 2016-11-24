package br.edu.com.uricer.view;

import br.edu.com.uricer.model.Bordero;
import br.edu.com.uricer.model.Cliente;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class BorderoTableModel extends AbstractTableModel {

    private List<Bordero> borderos;

    public BorderoTableModel(List<Bordero> borderos) {
        this.borderos = borderos;
    }

    public void setClientes(List<Bordero> borderos) {
        this.borderos = borderos;
    }

    @Override
    public int getRowCount() {
        return borderos.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Bordero cliente = borderos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return cliente.getId();
            //        case 2: return cliente.getCpf();
            //        case 3: return cliente.getBairro();
            default:
                throw new AssertionError();
        }
    }

    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Id";
            case 1:
                return "Nome";
            case 2:
                return "CPF";
            case 3:
                return "Telefone";
            default:
                throw new AssertionError();
        }
    }

}
