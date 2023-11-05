package br.art.gerenciartarefasescolares.model;

import jakarta.persistence.*;
@Table
@Entity
public class Disciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String nome;

    public Disciplina(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
            return "Disciplina{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
