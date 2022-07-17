package sistema.model;

import java.text.SimpleDateFormat;
import javax.swing.table.AbstractTableModel;
import sistema.controller.ListagemClienteController;
public class TabelaClienteModel extends AbstractTableModel{

    private ListagemClienteController controller;

    public TabelaClienteModel(ListagemClienteController controller) {
        this.controller = controller;
    }

    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    @Override
    public int getRowCount() {
        // TODO Auto-generated method stub
        return controller.getAllClientes().size();
    }

    @Override
    public int getColumnCount() {
        // TODO Auto-generated method stub
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
                   var umCliente = controller.getAllClientes().get(rowIndex);
                   switch (columnIndex) {
                       case 0:
                           return umCliente.getId();
                       case 1:
                           return umCliente.getNome();
                       case 2:
                           return sdf.format(umCliente.getDataNascimento());
                       case 3:
                           return umCliente.getCPF();
                       default:
                       return "";
                   }
           }
    @Override        
    public String getColumnName(int column) {
        return new String[] {"Código", "Nome", "Data de Nascimento", "CPF"}[column]; 
    }
}
