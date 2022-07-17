package sistema.service;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import sistema.dao.ClienteDAO;
import sistema.entity.Cliente;

//Essa classe é o nosso "caso de uso" (regra de negócio) - é nele que vai gerenciar nossas entidades e prover
// mecanismos para outras unidade
public class ClienteService {
    //private ArrayList<Cliente> listaClientes = new ArrayList<>();
    private ClienteDAO clienteDAO = new ClienteDAO();
    public ClienteService(){

        
        /*var cliente1 = new Cliente();
        cliente1.setId(1);
        cliente1.setNome("Zezinho");
        cliente1.setCPF("555.555.555-55");
        Calendar calendario = GregorianCalendar.getInstance();
        calendario.set(2022,05,12);
        cliente1.setDataNascimento(calendario.getTime());
        listaClientes.add(cliente1);

        var cliente2 = new Cliente();
        cliente2.setId(2);
        cliente2.setNome("Juninho");
        cliente2.setCPF("111.111.111-11");
        Calendar calendario1 = GregorianCalendar.getInstance();
        calendario1.set(2022,04,12);
        cliente2.setDataNascimento(calendario1.getTime());
        listaClientes.add(cliente2);

        var cliente3 = new Cliente();
        cliente3.setId(3);
        cliente3.setNome("Joazinho");
        cliente3.setCPF("333.333.333-33");
        Calendar calendario2 = GregorianCalendar.getInstance();
        calendario2.set(2022,05,02);
        cliente3.setDataNascimento(calendario2.getTime());
        listaClientes.add(cliente3);*/

    }

    public List<Cliente>getAllClientes(){
        return clienteDAO.getAll();
    }
    public Cliente save (Cliente cliente){
        //listaClientes.add(cliente);
        return cliente;
    }
}
