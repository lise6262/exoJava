import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DedoublonnerListe {
    public static void main(String args[]) {
        List<Integer> liste = new ArrayList<Integer>();
        liste.add(1);
        liste.add(2);
        liste.add(5);
        liste.add(7);
        liste.add(1);
        liste.add(7);

        System.out.println("liste avec doublons" + liste);

        List<Integer >listeSansDoublon = liste.stream()
                .sorted()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("liste sans doublons"+listeSansDoublon);


    }
}
