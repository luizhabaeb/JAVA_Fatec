public class Funcionario{

    //atributos de classe
    String nome;
    int idade;
    String email;
    int telefone;
    String cargo;


    // metodos construtor apenas no ato da instancia
    public Funcionario(String nome, String cargo, String email, int idade, int telefone){

        this.nome = nome;
        this.cargo = cargo;
        this.email = email;
        this.idade = idade;
        this.telefone = telefone;

    }

    public void Informacao(){

        System.out.println("Nome: " + nome + "\n" +
        "Cargo: " + cargo + "\n" +
        "Email: " + email + "\n" +
        "Idade: " + idade + "\n" +
        "Telefone: " + telefone + "\n" + "\n");
    }


    public static void main(String[] args) {

        Funcionario C1 = new Funcionario("Luiz", "DEV", 26, "luiz@gmail.com.br", 991103399);
        Funcionario C2 = new Funcionario("Guilherme", "Suporte", 22, "guilherme@gmail.com", 992234465);

        C1.Informacao();
        C2.Informacao();
        
    }

}