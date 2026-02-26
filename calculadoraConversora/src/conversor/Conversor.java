package conversor;
import java.util.Scanner;
public class Conversor {
    private float celsius;
    private float resultado;
    //menu
    public void menu(){
        System.out.println("\nDigite 1 - para converter célcius em farenheit: ");
        Scanner leitura = new Scanner(System.in);
        int opcao = leitura.nextInt();
        switch (opcao){
            case (1):
                converterCelsiusFarenheit();
                break;
            default: System.out.print("Opção inválida");
            break; }}
    //métodos de conversão
    public void converterCelsiusFarenheit(){
        System.out.print("Digite o Valor em C°: ");
        //leitura da propriedade
        Scanner leitura = new Scanner(System.in);
        setCelsius(leitura.nextFloat());
        setResultado((getCelsius()*9/5)+32);
        System.out.println("O valor em C°: "+getCelsius()+
        " a converção em F° é: "+getResultado()); }
//getter and setter
    public float getResultado() { return resultado;    }
    public void setResultado(float resultado) { this.resultado = resultado; }
    public float getCelsius() { return celsius; }
    public void setCelsius(float celsius) {this.celsius = celsius; }
}
