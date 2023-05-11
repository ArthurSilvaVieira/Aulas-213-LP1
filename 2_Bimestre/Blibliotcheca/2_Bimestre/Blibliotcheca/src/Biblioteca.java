import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Biblioteca {
    private String nome;
    private Dono dono;
    private List<Livro> livros = new ArrayList<>();
    private List<Funcionarios> coitados = new ArrayList<>();

    public Biblioteca(String nome, Dono dono) {
        this.nome = nome;
        this.dono = dono;
    }

    public void Mlivros() {
        for (int i = 0; i < livros.size(); i++) {
            System.out.println("Livro: "+livros.get(i).getNome());
            System.out.println("Autor: "+livros.get(i).getAutor());
            System.out.println("Numero de Pg: "+livros.get(i).getNumeroPaginas());
        }
    }

    public void addLivro(Livro livro) {
        livros.add(livro);
    }

    public void addFunc(Funcionarios funcionarios) {
        coitados.add(funcionarios);
    }

    public void MFunc() {
        for (int i = 0; i < coitados.size(); i++) {
            System.out.println("Funcionário: "+coitados.get(i).getNome());
            System.out.println("CPF: "+coitados.get(i).getCpf());
        }
    }
}
