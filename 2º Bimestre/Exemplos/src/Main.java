

import java.util.ArrayList;
import java.util.Arrays;

    public class Main {

        public static void main(String[] args) {
            Biblioteca biblioteca = new Biblioteca("Biblioteca", new Dono("CLAUDIO", 13), Arrays.asList(new Livro("Berserk", "Miura", 376), new Livro("One Punch Man", "One Murata", 220)), Arrays.asList(new Funcionarios("Arthur", 13)));
        }
    }

