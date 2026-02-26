public class IntermediariaA extends Conversor {
    private String nome;
    @Override
    public String nome() {
        return "IntermediariaA";
    }
    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public String getNome() {
        return this.nome;
    }    
    public void apresentacao(){
        System.out.println("Olá, eu sou a classe " + nome());
    }
}