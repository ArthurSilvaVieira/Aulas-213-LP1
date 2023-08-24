package entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "pedido")
public class Pedido {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne(cascade =  CascadeType.ALL)
    @JoinColumn(name = "pessoa_id")
    private Pessoa pessoa;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "pedido_produto", joinColumns = @JoinColumn(name = "pedido_id"), inverseJoinColumns = @JoinColumn(name = "produto_id"))
    private List<Produto> produtos;
    @Column
    private Double precototal;

    public Pedido(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Pedido(Pessoa pessoa, List<Produto> produtos ) {
        this.produtos = produtos;
        this.pessoa = pessoa;


    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", pessoa=" + pessoa +
                ", produtos=" + produtos +
                '}';
    }

    public void addProduto(){

    }
}
