public class Livro {
    private String nome;
    private String autor;
    private int numeroPaginas;

    public Livro(String nome, String autor, int numeroPaginas) {
        this.nome = nome;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    // Getters e setters
}
