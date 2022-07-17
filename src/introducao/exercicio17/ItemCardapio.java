package introducao.exercicio17;

public class ItemCardapio {
    private boolean disponível;
    private Prato prato;
    
    public boolean isDisponível() {
        return disponível;
    }
    public void setDisponível(boolean disponível) {
        this.disponível = disponível;
    }
    public Prato getPrato() {
        return prato;
    }
    public void setPrato(Prato prato) {
        this.prato = prato;
    }
}
