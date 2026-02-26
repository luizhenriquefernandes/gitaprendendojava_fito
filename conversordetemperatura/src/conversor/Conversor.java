package conversor;
import java.util.Scanner;

public class Conversor {
    private float celsius;
    private float resultado;
    public void menu(){
        System.out.print("\nDigite 1 para Converter C° em Fº: ");
        Scanner leitura = new Scanner(System.in);
        int opcao = leitura.nextInt();
        switch (opcao){
            case 1:
                conveterCelsiusFarenheit();
                break;
                default:
                System.out.println("Digite uma opção v´lida");
                break;
        }
    }

    public void conveterCelsiusFarenheit(){
        System.out.print("Digite o valor em C°: ");
        Scanner leitura = new Scanner(System.in);
        setCelsius(leitura.nextFloat());
        //fórmula matemática
        setResultado((getCelsius()*9/5)+32);
        System.out.println("O valor em Cº:"+getCelsius()+
        " a converção em F°: "+getResultado());
    }


    //getters and setters ou métodos mutantes e acessores

    public float getResultado() {return resultado; }
    public void setResultado(float resultado) {this.resultado = resultado;}
    public float getCelsius() {return celsius;}
    public void setCelsius(float celsius) {this.celsius = celsius;}
}
