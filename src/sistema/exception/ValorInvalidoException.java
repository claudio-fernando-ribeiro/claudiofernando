package sistema.exception;

public class ValorInvalidoException extends Exception{
    //msg de erro + campo + Exception

    private String nomeCampo = "";
    //sobrecarga de métodos
    public ValorInvalidoException(String mensagem, Exception origem, String nomeCampo) {
    this(mensagem, origem);
    this.nomeCampo = nomeCampo;
    }

    public ValorInvalidoException(String mensagem, Exception origem) {
    super(mensagem, origem);//supere se refere a SuperClasse (PAI) exception
    //super(); chama o construtor da superClasse
    }
    
}
