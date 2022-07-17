package introducao.exercicio6;

import java.util.ArrayList;

public class EquipeDeVendas {
    private Gerente gestor;
    private ArrayList<Vendedor> ListaVendedores = new ArrayList<>();
    

    public ArrayList<Vendedor> getListaVendedores() {
        return ListaVendedores;
    }

    public void setListaVendedores(ArrayList<Vendedor> listaVendedores) {
        ListaVendedores = listaVendedores;
    }

    public Gerente getGestor() {
        return gestor;
    }

    public void setGestor(Gerente gestor) {
        this.gestor = gestor;
    }
    
    public String listarEquipe(){
        StringBuilder montadorDeString = new StringBuilder();
        montadorDeString.append("Gerente\n");
        montadorDeString.append("Nome: "+ this.getGestor().getNome() + "\n");
        montadorDeString.append(String.format("Nome: %s \n", this.getGestor().getNome()));
        montadorDeString.append(String.format("Setor: %s \n", this.getGestor().getSetor()));
        montadorDeString.append(String.format("Telefone: %s \n", this.getGestor().getTelefone()));
        montadorDeString.append(String.format("ID: %s \n", this.getGestor().getId()));

        for(var umVendedor : this.getListaVendedores()){
            montadorDeString.append("Vendedores\n");
            montadorDeString.append(String.format("ID: %s \n", umVendedor.getId()));
            montadorDeString.append(String.format("Nome: %s \n", umVendedor.getNome()));
            montadorDeString.append(String.format("telefone: %s \n", umVendedor.getTelefone()));
            montadorDeString.append(String.format("Meta Venda: %f \n", umVendedor.getMetaVenda()));
            montadorDeString.append(String.format("Comissão: %f \n", umVendedor.getPercComissao()));

            var valoComissao = (umVendedor.getMetaVenda()* umVendedor.getPercComissao()) / 100f;
            montadorDeString.append(String.format("Val comissao: %f \n", valoComissao));

        }
        return montadorDeString.toString();
    }
}
