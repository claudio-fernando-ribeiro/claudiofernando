package introducao.exercicio12;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String serie;
    List<Crianca> listaCriancas = new ArrayList<>();

    public String getSerie() {
        return serie;
    }
    public void setSerie(String serie) {
        this.serie = serie;
    }
    public List<Crianca> getListaCriancas() {
        return listaCriancas;
    }
    public void setListaCriancas(List<Crianca> listaCriancas) {
        this.listaCriancas = listaCriancas;
    }

    public int contaMeninos(){
        int meninos = 0;
        for(Crianca umMenino : getListaCriancas()){
            if(umMenino.getSexo().equalsIgnoreCase("Masculino")){
            meninos = meninos + 1;
        }
        } 
        return meninos;
    }

    public int contaMeninas(){
        int meninas = 0;
        for(Crianca umaMenina : getListaCriancas()){
            if(umaMenina.getSexo().equalsIgnoreCase("Feminino")){
            meninas = meninas + 1;
        }
        } 
        return meninas;
    }

    public static void main(String[] args) {

        Turma turma1 = new Turma();
        turma1.setSerie("5 série");
        
        Crianca crianca1 = new Crianca();
        crianca1.setNome("Zezinho");
        crianca1.setSexo("Masculino");
        turma1.getListaCriancas().add(crianca1);
        
        Crianca crianca2 = new Crianca();
        crianca2.setNome("Mariazinha");
        crianca2.setSexo("Feminino");
        turma1.getListaCriancas().add(crianca2);

        Crianca crianca3 = new Crianca();
        crianca3.setNome("Aninha");
        crianca3.setSexo("Feminino");
        turma1.getListaCriancas().add(crianca3);

        Crianca crianca4 = new Crianca();
        crianca4.setNome("Julinha");
        crianca4.setSexo("Feminino");
        turma1.getListaCriancas().add(crianca4);

        var boys = turma1.contaMeninos();//como calcSomaProdutor é um método que tem retorno eu preciso primeiro guardar numa variável, para depois mostrar.
            System.out.println("Meninos: " + boys);

            
        var girls = turma1.contaMeninas();//como calcSomaProdutor é um método que tem retorno eu preciso primeiro guardar numa variável, para depois mostrar.
        System.out.println("Meninas: " + girls);

    }
}
