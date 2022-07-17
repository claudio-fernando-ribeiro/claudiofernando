package introducao.exercicio17;

import java.util.ArrayList;

public class Cardapio {
    ArrayList<ItemCardapio> listaItensCardapio = new ArrayList<>();

    public ArrayList<ItemCardapio> getListaItensCardapio() {
        return listaItensCardapio;
    }

    public void setListaItensCardapio(ArrayList<ItemCardapio> listaItensCardapio) {
        this.listaItensCardapio = listaItensCardapio;
    }

    public String gerarCardapio(){
        String pratoDisponível = new String();
        for (var itemCardapio : getListaItensCardapio()) {
            if(itemCardapio.isDisponível()){ //ele já volta um resultado = a true, por isso não é necessário o ""== true"
                System.out.println(itemCardapio.getPrato().toString());
                }            
        }        
        return pratoDisponível;
    }

    public static void main(String[] args) {
        
        Cardapio card = new Cardapio();

        Prato prato1 = new Prato();
        prato1.setNome("Bifão");
        prato1.setPreco(10f);

        Prato prato2 = new Prato();
        prato2.setNome("Feijoada");
        prato2.setPreco(30f);

        Prato prato3 = new Prato();
        prato3.setNome("Dobradinha");
        prato3.setPreco(50f);

        Prato prato4 = new Prato();
        prato4.setNome("Hamburguer");
        prato4.setPreco(20f);

        ItemCardapio item1 = new ItemCardapio();
        item1.setDisponível(true);
        item1.setPrato(prato1);
        card.getListaItensCardapio().add(item1);

        ItemCardapio item2 = new ItemCardapio();
        item2.setDisponível(true);
        item2.setPrato(prato2);
        card.getListaItensCardapio().add(item2);

        ItemCardapio item3 = new ItemCardapio();
        item3.setDisponível(false);
        item3.setPrato(prato3);
        card.getListaItensCardapio().add(item3);

        ItemCardapio item4 = new ItemCardapio();
        item4.setDisponível(true);
        item4.setPrato(prato4);
        card.getListaItensCardapio().add(item4);

        card.gerarCardapio();

    }
    
}
