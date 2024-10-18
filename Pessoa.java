abstract class Pessoa {//classe abstrata não pode ser instanciada e serve de modelo para outras classes
    //variaveis do tipo string e estão privadas
    protected  String nome;
    protected  String email;

    //criação do construtor e dentro tem 2 parâmetros do tipo string
    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
    //método exibirDetalhes que é sem retorno (void) e abstract (serve de modelo)
    public abstract void exibirDetalhes();
}
//Classe Abstrata: A classe Pessoa abstrata, pois ela torna os atirbutos e comportamentos comuns entre Leitor e autor.
//O método abstrato exibirDetalhes() é implementado nas subclasses