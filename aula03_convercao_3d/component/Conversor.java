package component;
import java.util.Scanner;
public class Conversor {
    private double celsius;
    private double fahrenheit;
    private int opcao;
    private int escolha;
    /**Fazendo o menu */
    public void menu(){
        System.out.println("Digite 1- para converter Celsius para Fahrenheit");
        System.out.println("Digite 2- para converter Fahrenheit para Celsius");
        System.out.println("Digite 3- para converter Kelvin para Celsius");
        System.out.println("Digite 4- para converter Celsius para Kelvin");
    }
    /**fazendo a escolha para chamar o método correto */
    public void escolha(){
        Scanner leitura = new Scanner(System.in);
        int escolha = leitura.nextInt();
        switch(escolha){
            case 1:
                System.out.println("Digite a temperatura em Celsius");
                double celsius = leitura.nextDouble();
                double fahrenheit = converterCelsiusParaFahrenheit(celsius);
                System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
                break;
            case 2:
                System.out.println("Digite a temperatura em Fahrenheit");
                double fahrenheit2 = leitura.nextDouble();
                double celsius2 = converterFahrenheitParaCelsius(fahrenheit2);
                System.out.println("A temperatura em Celsius é: " + celsius2);
                break;
            case 3:
                System.out.println("Digite a temperatura em Kelvin");
                double kelvin = leitura.nextDouble();
                double celsius3 = converterKelvinParaCelsius(kelvin);
                System.out.println("A temperatura em Celsius é: " + celsius3);
                break;
            case 4:
                System.out.println("Digite a temperatura em Celsius");
                double celsius4 = leitura.nextDouble();
                double kelvin2 = converterCelsiusParaKelvin(celsius4);
                System.out.println("A temperatura em Kelvin é: " + kelvin2);
                break;
            default:
                System.out.println("Opção inválida");
                break;        
        }

    }
    /**Fazendo o método para o cálculo das operações    */
    public double converterCelsiusParaFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
    public double converterFahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
    public double converterKelvinParaCelsius(double kelvin) {
        return kelvin - 273.15;
    }
    public double converterCelsiusParaKelvin(double celsius) {
        return celsius + 273.15;
    }
/**Construtor */
    public Conversor(double celsius, double fahrenheit, int opcao) {
        this.celsius = celsius;
        this.fahrenheit = fahrenheit;
        this.opcao = opcao;
    }
    public Conversor() {
        this.celsius = 0;
        this.fahrenheit = 0;
        this.opcao = 0;
    }
    /**Getters e Setters */
    public int getEscolha() {
        return escolha;
    }
    public void setEscolha(int escolha) {   
        this.escolha = escolha;
    }
    public double getCelsius() {
        return celsius;
    }
    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }
    public double getFahrenheit() {
        return fahrenheit;
    }
    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }
    public int getOpcao() {
        return opcao;
    }
    public void setOpcao(int opcao) {
        this.opcao = opcao;
    }
}
