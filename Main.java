//classe principal
public class Main {
    public static void main(String[] args) {//método executor
        //criação dos objetos
        Autor autor1 = new Autor("Geoger Orwell", "orwell@email.com","Autor de clássicos como Revolução dos Bichos.");
        Livro livro1 = new Livro("1984", autor1);
        Leitor leitor1 = new Leitor("Maria Da Silva", "maria.silva@email.com", 101);
        Biblioteca biblioteca = new Biblioteca("Biblioteca Municipal");
        //biblioteca chama os métodos adicionar livro e registrar leitor
        biblioteca.adicionarLivro(livro1);
        biblioteca.registarLeitor(leitor1);

        System.out.println("Livros na biblioteca:");//saida, mensagem que aparecerá no terminal
        biblioteca.exibirLivro();//classe biblioteca chama o método exibirLivro

        System.out.println("\nLeitor registrado:");//saida, mensagem que aparecerá no terminal
        biblioteca.exibirLeitor();//classe bibloteca chama o método exibirLeitor

        Emprestimo emprestimo = new Emprestimo(leitor1, livro1);//criação do objeto
        System.out.println("\nDetalhes do Empréstimo:");//saida, mensagem que aparecerá no terminal
        emprestimo.exibirDetalhes();//classe emprestimo chama o metodo exibirDetalhes
    }
}