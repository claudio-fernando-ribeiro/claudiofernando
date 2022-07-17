import introducao.Aplicativo;
import introducao.Celular;
import introducao.Pessoa;


public class App {
    public static void main(String[] args) throws Exception {
        //Criando uma variável do tipo pessoa
        //Criando uma instância de objeto a partir da classe Pessoa
        Pessoa zezinho = new Pessoa("Laranja");
        //quando fazemos isso nossa isntância passa de classe a objeto, carregando suas informações.
        zezinho.setNome("Zezinha da Silva Sauro");
        zezinho.setCPF("555.555.555-16");
        zezinho.setAltura(1.75f); 
        zezinho.setIdade(33);
        zezinho.setRaca("A");
        System.out.println(zezinho.getNome() + " Raça: " + zezinho.getRaca());

        Pessoa luizinho = new Pessoa("Limão");
        luizinho.setRaca("B");
        System.out.println(luizinho.getNome() + " Raça: " + luizinho.getRaca());
        //luizinho.nome = "Luizinho da Silva Sauro Jr";
        
        System.out.println(zezinho.getNome());
        System.out.println(zezinho.getCPF());
        System.out.println(zezinho.getAltura());
        System.out.println(zezinho.getIdade());
        System.out.println(luizinho.getNome()); 
        System.out.println(luizinho.getCPF()); 
        System.out.println(luizinho.getIdade()); 
        System.out.println(luizinho.getAltura()); 
        
        String guardaResultado = zezinho.podeDirigir();
        System.out.println(guardaResultado);
        guardaResultado = luizinho.podeDirigir();
        System.out.println(guardaResultado);

        zezinho.mostraCPF();
        luizinho.mostraCPF();

        Celular startak = new Celular("(47) 99999-5555");
        startak.setModelo("PT 550");
        startak.setMarca("Motorola");

        startak.setDono(zezinho);
       
        Aplicativo app1 = new Aplicativo("Angry Birds");
        Aplicativo app2 = new Aplicativo("Whatsapp");
        Aplicativo app3 = new Aplicativo("Tiktok");
        Aplicativo app4 = new Aplicativo("instagram");

        startak.getListaAplicativos().add(app1);
        startak.getListaAplicativos().add(app2);
        startak.getListaAplicativos().add(app3);
        startak.getListaAplicativos().add(app4);

        for(int i=0; i< startak.getListaAplicativos().size(); i++){
            System.out.println(startak.getListaAplicativos().get(i).getNome());        
        }
        // for each = PARA CADA
        for(Object umApp:startak.getListaAplicativos()){
            System.out.println(umApp);
        }
 
    }
}
