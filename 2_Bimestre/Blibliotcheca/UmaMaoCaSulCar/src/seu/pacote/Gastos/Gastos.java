package seu.pacote.Gastos;

public abstract class Gastos {

    String nome;
    Double valor;

    public Gastos(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
    }
    public abstract double Mudarvalor();
}
