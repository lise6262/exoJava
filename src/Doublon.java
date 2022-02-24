
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Doublon {
    public static void main(String[] args) {
        ArrayList<String> noms = new ArrayList<String>();
        noms.add("Georges");
        noms.add("Mickael");
        noms.add("Bruce");
        noms.add("Georges");

        System.out.println("Contenu avec doublon: " + noms);

        Set<String> hashet = new HashSet<String>(noms);

        List<String> nomsSansDoublons = new ArrayList<String>(hashet);

        System.out.println("Contenu sans doublon: " + nomsSansDoublons);
    }
}