import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Tableau {
    public static void main(String[] args) {
        int[] tableau = {1,5,2,8,3};

        int max = tableau[0];

        for (int i : tableau) {
            if (i > max)
                max = i;
        }

        System.out.println("le nombre maximum est  = " + max);

        IntStream intStream = Arrays.stream(tableau);
        OptionalInt optionalInt = intStream.max();
        int maximum = optionalInt.getAsInt();

        System.out.println("Maximum par stream = " + maximum);
    }

}
