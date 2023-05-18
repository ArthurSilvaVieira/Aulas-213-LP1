package seu.pacote.Gastos;


public class Lazer extends Gastos {
 boolean importante;
    public Lazer(String nome, Double valor, boolean importante) {
        super(nome, valor);
        this.importante = importante;
    }

    @Override
    public double Mudarvalor(){
        valor = valor*1.05;
        return valor;
    }

}
