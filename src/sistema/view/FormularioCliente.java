package sistema.view;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import sistema.controller.FormularioClienteController;
import sistema.entity.Cliente;
import sistema.exception.ValorInvalidoException;

import java.awt.GridBagLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.awt.GridBagConstraints;

public class FormularioCliente extends JDialog {
    private JPanel jpnCentro = new JPanel();
    private JPanel jpnBotao = new JPanel();
    private JButton btnOk = new JButton("Ok");
    private JButton btnCancelar = new JButton("Cancelar");
    private JTextField txtId = new JTextField(4);
    private JTextField txtNome = new JTextField(20);
    private JTextField txtDataNascimento = new JTextField(8);
    private MaskFormatter mascaraCPF;
    private MaskFormatter mascaradataNascimento;
    private JFormattedTextField txtCPF;// = new JFormattedTextField(9);
    private FormularioClienteController controller = new FormularioClienteController(this);
    private Cliente cliente = new Cliente();

    public FormularioCliente(Cliente cliente) {
        this.cliente = cliente;
        setSize(400,300);
        setModal(true);
        criaPaineis(); // não esquece de chamar o metodo aqui!!!
        setVisible(true);

    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    private void criaPaineis(){
        add(jpnBotao,"South");
        btnOk.addActionListener(controller);
        btnOk.setName("btnOk");
        jpnBotao.add(btnOk);
        btnCancelar.addActionListener(controller);
        btnCancelar.setName("btnCancelar");
        jpnBotao.add(btnCancelar);


        jpnCentro.setLayout(new GridBagLayout());
        GridBagConstraints cons = new GridBagConstraints();
        cons.fill= GridBagConstraints.HORIZONTAL;
        add(jpnCentro, "Center");
        
        cons.gridx = 0; //coluna 0
        cons.gridy = 0; //linha 0
        cons.weightx = 0.20; //largura em percentual
        jpnCentro.add(new JLabel("Código"), cons);

        cons.gridx = 1; //coluna 0
        cons.gridy = 0; //linha 0
        cons.weightx = 0.80; //largura em percentual
        jpnCentro.add(txtId, cons);

        cons.gridx = 0; //coluna 0
        cons.gridy = 1; //linha 0
        cons.weightx = 0.20; //largura em percentual
        jpnCentro.add(new JLabel("Nome"), cons);

        cons.gridx = 1; //coluna 0
        cons.gridy = 1; //linha 0
        cons.weightx = 0.80; //largura em percentual
        jpnCentro.add(txtNome, cons);
        
        cons.gridx = 0; //coluna 0
        cons.gridy = 2; //linha 0
        cons.weightx = 0.80; //largura em percentual
        jpnCentro.add(new JLabel("CPF"), cons);


        try {
            mascaraCPF = new MaskFormatter("###.###.###-##");
            txtCPF = new JFormattedTextField(mascaraCPF);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        cons.gridx = 1; //coluna 0
        cons.gridy = 2; //linha 0
        cons.weightx = 0.80; //largura em percentual
        jpnCentro.add(txtCPF, cons);

        cons.gridx = 0; //coluna 0
        cons.gridy = 3; //linha 0
        cons.weightx = 0.80; //largura em percentual
        jpnCentro.add(new JLabel("Data de Nascimento"), cons);


        try {
            mascaradataNascimento = new MaskFormatter("##/##/####");
            txtDataNascimento = new JFormattedTextField(mascaradataNascimento);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        cons.gridx = 1; //coluna 0
        cons.gridy = 3; //linha 0
        cons.weightx = 0.80; //largura em percentual
        jpnCentro.add(txtDataNascimento, cons);
    }

    public Cliente atualiza (Cliente cliente) throws ValorInvalidoException{
        //atualiza com os dados da tela (binding)
        try{
        cliente.setId(Long.parseLong(txtId.getText()));
        }catch(NumberFormatException e){
            throw new ValorInvalidoException("Campo código deve conter numeros", e, "Código");
        }
        cliente.setNome(txtNome.getText());
        cliente.setCPF(txtCPF.getText());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");   
        try {
            cliente.setDataNascimento(sdf.parse(txtDataNascimento.getText()));
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            throw new ValorInvalidoException("Valor de data inválido", e, "DATA NASCIMENTO");
        }
        return cliente;
    }
    
}
