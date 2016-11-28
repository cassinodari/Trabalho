package br.edu.com.uricer.view;

import br.edu.com.uricer.model.Bordero;
import br.edu.com.uricer.model.Cliente;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Cassi
 */
public class BorderoTableModel extends AbstractTableModel {

    private List<Bordero> borderos;

    public BorderoTableModel(List<Bordero> borderos) {
        this.borderos = borderos;
    }

    public void setBorderos(List<Bordero> borderos) {
        this.borderos = borderos;
    }

    @Override
    public int getRowCount() {
        return borderos.size();
    }

    @Override
    public int getColumnCount() {
        return 9;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Bordero bordero = borderos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return bordero.getCpf();
            case 1:
                return bordero.getNum_cheque();
            case 2:
                return bordero.getDono_cheque();
            case 3:
                return bordero.getData_ini();
            case 4:
                return bordero.getData_fin();
            case 5:
                return bordero.getBanco();
            case 6:
                return bordero.getDias();
            case 7:
                return bordero.getValor();
            case 8:
                return bordero.getJuros();
            default:
                throw new AssertionError();
        }
    }

    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "CPF";
            case 1:
                return "Número";
            case 2:
                return "Nome";
            case 3:
                return "DT Inicial";
            case 4:
                return "DT Final";
            case 5:
                return "Banco";
            case 6:
                return "Dias";
            case 7:
                return "Valor";
            case 8:
                return "Juros";
            default:
                throw new AssertionError();
        }
    }

}
