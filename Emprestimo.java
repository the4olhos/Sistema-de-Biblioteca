public class Emprestimo {//criação da classe Eprestimo
    //variaveis privadas do tipo string e estão nas classes Livro e Leitor que estão herdando da classe Pessoa
    private Leitor leitor;
    private Livro livro;

    //construtor com dois parâmetros do tipo String
    public Emprestimo(Leitor leitor, Livro livro) {
        this.leitor = leitor;
        this.livro = livro;
    }
    //método exibirDetalhes do tipo void(sem returno)
    public void exibirDetalhes() {
        System.out.println("Empréstimo realizado:");//saida, mensagem que aparecerá no terminal
        leitor.exibirDetalhes();//a classe Leitor invoca exibiDetalhes
        livro.exibirDetalhes();//a classe Livro chama exibirDetalhes
        System.out.println("Volte Sempre!");//Alteração de saída que fizemos
    }
}

//Dependência: A Classe Emprestimo depende tanto de um Leitor quanto de um livro. Sem esses objetos, Não se cria um empréstimo