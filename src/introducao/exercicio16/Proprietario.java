package introducao.exercicio16;

public class Proprietario {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String toString(){
        StringBuilder montadorString = new StringBuilder();
        montadorString.append("Proprietário(a):  " + getNome());
        return montadorString.toString();
    }    
}
