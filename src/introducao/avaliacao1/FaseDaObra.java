package introducao.avaliacao1;

import java.util.ArrayList;

public class FaseDaObra {
    private String nome;
    private Engenheiro encarregado;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Engenheiro getEncarregado() {
        return encarregado;
    }
    public void setEncarregado(Engenheiro encarregado) {
        this.encarregado = encarregado;
    }
    public ArrayList<Constrututor> getListaConstrutores() {
        return listaConstrutores;
    }
    public void setListaConstrutores(ArrayList<Constrututor> listaConstrutores) {
        this.listaConstrutores = listaConstrutores;
    }
    public ArrayList<ItemDeConstrucao> getListaItens() {
        return listaItens;
    }
    public void setListaItens(ArrayList<ItemDeConstrucao> listaItens) {
        this.listaItens = listaItens;
    }
    private ArrayList<Constrututor> listaConstrutores = new ArrayList<>();
    private ArrayList<ItemDeConstrucao> listaItens = new ArrayList<>();

    public float calcularValorDaFaseDaObra(){
        float salarioCons = 0;
        float valorMaterial = 0;
        float valorTotal = 0;
          for (var umSalario : getListaConstrutores()) {
            var valorSalario = umSalario.getSalario();
            salarioCons = umSalario.getSalario();
            valorSalario = salarioCons;
                for(var umItem : getListaItens()){
                var valorItem = umItem.getQuantidade() * umItem.getProduto().getPreco();
                valorMaterial += valorItem;
             //   } for (Engenheiro salarioEngenheiro : getEncarregado().getSalario(){
                    
                }
                return 0;
      
        }
        return salarioCons;

        
    }
/*    public float calcValorTotal() {
        //para cada umItem dentro de listaItens -> pega o cara e entra no bloco
        float valorTotal = 0;
        for(ItemPedido umItem : listaItens){
            var valorItem = umItem.getQuantidade() * umItem.getValorVenda();
            valorTotal += valorItem;
            }
        return valorTotal;
    } */

    }
 
       