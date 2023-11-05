package br.art.gerenciartarefasescolares.model;

import jakarta.persistence.*;

import java.time.LocalDate;
@Table
@Entity
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String titulo;
    @Column
    private String descricao;
    @Column
    private LocalDate dtEntrega;
    @Column
    private Integer ano;
    @Column
    private Integer mes;
    @Column
    private Integer dia;
    @Column
    private Boolean status;
    @Column
    private Disciplina disciplina;
    @Column
    private Categoria categoria;

    public Tarefa(String titulo, String descricao, Integer ano, Integer mes, Integer dia, Boolean concluido, Disciplina disciplina, Categoria categoria) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
        this.status = concluido;
        this.disciplina = disciplina;
        this.categoria = categoria;
        dtEntrega = LocalDate.of(ano, mes, dia);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDtEntrega() {
        return dtEntrega;
    }

    public void setDtEntrega(LocalDate dtEntrega) {
        this.dtEntrega = dtEntrega;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dtEntrega=" + dtEntrega +
                ", ano=" + ano +
                ", mes=" + mes +
                ", dia=" + dia +
                ", status=" + concluido(status) +
                ", disciplina=" + disciplina +
                ", categoria=" + categoria +
                '}';
    }
    public String concluido(Boolean estado){
        if (estado == true)
            return "Concluido";
        else
            return "Pendente";
    }
}
