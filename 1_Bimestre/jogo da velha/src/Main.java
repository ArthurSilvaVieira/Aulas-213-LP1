import java.util.Scanner;

public class Main {
    public static char JDV[][] = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};

    public static void main (String[]args) {
        Scanner scanner = new Scanner(System.in);

        boolean fim = false;
        while (!fim) {
            //mostrar o jogo atual
            MJogo();
            jogada('X', scanner);
            vitoria();
            MJogo();
            jogada('O', scanner);
            vitoria();
        }

        }
    public static void jogada(char jogador, Scanner scanner) {
        int linha = 0, coluna = 0;
        while (true) {
            System.out.print("Digite a linha da jogada de " + jogador + ": ");
            linha = scanner.nextInt()-1;
            System.out.print("Digite a coluna da jogada de " + jogador + ": ");
            coluna = scanner.nextInt()-1;
            if (JDV[linha][coluna] == ' ') {
                JDV[linha][coluna] = jogador;
                break;
            } else {
                System.out.println("Posição ocupada, tente novamente.");
            }
        }
    }
            public static void vitoria() {
                int vitorcol = 0;
                int vitorlin = 0;
                int vitorDiagonal1 = 0;
                int vitorDiagonal2 = 0;
            // Verificando as linhas e colunas
            for (int i = 0; i < 3; i++) {
                if (JDV[i][0] == JDV[i][1] && JDV[i][1] == JDV[i][2]) {
                    if (JDV[i][0] == 'X') {
                        vitorlin += 1;
                    } else if (JDV[i][0] == 'O') {
                        vitorlin += 2;
                    }
                }
                if (JDV[0][i] == JDV[1][i] && JDV[1][i] == JDV[2][i]) {
                    if (JDV[0][i] == 'X') {
                        vitorcol += 1;
                    } else if (JDV[0][i] == 'O') {
                        vitorcol += 2;
                    }
                }
            }

            // Verificando as diagonais
            if (JDV[0][0] == JDV[1][1] && JDV[1][1] == JDV[2][2]) {
                if (JDV[0][0] == 'X') {
                    vitorDiagonal1 += 1;
                } else if (JDV[0][0] == 'O') {
                    vitorDiagonal1 += 2;
                }
            }
            if (JDV[0][2] == JDV[1][1] && JDV[1][1] == JDV[2][0]) {
                if (JDV[0][2] == 'X') {
                    vitorDiagonal2 += 1;
                } else if (JDV[0][2] == 'O') {
                    vitorDiagonal2 += 2;
                }
            }

            // Verificando o resultado da partida
            if (vitorlin == 3 || vitorcol == 3 || vitorDiagonal1 == 3 || vitorDiagonal2 == 3) {
                System.out.println("Vitória de X!");
                System.exit(0);
            } else if (vitorlin == 6 || vitorcol == 6 || vitorDiagonal1 == 6 || vitorDiagonal2 == 6) {
                System.out.println("Vitória de O!");
                System.exit(0);
            } else if (cheia()) {
                System.out.println("Empate!");
                System.exit(0);
            }
        }

        public static boolean cheia () {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (JDV[i][j] == ' ') {
                        return false;
                    }
                }
            }
            return true;
        }
        //Mostrador de Jogo
        public static void MJogo () {
            System.out.println("     C1     C2     C3  ");
            System.out.println("          |       |");
            for (int j = 0; j < 3; j++) {
                System.out.printf("L" + (j + 1) + " ");
                for (int k = 0; k < 3; k++) {
                    System.out.printf("   " + JDV[j][k]);
                    if (k < 2)
                        System.out.printf("   |");
                    if (k == 2)
                        System.out.println();
                }
                if (j < 2)
                    System.out.println("   -------+-------+--------");
            }
            System.out.println("          |       |");
        }
    }