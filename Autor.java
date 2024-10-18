public class Autor extends Pessoa {//criação da classe Autor que está herdndo da classe Pessoa
    private String biografia;//Variavel

    //Criação do construtor e dentro há 3 parâmetros do tipo String
    public Autor(String nome, String email, String biografia) {
        super(nome, email);
        this.biografia = biografia;
    }
    //@override Reescreve o método ja herdando da classe Pessoa
    @Override
    public void exibirDetalhes() {
        System.out.println("Autor: " + nome + " - Email: " + email);//Saída, mensagem que aparecerá no terminal
        System.out.println("Biografia: " + biografia);//Saída, mensagem que aparecerá no terminal
    }
}
//Agregação:Pois o autor só tem uma biografia e ele pode existir sem ela