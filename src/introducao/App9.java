package introducao;

import introducao.exercicio6.EquipeDeVendas;
import introducao.exercicio6.Gerente;
import introducao.exercicio6.Vendedor;

public class App9 {
    public static void main(String[] args) {
        var vend1 = new Vendedor();
        vend1.setId(1);
        vend1.setNome("Zezinho");
        vend1.setPercComissao(2);
        vend1.setMetaVenda(1000);
        vend1.setTelefone("5555-1234");

        var vend2 = new Vendedor();
        vend2.setId(2);
        vend2.setNome("Luizinho");
        vend2.setPercComissao(2);
        vend2.setMetaVenda(1000);
        vend2.setTelefone("5555-5555");

        var vend3 = new Vendedor();
        vend3.setId(3);
        vend3.setNome("Robinho");
        vend3.setPercComissao(4);
        vend3.setMetaVenda(9000);
        vend3.setTelefone("5555-1111");

        var vend4 = new Vendedor();
        vend4.setId(4);
        vend4.setNome("Jefinho");
        vend4.setPercComissao(3);
        vend4.setMetaVenda(2000);
        vend4.setTelefone("5555-2222");

        var vend5 = new Vendedor();
        vend5.setId(5);
        vend5.setNome("Huguinho");
        vend5.setPercComissao(2);
        vend5.setMetaVenda(1000);
        vend5.setTelefone("5555-3333");

        var geren1 = new Gerente();
        geren1.setNome("Sr Burn");
        geren1.setId(1);
        geren1.setSetor("Diretoria");
        geren1.setTelefone("8888-6666");

        var geren2 = new Gerente();
        geren2.setNome("Sr Richfield");
        geren2.setId(2);
        geren2.setSetor("Diretoria");
        geren2.setTelefone("8888-7777");

        EquipeDeVendas equipe1 = new EquipeDeVendas();
        equipe1.setGestor(geren1);
        equipe1.getListaVendedores().add(vend1);
        vend1.setEquipe(equipe1);
        equipe1.getListaVendedores().add(vend2);
        vend2.setEquipe(equipe1);
        equipe1.getListaVendedores().add(vend3);
        vend3.setEquipe(equipe1);

        var retorno = equipe1.listarEquipe();
        System.out.println(retorno);

        EquipeDeVendas equipe2 = new EquipeDeVendas();
        equipe2.setGestor(geren2);
        equipe2.getListaVendedores().add(vend4);
        vend4.setEquipe(equipe2);
        equipe2.getListaVendedores().add(vend5);
        vend5.setEquipe(equipe2);

        retorno = equipe2.listarEquipe();
        System.out.println(retorno);

    }
}
