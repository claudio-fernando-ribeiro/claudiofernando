package introducao.avaliacao1;

public class AppAvaliacao1 {
    public static void main(String[] args) {
    
    
    Engenheiro eng1 = new Engenheiro();
    eng1.setNome("Rick Sanchez");
    eng1.setNumero(1234);
    eng1.setSalario(10000f);
    eng1.setFomarcao("Engenheiro Civil");

    Engenheiro eng2 = new Engenheiro();
    eng2.setNome("Emmett Brow");
    eng2.setNumero(4321);
    eng2.setSalario(15000f);
    eng2.setFomarcao("Engenheiro Civil");

    Constrututor cons1 = new Constrututor();
    cons1.setNome("Huguinho");
    cons1.setNumero(1111);
    cons1.setSalario(3000f);
    cons1.setTerceirizado(false);
    
    Constrututor cons2 = new Constrututor();
    cons2.setNome("Luizinho");
    cons2.setNumero(2222);
    cons2.setSalario(2500f);
    cons2.setTerceirizado(true);

    Constrututor cons3 = new Constrututor();
    cons3.setNome("Zezinho");
    cons3.setNumero(3333);
    cons3.setSalario(3000f);
    cons3.setTerceirizado(false);

    FaseDaObra fase1 = new FaseDaObra();
    fase1.setNome("Fundação");
    fase1.setEncarregado(eng1);
    fase1.getListaConstrutores().add(cons1);
    fase1.getListaConstrutores().add(cons2);
  
    FaseDaObra fase2 = new FaseDaObra();
    fase2.setNome("Primeiro Andar");
    fase2.setEncarregado(eng2);
    fase2.getListaConstrutores().add(cons3);

    Obra obra1 = new Obra();
    obra1.getListaFases().add(fase1);
    obra1.getListaFases().add(fase2);
    
    MaterialDeConstrucao mat1 = new MaterialDeConstrucao();
    mat1.setNome("Viga de madeira");
    mat1.setPreco(20);
    
    MaterialDeConstrucao mat2 = new MaterialDeConstrucao();
    mat2.setNome("Saco de cimento");
    mat2.setPreco(80);
    
    MaterialDeConstrucao mat3 = new MaterialDeConstrucao();
    mat3.setNome("Vergalhão de aço");
    mat3.setPreco(50);
 
    ItemDeConstrucao item1 = new ItemDeConstrucao();
    item1.setQuantidade(500);
    fase2.getListaItens().add(item1);
    item1.setProduto(mat1);
    
    ItemDeConstrucao item2 = new ItemDeConstrucao();
    item2.setQuantidade(800);
    fase2.getListaItens().add(item2);
    item2.setProduto(mat2);

    ItemDeConstrucao item3 = new ItemDeConstrucao();
    item3.setQuantidade(900);
    fase1.getListaItens().add(item3);
    item3.setProduto(mat2);
    
    ItemDeConstrucao item4 = new ItemDeConstrucao();
    item4.setQuantidade(1000);
    fase1.getListaItens().add(item4);
    item4.setProduto(mat3);

    obra1.listarDadosDaObra();

    obra1.calcularValorDaObra();
    }
}
