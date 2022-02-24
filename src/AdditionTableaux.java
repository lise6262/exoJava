import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdditionTableaux {
    public static void main(String args[]) {
        int [] tab1 = new int[]{1,2};
        int [] tab2= new int[]{3,4};
        List<Integer> tab3 = new ArrayList<Integer>();
        int somme;

        for (int premierElement : tab1) {
            for (int secondElement : tab2) {
                    somme = premierElement + secondElement;
                    tab3.add(somme);
                 }
            }
        System.out.println("les tableaux : " +Arrays.toString(tab1) + " + " +Arrays.toString(tab2));
        System.out.println(tab3);
    }
}
