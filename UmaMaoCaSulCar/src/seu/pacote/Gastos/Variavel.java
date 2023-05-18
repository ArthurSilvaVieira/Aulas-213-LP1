package seu.pacote.Gastos;

import seu.pacote.Gastos.Gastos;

public class Variavel extends Gastos {
    int tempomeses;
    public Variavel(String nome, Double valor, int tempomeses) {
        super(nome, valor);
        this.tempomeses = tempomeses;
    }

    @Override
    public double Mudarvalor() {
        return 0;
    }
}
