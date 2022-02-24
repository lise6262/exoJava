import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]) {

            String mot;
            Scanner scanner = new Scanner(System.in);

            System.out.println("Entrer un mot ");
            mot = scanner.nextLine();

            if (palindrome(mot))
                System.out.println("Le mot '"+mot + "' est un palindrome");
            else
                System.out.println("Le mot '"+mot + "' n'est pas un palindrome");
        }

        public static boolean palindrome(String mot){
            int i=0, longueur=mot.length()-1;
            boolean egale=true;

            while(i<longueur/2 && egale){
                if(mot.charAt(i)==mot.charAt(longueur-i))
                    egale = true;
                else
                    egale = false;
                i++;
            }
            return egale;

    }
}

