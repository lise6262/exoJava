import java.util.Scanner;

public class Celsius {

    public static void main(String[] args){

       double temperature;

        System.out.println("Entrez une température en celsius");
        Scanner celsius = new Scanner(System.in);
        temperature = celsius.nextDouble();
        double fahrenheit = (temperature * 9/5)+32 ;
        System.out.println("la temperature en fahrenheint " + fahrenheit);

    }
}
