package component;
public class Convercao {
    private double celsius;
    private int opcao;
    /*Métodos de apresentação menu */
    public void menu(){
        System.out.println("Olá digite 1 para converter Celsius em Farenheit: ");
    }
    // Construtor da classe Convercao para inicializar os atributos celsius e opcao
    public Convercao(double celsius, int opcao){
        this.celsius = celsius;
        this.opcao = opcao;
    }
    public Convercao(){
        this.celsius = 0.0;
        this.opcao = 0;
    }
    public double getCelsius(){
        return celsius;
    }
    public int getOpcao(){
        return opcao;
    }
    public void setCelsius(double celsius){
        this.celsius = celsius;
    }
    public void setOpcao(int opcao){
        this.opcao = opcao;
    }

}
