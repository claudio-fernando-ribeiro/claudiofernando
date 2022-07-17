package introducao.exercicio4;

public class Funcionaria extends PessoaFisica {
    private String funcao;
    private long id;

    public long getId() {
        return id;
    }
    public String getFuncao() {
        return funcao;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    public void setId(long id) {
        this.id = id;
    }

    
}
