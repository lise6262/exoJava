import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AjoutElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> liste = new ArrayList<Integer>();

        liste.add(5);
        liste.add(6);
        liste.add(7);
        liste.add(8);
        liste.add(9);

        System.out.println(liste);
        System.out.println("ajouter un chiffre");
        Integer ajout = scanner.nextInt();

        liste.add(ajout);

        System.out.println(liste);

    }
}
