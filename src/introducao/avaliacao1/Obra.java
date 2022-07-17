package introducao.avaliacao1;

import java.util.ArrayList;
import java.util.List;

public class Obra {
   
        
        List<FaseDaObra> listaFases = new ArrayList<>();

        public List<FaseDaObra> getListaFases() {
            return listaFases;
        }

        public void setListaFases(List<FaseDaObra> listaFases) {
            this.listaFases = listaFases;
        }
        
        public String listarDadosDaObra(){
            StringBuilder montadorDeString = new StringBuilder();
            for (int i = 0; i < getListaFases().size(); i++) {
            montadorDeString.append(" Nome " + getListaFases().get(i).getNome() + "\n" );
            montadorDeString.append(" Itens " + getListaFases().get(i).getListaItens()+ "\n");
            montadorDeString.append(" Engenheiro: " + getListaFases().get(i).getEncarregado().getNome()+ "\n");
            montadorDeString.append(" Construtores " + getListaFases().get(i).getListaConstrutores()+ "\n");
            montadorDeString.append("----------------------------------------------------------------------------------------------------\n");
            } 
            System.out.println(montadorDeString);
            return montadorDeString.toString();
        }

        public float calcularValorDaObra(){
            for (int i = 0; i < getListaFases().size(); i++) {

            }
            float total =  0f;
            // calcularValorDaFaseDaObra();
            return total;
            }
            

    /*    public float calcularValorTotalDaObra(){
            float soma = 0;
            for (FaseDaObra faseDaObra : getListaFases()) {
                faseDaObra = faseDaObra.get + 
                
            }


            return 0;
        } */

}

   