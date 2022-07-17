package introducao.exercicio2;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class Reserva {
    private int numero;
    private Date dataInicial;
    private Date dataFinal;
    private Quarto quarto;
    public ArrayList<Hospede> listaHospedes = new ArrayList<>();

    public String toString(){
      
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        StringBuilder montadorString = new StringBuilder();
        montadorString.append("\nReserva: " + numero);
        montadorString.append("\nData Inicial: " + sdf.format(dataInicial));
        montadorString.append("\nData Final: " + sdf.format(dataFinal));
        montadorString.append("\nQuarto nr: " + quarto.getNumero());

        for(int i=0; i< listaHospedes.size(); i++){
            Hospede umHospede = listaHospedes.get(i);
            montadorString.append("\nHospede - nome: " + umHospede.getNome());
            montadorString.append("\nHospede - telefone: " + umHospede.getTelefone());
            montadorString.append("\nHospede - CPF: " + umHospede.getCPF());
        }
        
        return montadorString.toString();
    }

    public Reserva(int numero) {
        this.numero = numero;
    }

    public ArrayList<Hospede> getListaHospedes() {
        return listaHospedes;
    }

    public void setListaHospedes(ArrayList<Hospede> listaHospedes) {
        this.listaHospedes = listaHospedes;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

  
}
