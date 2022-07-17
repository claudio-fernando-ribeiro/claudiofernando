package introducao.exercicio13;

import java.util.ArrayList;
import java.util.List;

public class Cidade {
    private String nome;
    private List<Municipe> listaMunicipes = new ArrayList<>();

    public String getNome() {
        return nome;
    }
    public List<Municipe> getListaMunicipes() {
        return listaMunicipes;
    }
    public void setListaMunicipes(List<Municipe> listaMunicipes) {
        this.listaMunicipes = listaMunicipes;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int contaApartamentos(){//for each
        int contador = 0;
        for(Municipe umMunicipe : getListaMunicipes()){
            if(umMunicipe.getTipo().getNome().equals("Apartamento")){
                contador = contador + 1;
            }
        }
        return contador;
    }
 
    public int contaCasa(){//for convencional
        int cas = 0;
        for(int i=0; i < getListaMunicipes().size();i++){
            var umMunicipe = getListaMunicipes().get(i);
            if(umMunicipe.getTipo().getNome().equals("Casa")){
                cas++;
            }
        }
        return cas;
    }
    public static void main(String[] args) {
        Cidade cid1 = new Cidade();
        cid1.setNome("Joinville");

        TipoResidencia tipo1 = new TipoResidencia();
        tipo1.setNome("Apartamento");

        TipoResidencia tipo2 = new TipoResidencia();
        tipo2.setNome("Casa");
    
        Municipe mun1 = new Municipe();
        mun1.setNome("Zezinho");
        mun1.setTipo(tipo1);
        cid1.getListaMunicipes().add(mun1);

        Municipe mun2 = new Municipe();
        mun2.setNome("Mariazinha");
        mun2.setTipo(tipo1);
        cid1.getListaMunicipes().add(mun2);

        Municipe mun3 = new Municipe();
        mun3.setNome("Huguinho");
        mun3.setTipo(tipo1);
        cid1.getListaMunicipes().add(mun3);
        
        Municipe mun4 = new Municipe();
        mun4.setNome("Zezinho");
        mun4.setTipo(tipo2);
        cid1.getListaMunicipes().add(mun4);
  
        Municipe mun5 = new Municipe();
        mun5.setTipo(tipo2);
        mun5.setNome("Luizinho");
        cid1.getListaMunicipes().add(mun5);
            
        var apar = cid1.contaApartamentos();//como calcSomaProdutor é um método que tem retorno eu preciso primeiro guardar numa variável, para depois mostrar.
            System.out.println("Pessoas que possuem apartamentos: " + apar);

        var casinha = cid1.contaCasa();//como calcSomaProdutor é um método que tem retorno eu preciso primeiro guardar numa variável, para depois mostrar.
           System.out.println("Pessoas que possuem casa: " + casinha);
        }
    }

