package introducao;

public class Pessoa {
    //Atributos(variáveis) são automaticamente inicializados com um valor padrão.
    //int e float é 0;
    //boolean é false;
    //Objeto é zero;
    //Encapsulamento - POJO - Plain Old Java Object
    private String nome;
    private int idade;
    private String CPF;
    private float altura;
    private static String raca;

    public static void mostraRaca(){
        System.out.println(raca);
    }

    public String getCPF() {
        return CPF;
    }
    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public void setCPF(String cPF) {
        CPF = cPF;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    //GETTER e SETTER
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome) {
        if (!nome.equals("")){
            this.nome = nome;
        }
    }
    //public void setNome (String nome){
    //    this.nome = nome;
    //}
    //comportamento
    //construtor - inicializar um objeto e definir valores obrigatórios.
         public          Pessoa                      (String nome){
        System.out.println("CONSTRUTOR:"+nome);
        //this.nome = nome;
        setNome(nome);
    }
    //método (função)
    //assinatura de um método
    //modificadore de acesso/ tipo de retorno / nome do metodo (parâmetros)/ {corpo}
    public String podeDirigir(){
        if(this.idade >=18){
            return "Pode dirigir";
        }else{
            return "Não pode dirigir";
        }
    }
    public void mostraCPF() {
    System.out.println(this.CPF);
    }
}
