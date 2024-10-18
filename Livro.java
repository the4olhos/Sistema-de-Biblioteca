public class Livro {//crição da classe class
    //variaveis que estão privadas do tipo string
    private String titulo;
    private Autor autor;

    //criação do construtor que tem dois parâmetros do tipo string
    public Livro(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    //criação do método exibirDetalhes do tipo void, sem retorno
    public void exibirDetalhes() {
        System.out.println("Livro: " + titulo);//Saída, mensagem que aparecerá no terminal
        System.out.println("Contém: 416 páginas");// alteração que fizemos//Saída, mensagem que aparecerá no terminal
        autor.exibirDetalhes();//o autor invoca o método
    }
}
//Composição: a Classe Livro depende da existência de um Autor(sem autor não existe livro)
//Está implementado na classe