package seu.pacote.Gastos;


public class Fixo extends Gastos {
    public Fixo(String nome, Double valor) {
        super(nome, valor);

    }

    @Override
    public double Mudarvalor() {
        return 0;
    }
}
