package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "produto")
public class Produto {
    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String nome;
    @Column
    private Double preco;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
