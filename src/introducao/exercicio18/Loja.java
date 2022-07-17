package introducao.exercicio18;

import java.util.ArrayList;

public class Loja {
    ArrayList<Setor> listaSetores = new ArrayList<>();

    public ArrayList<Setor> getListaSetores() {
        return listaSetores;
    }

    public void setListaSetores(ArrayList<Setor> listaSetores) {
        this.listaSetores = listaSetores;
    }

    public String gerarCatalogo(){
       
        StringBuilder montador = new StringBuilder();
        for(var umSetor: getListaSetores()){
            montador.append("\n Nome do Setor: " + umSetor.getNome());
                for (var umProduto : umSetor.getListaProdutos()){
                    montador.append("\n    Nome do produto: " + umProduto.getNome());
                    montador.append("- Preço do produto: " + umProduto.getPreco());
                    montador.append("- Fornecedor: " + umProduto.getFornecedor());
                
                }
            montador.append("\n_____________________");
            }
            return montador.toString();
        }
         //outra forma de fazer
          /*StringBuilder montadorDeString = new StringBuilder();
          for (int i = 0; i < getListaSetores().size(); i++) {  
          montadorDeString.append(" Setor " + this.getListaSetores().get(i).getNome());
          montadorDeString.append("\n" + this.getListaSetores().get(i).getListaProdutos().toString());
        }
          System.out.println(montadorDeString);
          return montadorDeString.toString();
        }*/
        public static void main(String[] args) {
        Loja loja1 = new Loja(); 

        Fornecedor forn1 = new Fornecedor();
        forn1.setNome("Karsten");

        Fornecedor forn2 = new Fornecedor();
        forn2.setNome("Dohler");

        Produto prod1 = new Produto();
        prod1.setNome("Travesseiro");
        prod1.setPreco(70f);
        prod1.setFornecedor(forn1);
      
        Produto prod2 = new Produto();
        prod2.setNome("Cobertor");
        prod2.setPreco(250f);
        prod2.setFornecedor(forn1);

        Produto prod3 = new Produto();
        prod3.setNome("Toalha");
        prod3.setPreco(100f);
        prod3.setFornecedor(forn1);

        Produto prod4 = new Produto();
        prod4.setNome("Toalha de banho");
        prod4.setPreco(60f);
        prod4.setFornecedor(forn2);

        Produto prod5 = new Produto();
        prod5.setNome("Toalha de rosto");
        prod5.setPreco(30f);
        prod5.setFornecedor(forn2);

        Setor setor1 = new Setor();
        setor1.setNome("Cama");
        setor1.getListaProdutos().add(prod1);
        setor1.getListaProdutos().add(prod2);
        loja1.getListaSetores().add(setor1);

        Setor setor2 = new Setor();
        setor2.setNome("Mesa");
        setor2.getListaProdutos().add(prod3);
        loja1.getListaSetores().add(setor2);

        Setor setor3 = new Setor();
        setor3.setNome("Banho");
        setor3.getListaProdutos().add(prod4);
        setor3.getListaProdutos().add(prod5);
        loja1.getListaSetores().add(setor3);

        String retorno = loja1.gerarCatalogo();
        System.out.println(retorno);
    }

}
