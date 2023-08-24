package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "enderecos")

public class Endereco {

    public Endereco(String rua, String cidade) {
        this.rua = rua;
        this.cidade = cidade;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int Id;
    @Column
    private String rua;
    @Column
    private String cidade;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "Id=" + Id +
                ", rua='" + rua + '\'' +
                ", cidade='" + cidade + '\'' +
                '}';
    }
}
