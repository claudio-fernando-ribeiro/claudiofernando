package introducao.exercicio16;

import java.util.ArrayList;

public class GuardaVolumes {
    ArrayList<Item> listaItens = new ArrayList<>();

    public ArrayList<Item> getListaItens() {
        return listaItens;
    }

    public void setListaItens(ArrayList<Item> listaItens) {
        this.listaItens = listaItens;
    }
    
    public String gerarListaItens(){
        String nomeDaCoisa = new String();
        for(var objeto : getListaItens()){
            System.out.println("Objeto: " + objeto.getNome() + " - " + objeto.getProprietario().toString());
        }
        return nomeDaCoisa;
    }
    
    public static void main(String[] args) {
        
        GuardaVolumes guarda = new GuardaVolumes();

        Proprietario prop1 = new Proprietario();
        prop1.setNome("Zezinho");

        Proprietario prop2 = new Proprietario();
        prop2.setNome("Mariazinha");

        Item item1 = new Item();
        item1.setNome("Chave de casa");
        item1.setProprietario(prop1);
        guarda.getListaItens().add(item1);

        Item item2 = new Item();
        item2.setNome("Celular");
        item2.setProprietario(prop1);
        guarda.getListaItens().add(item2);

        Item item3 = new Item();
        item3.setNome("Chave de casa");
        item3.setProprietario(prop2);
        guarda.getListaItens().add(item3);

        Item item4 = new Item();
        item4.setNome("Celular");
        item4.setProprietario(prop2);
        guarda.getListaItens().add(item4);

        Item item5 = new Item();
        item5.setNome("Carteira");
        item5.setProprietario(prop2);
        guarda.getListaItens().add(item5);

        Item item6 = new Item();
        item6.setNome("Escova de cabelos");
        item6.setProprietario(prop2);
        guarda.getListaItens().add(item6);

        guarda.gerarListaItens();

    }
}
