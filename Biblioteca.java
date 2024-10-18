public class Biblioteca {//criação da classe Biblioteca
    //variaveis privadas do tipo string
    private String nome;
    private Livro livro;
    private Leitor leitor;

    //construtor com um parâmetro do tipo string
    public Biblioteca(String nome) {
        this.nome = nome;
    }
    //método com um parâmetro do tipo string que a classe Livro esta herdando da classe Pessoa
    public void adicionarLivro(Livro livro) {
        this.livro = livro;
    }
    //método com um parâmetro do tipo string que a classe Leitor esta herdando da classe Pessoa
    public void registarLeitor(Leitor leitor) {
        this.leitor = leitor;
    }
    //método exibirLivro do tipo void, sem retorno
    public void exibirLivro() {
        if (livro != null) {
            livro.exibirDetalhes();
        } else {
            System.out.println("Nenhum livro disponível na biblioteca.");//saida, mensagem que aparecerá no terminal
        }
    }
    //método exibirLeitor do tipo void, sem retorno
    public void exibirLeitor() {
        if (leitor != null) {
            leitor.exibirDetalhes();
        } else {
            System.out.println("Nenhum leitor registrado na biblioteca.");//saida, mensagem que aparecerá no terminal
            System.out.println("Se registre e tenha uma boa leitura!");//alteração de saída que fizemos
        }
    }
}
//Agregação: A classe Biblioteca tem um livro e um leitor, mas ela pode existir sem eles.
