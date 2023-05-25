import java.util.List;

class Biblioteca {
    private String nome;
    private Dono dono;
    private List<Livro> livros;
    private List<Funcionarios> coitados;

    public Biblioteca(String nome, Dono dono, List<Livro> livros, List<Funcionarios> coitados) {
        this.nome = nome;
        this.dono = dono;
        this.livros = livros;
        this.coitados = coitados;
    }
}
