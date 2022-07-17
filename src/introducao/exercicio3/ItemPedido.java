package introducao.exercicio3;

public class ItemPedido {
    private long id;
    private int quantidade;
    private float valorVenda;
    private Produto produto;

    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        result = prime * result + ((produto == null) ? 0 : produto.hashCode());
        result = prime * result + quantidade;
        result = prime * result + Float.floatToIntBits(valorVenda);
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ItemPedido other = (ItemPedido) obj;
        if (id != other.id)
            return false;
        if (produto == null) {
            if (other.produto != null)
                return false;
        } else if (!produto.equals(other.produto))
            return false;
        if (quantidade != other.quantidade)
            return false;
        if (Float.floatToIntBits(valorVenda) != Float.floatToIntBits(other.valorVenda))
            return false;
        return true;
    }
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public float getValorVenda() {
        return valorVenda;
    }
    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }
    
    
}