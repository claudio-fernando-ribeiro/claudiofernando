package introducao;

import java.util.ArrayList;

public class Celular {
    private String numero;
    private String marca;
    private String modelo;
    private Pessoa dono;



    //OPERADOR DIAMANTE -
    private ArrayList<Aplicativo> listaAplicativos = new ArrayList<Aplicativo>();

    public ArrayList<Aplicativo> getListaAplicativos() {
        return listaAplicativos;
    }

    public void setListaAplicativos(ArrayList<Aplicativo> listaAplicativos) {
        this.listaAplicativos = listaAplicativos;
    }

    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }

    public Celular (String numero){
        this.numero = numero;

    }
    
    public String getNumero() {
        return extracted();
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    private String extracted() {
        return numero;
    }



}
