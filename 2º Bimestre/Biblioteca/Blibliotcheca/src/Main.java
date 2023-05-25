//import java.util.ArrayList;
import java.util.Arrays;

    public class Main {

        public static void main(String[] args) {

            Biblioteca biblioteca = new Biblioteca("Biblioteca", new Dono("CLAUDIO", 13));
            biblioteca.addLivro(new Livro("Ljiranaide Nagatoro-San", "SEI LA", 99999));
            biblioteca.addFunc(new Funcionarios("Adalberto",  50231313));
            biblioteca.addLivro(new Livro("Berserk", "Miura", 376));
            biblioteca.addFunc(new Funcionarios("Etevaldo",  542234253));
       biblioteca.Mlivros();
       biblioteca.MFunc();



        }
    }

