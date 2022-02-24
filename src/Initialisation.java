import java.util.Arrays;
import java.util.Scanner;
public class Initialisation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quelle est la taille du tableau  ?  ");
        int taille = sc.nextInt();
        int tab[] = new int[taille];

        System.out.println("Entrez les éléments du tableau  : ");
        for(int i=0; i < taille; i++) {
            tab[i] = sc.nextInt();
        }
        System.out.println("Les éléments du tableau " + Arrays.toString(tab));
    }
}