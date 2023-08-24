package JPA;

import entity.Pedido;
import entity.Pessoa;
import entity.Produto;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //gerenciaPessoas();
        gerenciaPedido();
        //gerenciaProduto();

    }

    public static void gerenciaPessoas(){
        Pessoa pessoazinha = new Pessoa("Creeper", "Pig", "creeper.pig@gmail.com");
        Pessoa pessoazona = new Pessoa("Enderman", "Human", "Ender.Man@gmail;com");
        Pessoa pessoa = new Pessoa("Sai", "tama", "Saitama@gmail.com");
        Pessoa cavaleironegro = new Pessoa("Gu", "ts", "guts@gmail.com");

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(cavaleironegro);
        session.persist(pessoa);
        session.persist(pessoazinha);
        session.persist(pessoazona);

        transaction.commit();

        List<Pessoa> pessoas = session.createQuery("from Pessoa", Pessoa.class).list();

        pessoas.forEach(p -> System.out.println(p.toString()));
    }
    public static void gerenciaPedido(){
        Pessoa pessoazinha = new Pessoa("Creeper", "Pig", "creeper.pig@gmail.com");
        Produto product = new Produto("Creeper", 432.22);
        Produto product2 = new Produto("Enderman", 473.22);

        Session session = HibernateUtil.getSessionFactory().openSession();

        Pedido pedido = new Pedido(pessoazinha, Arrays.asList(product, product2));
        Transaction transaction = session.beginTransaction();


        session.persist(pedido);
        transaction.commit();

        List<Pedido> pedidos = session.createQuery("from Pedido", Pedido.class).list();


        pedidos.forEach(p -> System.out.println(p));
    }
    public static void gerenciaProduto(){
        Produto podutro = new Produto("Iron Golem", 2000.00);

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(podutro);


        transaction.commit();

        List<Produto> podutros = session.createQuery("from Produto", Produto.class).list();

        podutros.forEach(p -> System.out.println(p.toString()));
    }
}
