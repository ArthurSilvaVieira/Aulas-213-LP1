package JPA;

import entity.Pessoa;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.List;

public class Main {
    public static void main(String[] args) {
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
}
