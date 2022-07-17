package introducao;

import java.util.Calendar;
import java.util.GregorianCalendar;

import introducao.exercicio3.Comprador;
import introducao.exercicio3.ItemPedido;
import introducao.exercicio3.Pedido;
import introducao.exercicio3.Produto;

public class App6 {
    public static void main(String[] args) {
        Comprador zezinho = new Comprador();
        zezinho.setId(300);
        zezinho.setNome("Zezinho da Silva");
        zezinho.setEndereco("Rua Lalala 100");

        Comprador luizinho = new Comprador();
        luizinho.setId(200);
        luizinho.setNome("Luizinho inácio");
        luizinho.setEndereco("Rua bababa 120");

        Pedido pedido1 = new Pedido();
        pedido1.setId(1);
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.set(2022, 04, 29);
        pedido1.setData(calendar.getTime());
        pedido1.setCliente(zezinho);

        Pedido pedido2 = new Pedido();
        pedido2.setId(2);
        Calendar calendario = GregorianCalendar.getInstance();
        calendario.set(2022, 05, 12);
        pedido2.setData(calendario.getTime());
        pedido2.setCliente(luizinho);

        var produto1 = new Produto();
        produto1.setId(1001);
        produto1.setNome("Playstation 5");
        produto1.setValor(8000f);
        
        var produto2 = new Produto();
        produto2.setId(1002);
        produto2.setNome("Xbox Series X");
        produto2.setValor(5000f);

        var produto3 = new Produto();
        produto3.setId(1003);
        produto3.setNome("Controle playstation");
        produto3.setValor(500f);

        var produto4 = new Produto();
        produto4.setId(1004);
        produto4.setNome("Televisonr 50P");
        produto4.setValor(3500f);

        var produto5 = new Produto();
        produto5.setId(1005);
        produto5.setNome("Cadeira gamer");
        produto5.setValor(1000f);

        var item1 = new ItemPedido();
        item1.setId(1);
        item1.setQuantidade(1);
        item1.setValorVenda(7500f);
        item1.setProduto(produto1); //ligação entre ItemPedido e Produto
        pedido1.getListaItens().add(item1); //ligação entre Pedido e ItemPedido

        var item2 = new ItemPedido();
        item2.setId(2);
        item2.setQuantidade(1);
        item2.setValorVenda(4000f);
        item2.setProduto(produto2);
        pedido1.getListaItens().add(item2);

        var item3 = new ItemPedido();
        item3.setId(3);
        item3.setQuantidade(1);
        item3.setValorVenda(500f);
        item3.setProduto(produto3);
        pedido2.getListaItens().add(item3);

        var item4 = new ItemPedido();
        item4.setId(4);
        item4.setQuantidade(1);
        item4.setValorVenda(3500f);
        item4.setProduto(produto4);
        pedido2.getListaItens().add(item4);

        var item5 = new ItemPedido();
        item5.setId(5);
        item5.setQuantidade(1);
        item5.setValorVenda(1000f);
        item5.setProduto(produto5);
        pedido2.getListaItens().add(item5);

        var result2 = pedido2.calcValorTotal();
        System.out.println(String.format("O Total do pedido do " + luizinho.getNome() + " pedido é de R$: %.2f", result2));

        var result = pedido1.calcValorTotal();
        System.out.println(String.format("O Total do pedido do " + zezinho.getNome() + " pedido é de R$: %.2f", result));
    }
}