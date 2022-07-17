package introducao.exercicio11;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    List<Nota> listaNotas = new ArrayList<>();

    public List<Nota> getListaNotas() {
        return listaNotas;
    }

    public void setListaNotas(List<Nota> listaNotas) {
        this.listaNotas = listaNotas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public float calcMediaNotas(){
        float media = 0;
        float soma = 0;
        for( var umaNota : getListaNotas()){
            soma = soma + umaNota.getValor();
            }
            media = soma / getListaNotas().size();
        return media;
    }

       public static void main(String[] args) {

        Aluno zezinho = new Aluno();
        zezinho.setNome("Zezinho da Silva");
        
        Nota nota1 = new Nota();
        nota1.setValor(10);
        zezinho.getListaNotas().add(nota1);
        
        Nota nota2 = new Nota();
        nota2.setValor(10);
        zezinho.getListaNotas().add(nota2);

        Nota nota3 = new Nota();
        nota3.setValor(10);
        zezinho.getListaNotas().add(nota3);

        float notaFinal = zezinho.calcMediaNotas(); //como calcSomaProdutor é um método que tem retorno eu preciso primeiro guardar numa variável, para depois mostrar.

        System.out.println(notaFinal);
        
    }
}
