package introducao.exercicio17;

public class Prato {
    private String nome;
    private float preco;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString(){
        StringBuilder montadorString = new StringBuilder();
        montadorString.append("Nome do prato:  " + getNome() + " - Preço - R$ " + getPreco() + "\n");
        montadorString.append("___________________________");

        return montadorString.toString();
    }
}
