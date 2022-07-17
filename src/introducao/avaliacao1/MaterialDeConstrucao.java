package introducao.avaliacao1;

public class MaterialDeConstrucao {

    private String nome;
    private int preco;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getPreco() {
        return preco;
    }
    public void setPreco(int preco) {
        this.preco = preco;
    }
    @Override
    public String toString() {
        return nome + ", preco= R$" + preco;
    }
    
    
}
