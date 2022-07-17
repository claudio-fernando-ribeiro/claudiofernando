package sistema.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JOptionPane;

import sistema.entity.Cliente;
import sistema.model.TabelaClienteModel;
import sistema.service.ClienteService;
import sistema.view.FormularioCliente;
import sistema.view.ListagemCliente;


public class ListagemClienteController implements ActionListener {
    private ClienteService service = new ClienteService();


    public ArrayList<Cliente> getAllClientes(){
        return (ArrayList<Cliente>) service.getAllClientes();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JComponent botaoClicado = (JComponent)e.getSource();
        switch (botaoClicado.getName()) {
            case "btNovo":
            btNovoClique();
                break;
                case "btAlterar":
                btAlterarNovo();
                break;
                case "btExcluir":
                btExcluirNovo();
                break;
         }
    }
   private void btNovoClique(){
      //JOptionPane.showMessageDialog(null, "Botão Novo");
      Cliente novoCliente = new Cliente();
      FormularioCliente formulario = new FormularioCliente(novoCliente);
      service.save(novoCliente);

    }
    private void btAlterarNovo() {
    JOptionPane.showMessageDialog(null, "Botão Alterar");
    }
    private void btExcluirNovo(){
    JOptionPane.showMessageDialog(null, "Botão Excluir");
    }
}