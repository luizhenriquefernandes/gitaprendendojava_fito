import conversor.Conversor;
import conversor.Therian;

public class Main {
    public static void main(String[] args) {
        Conversor cliente = new Conversor();
        cliente.setNome("João");
        System.out.println(cliente.getNome());
        cliente.setIdade(17);
        System.out.println(cliente.getIdade());
    }
}
