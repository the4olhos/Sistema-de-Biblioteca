public class Leitor extends Pessoa {//criação da classe Leitor que está herdando da classe Pessoa
    private int numeroDeLeitor;//variavel do tipo int e está privada

    //criação do construtor e tem 3 parâmetos dois do tipo string e um do tipo int
    public Leitor(String nome, String email, int numeroDeLeitor) {
        super(nome, email);
        this.numeroDeLeitor = numeroDeLeitor;
    }
    //@Override reescreve o método
    @Override
    public void exibirDetalhes() {
        System.out.println("Leitor: " + nome + " - Email: " + email);//Saída, mensagem que aparecerá no terminal
        System.out.println("Número de leitor: " + numeroDeLeitor);//Saída, mensagem que aparecerá no terminal
    }
}
//Associação: Está Classe está associada a classe biblioteca, pois um leitor pode ser registrado em uma biblioteca.