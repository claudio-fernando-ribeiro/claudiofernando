package introducao;

import java.util.Calendar;
import java.util.GregorianCalendar;

import introducao.exercicio7.ContaDaLuz;
import introducao.exercicio7.Planilha;

public class App10 {
    public static void main(String[] args) {
        Planilha plan1 = new Planilha();

        Calendar calendario = GregorianCalendar.getInstance(); 
        calendario.set(2022, 05,24);

        ContaDaLuz conta1 = new ContaDaLuz(300f, calendario.getTime(), 
        1, 42, calendario.getTime(), 0);

        calendario.set(2022, 05, 21);
        ContaDaLuz conta2 = new ContaDaLuz(400f, calendario.getTime(),
        2, 45, calendario.getTime(), 0);
        
        plan1.getListaContasDeLuz().add(conta1);
        plan1.getListaContasDeLuz().add(conta2);
        System.out.println();
    }
}
