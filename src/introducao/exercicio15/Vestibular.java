package introducao.exercicio15;

import java.util.ArrayList;

public class Vestibular {

    ArrayList<Vestibulando> listaVestibulandos = new ArrayList<>();

    public ArrayList<Vestibulando> getListaVestibulandos() {
        return listaVestibulandos;
    }

    public void setListaVestibulandos(ArrayList<Vestibulando> listaVestibulandos) {
        this.listaVestibulandos = listaVestibulandos;
    }
    
    public String gerarListaAprovados(){
    String montadorDeString = new String();
        for (var vestibulando : getListaVestibulandos()) {
            if(vestibulando.getNota() >= 7f){
                System.out.println(vestibulando.getNome() + " - " + vestibulando.getNota());
            }
        }
        return montadorDeString;
    }

    public static void main(String[] args) {
        
        Vestibular acafe = new Vestibular();

        Vestibulando vest1 = new Vestibulando();
        vest1.setNome("Zezinho");
        vest1.setNota(7);
        acafe.getListaVestibulandos().add(vest1);

        Vestibulando vest2 = new Vestibulando();
        vest2.setNome("Pedrinho");
        vest2.setNota(5);
        acafe.getListaVestibulandos().add(vest2);

        Vestibulando vest3 = new Vestibulando();
        vest3.setNome("Huguinho");
        vest3.setNota(10);
        acafe.getListaVestibulandos().add(vest3);

        Vestibulando vest4 = new Vestibulando();
        vest4.setNome("Luizinho");
        vest4.setNota(8);
        acafe.getListaVestibulandos().add(vest4);

        acafe.gerarListaAprovados();
    }
}
