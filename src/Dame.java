import java.util.Scanner;

public class Dame {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        boolean fin = false;

        System.out.println("Dans quel ligne voulez-vous placé ? (4)");
        int ligne = scanner.nextInt();

        System.out.println("Dans quel colonne voulez-vous placé ?(5) ");
        int colonne = scanner.nextInt();

        jeux(ligne, colonne);

        do {
            System.out.println("Quel mouvement voulez- vous faire ?" +
                    " 0 (en haut à gauche)," +
                    " 1 (en haut à droite), " +
                    "2 (en bas à gauche), " +
                    "3 (en bas à droite) "
            );
            int mouvement = scanner.nextInt();

            switch (mouvement) {
                case 0:
                    ligne--;
                    colonne--;
                    break;
                case 1:
                    ligne--;
                    colonne++;
                    break;
                case 2:
                    ligne++;
                    colonne--;
                    break;
                case 3:
                    ligne++;
                    colonne++;
                    break;
            }
            if (ligne == 0 || colonne == 0 || ligne == 5 || colonne == 6) {
                System.out.println("Vous êtes sortis du damier ! Fin du jeu ! ");
                fin = true;
            }
            else {
                jeux(ligne, colonne);
            }
        } while (fin==false);
    }

    private static void jeux(int ligne, int colonne) {
        int i;
        int j;
        int[][] tableau;
        tableau = new int[5][6];
        for ( i = 1;i < tableau.length; i++) {
            for ( j = 1;j < tableau[i].length;j++) {
                if ( j == colonne && i == ligne){
                    System.out.print("X");
                }
                System.out.print(tableau[i][j] + " ");
            }
            System.out.println();
        }
    }
}
