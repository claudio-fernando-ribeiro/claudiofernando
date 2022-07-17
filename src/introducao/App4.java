package introducao;
import java.util.Date;

import introducao.exercicio1.Autor;
import introducao.exercicio1.Livro;

public class App4 {
    public static void main(String[] args) {
        
        Livro livro1 = new Livro("Java - como programar");
        livro1. setValor(349f);
        livro1.setEsgotado(false);

        Autor autor = new Autor("Deitel", new Date(1945,01,01));
        livro1.setEscritor(autor);
        
       // System.out.println(autor.toString());
        System.out.println(livro1.toString());
    }
}
