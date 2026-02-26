import java.util.Scanner;
import component.Convercao;
public class principal{
    public static void main(String [] args){
        /*Print de menu aonde o usuário é informado qual opção escolher */
        /*Chamar método */
        Convercao converter = new Convercao();
        converter.menu();
        /*Criando um objeto da classe Scanner para ler a entrada do usuário */
        Scanner leitura = new Scanner(System.in);
        int opcao = leitura.nextInt();
        /*Estrutura de controle de fluxo para verificar a opção escolhida pelo usuário */
        switch(opcao){
            case 1:
                System.out.println("Digite a Temperatura em Celsius: ");
                double celsius = leitura.nextDouble();
                double farenheit = (celsius * 9/5) + 32;
                System.out.println("A Temperatura em Farenheit é: " + farenheit+" °F");
                break;
            default:
                System.out.println("Opção inválida, por favor escolha uma opção válida.");
                break;
        }
    }
}