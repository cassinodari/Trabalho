package br.edu.com.uricer.view;

import br.edu.com.uricer.model.Cidade;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Cassi
 */
public class CidadeTableModel extends AbstractTableModel {

    private List<Cidade> cidades;

    public CidadeTableModel(List<Cidade> cidades) {
        this.cidades = cidades;
    }

    public void setCidades(List<Cidade> cidades) {
        this.cidades = cidades;
    }

    @Override
    public int getRowCount() {
        return cidades.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cidade cidade = cidades.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return cidade.getId();
            case 1:
                return cidade.getDescricao();
            case 2:
                return cidade.getUf().getUf();
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
                return "UF";
            default:
                throw new AssertionError();
        }
    }

}
