import java.util.Arrays;


public class ElementsEgaux {

    public static void main(String[] args) {

        int[] tab1 = new int[]{1, 5, 4, 88, 45, 55, 44};
        int[] tab2 = new int[]{1, 47, 5, 88, 77, 55};

        if (Arrays.equals(tab1, tab2)) {
            System.out.println("egaux");

        } else {
            System.out.println(" non egaux");
        }
        for (int premierElement : tab1) {
            for (int secondElement : tab2) {
                if (premierElement == secondElement) {
                    System.out.println("les 2 tableaux contiennent la valeur " + premierElement);
                }
            }
        }
    }
}

