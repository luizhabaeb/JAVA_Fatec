public class Carro{

    //atributos de classe
    String placa;
    double potencia;
    String modelo;
    String cor;
    String marca;
    boolean cambio_automatico;
    int ano;
    float preço;


    // metodos construtor apenas no ato da instancia
    public Carro(String placa, double potencia, String modelo, String cor,
     String marca, boolean cambio_automatico, int ano){

        this.placa = placa;
        this.potencia = potencia;
        this.modelo = modelo;
        this.cor = cor;
        this.marca = marca;
        this.automatico = automatico;
        this.ano = ano;
    }

    //metodo de acesso aos atributos
    public void set_cor(String novacor){
        cor = novacor;
    }

    public void Informacao(){

        System.out.println("Placa: " + placa + "\n" +
        "Potencia: " + potencia + "\n" +
        "Modelo: " + modelo + "\n" +
        "Cor: " + cor + "\n" +
        "Automatico: " + automatico + "\n" +
        "Ano: " + ano + "\n" + "\n");
    }


    public static void main(String[] args) {

        Carro C1 = new Carro("GAR3543", 1.0, "Onix", "Preto", "Chevrolet", true, 2022);
        Carro C2 = new Carro("MAC4200", 2.0, "Sonata", "Branco", "Hyundai", true, 2019);

        C1.Informacao();
        C2.Informacao();
        
        C1.set_cor("Cinza");
        C1.Informacao();
    }

}