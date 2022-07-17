package introducao.exercicio7;

import java.util.ArrayList;

public class Planilha {

    private ArrayList<ContaDaLuz> listaContasDeLuz = new ArrayList<>();
    
  
   public ArrayList<ContaDaLuz> getListaContasDeLuz() {
    return listaContasDeLuz;
}

public void setListaContasDeLuz(ArrayList<ContaDaLuz> listaContasDeLuz) {
    this.listaContasDeLuz = listaContasDeLuz;
}

public float calcularUltimoValorMedio(){
    float soma = 0;
    float media = 0;
    for(int i=0; i<listaContasDeLuz.size(); i++){
        ContaDaLuz umaConta = listaContasDeLuz.get(i);
        soma = soma + umaConta.getValorDaConta();
    }
   media = soma / listaContasDeLuz.size();
   return media;
   }

public float calcularMaiorValor(){
    float oMaior = 0;
    for(ContaDaLuz umaConta : listaContasDeLuz){
        if(oMaior < umaConta.getValorDaConta()){
        }
    } 
    return oMaior;
   }

   public float calcularMenorValor(){
       float oMenor = 0;
       if(listaContasDeLuz.size() >= 1){
           oMenor = listaContasDeLuz.get(0).getValorDaConta();
       }
       for(ContaDaLuz umaConta : listaContasDeLuz){
           if(oMenor > umaConta.getValorDaConta()){
               oMenor = umaConta.getValorDaConta();
           }
       }
       return oMenor;
   }
}
