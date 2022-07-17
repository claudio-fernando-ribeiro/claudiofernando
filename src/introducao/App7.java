package introducao;

import java.util.Calendar;
import java.util.GregorianCalendar;

import introducao.exercicio4.EmpresaCliente;
import introducao.exercicio4.Funcionaria;
import introducao.exercicio4.PessoaFisica;
import introducao.exercicio4.PessoaJuridica;

public class App7 {
    public static void main(String[] args) {
        //instaciando a classe funcionario e a classe empresaCliente
        Funcionaria funcionario1 = new Funcionaria();
        EmpresaCliente empresa1 = new EmpresaCliente();

        funcionario1.setCPF("555.555.555-55");
        funcionario1.setFuncao("Atendimento");
        funcionario1.setId(1010);
        funcionario1.setNome("Zezinho");
        funcionario1.setTelefone("5555-5555");
        Calendar calendario = GregorianCalendar.getInstance();
        calendario.set(2000,05,10);
        funcionario1.setDataNascimento(calendario.getTime());

        empresa1.setCNPJ("777.777.777-0001");
        empresa1.setMarca("Oceano");
        empresa1.setNome("Oceano Surf Wear");
        empresa1.setNumFuncionario(300);
        empresa1.setTelefone("5555-3333");
        Calendar calendario2 = GregorianCalendar.getInstance();
        calendario2.set(2020,05,13);
        empresa1.setDataCriacao(calendario2.getTime());

        PessoaFisica pessoa1 = funcionario1;
        System.out.println(pessoa1.getDataNascimento());
        System.out.println(pessoa1.getCPF());
        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getTelefone());

        PessoaJuridica pessoa2 = empresa1;
        System.out.println(pessoa2.getCNPJ());
        System.out.println(pessoa2.getNome());
        System.out.println(pessoa2.getTelefone());
        System.out.println(pessoa2.getDataCriacao());

        introducao.exercicio4.Pessoa pessoa3 = pessoa1;
        System.out.println(pessoa3.getNome());
        System.out.println(pessoa3.getTelefone());

        introducao.exercicio4.Pessoa pessoa4 = pessoa2;
        System.out.println(pessoa4.getNome());
        System.out.println(pessoa4.getTelefone());

        Funcionaria funcionaria2 = (Funcionaria)pessoa3;
        //isso é uma conversão forçada, sem ela não é possível ligar a classe menor diretamente a classe maior (sem passar pela do meio).
        System.out.println(funcionaria2.getCPF());
        System.out.println(funcionaria2.getFuncao());
        System.out.println(funcionaria2.getId());
        System.out.println(funcionaria2.getNome());
        System.out.println(funcionaria2.getTelefone());
        System.out.println(funcionaria2.getDataNascimento());

        EmpresaCliente empresa2 = (EmpresaCliente) pessoa4;
        System.out.println(empresa2.getCNPJ());
        System.out.println(empresa2.getMarca());
        System.out.println(empresa2.getNome());
        System.out.println(empresa2.getNumFuncionario());
        System.out.println(empresa2.getTelefone());
        System.out.println(empresa2.getDataCriacao());
    }
    
}
