package sistema.view;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import sistema.controller.ListagemClienteController;
import sistema.model.TabelaClienteModel;

public class ListagemCliente extends JFrame {

    private JScrollPane jpnCentro;
    private JPanel jpnSul = new JPanel();
    private JButton btNovo = new JButton("Novo");
    private JButton btAlterar = new JButton("Alterar");
    private JButton btExcluir = new JButton("Excluir");
    private ListagemClienteController controller = new ListagemClienteController();
    private TabelaClienteModel tabelaModel1 = new TabelaClienteModel(controller);
    private JTable tabela = new JTable(tabelaModel1);


    public ListagemCliente() {
        setSize(500,400);
        setTitle("Listagem Clientes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        criaPaineis();
        setVisible(true);
    }

    public void atualizaTabela(){
        tabelaModel1.fireTableDataChanged();

    }

    public TabelaClienteModel getTabelaModel1() {
        return tabelaModel1;
    }

    public void setTabelaModel1(TabelaClienteModel tabelaModel1) {
        this.tabelaModel1 = tabelaModel1;
    }

    private void criaPaineis(){
        //import java.awt.FlowLayout;
        jpnSul.setLayout(new FlowLayout(FlowLayout.LEFT));

        add(jpnSul,"South");
        jpnSul.add(btNovo);
        jpnSul.add(btAlterar);
        jpnSul.add(btExcluir);
        //jpnCentro.add(tabela);
        btNovo.addActionListener(controller);
        btNovo.setName("btNovo");
        btAlterar.addActionListener(controller);
        btAlterar.setName("btAlterar");
        btExcluir.addActionListener(controller);
        btExcluir.setName("btExcluir");

        jpnCentro = new JScrollPane(tabela);
        jpnCentro.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jpnCentro.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        add(jpnCentro, "Center");

        //jpnCentro.setBackground(Color.MAGENTA);
        //jpnSul.setBackground(Color.YELLOW);

    }
    
}
