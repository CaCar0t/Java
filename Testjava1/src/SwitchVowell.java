import java.util.InputMismatchException;
import java.util.Scanner;

public class SwitchVowell {
    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        System.out.println("Enter a - z : ");

        try{
            char ch = sa.next().charAt(0);
            char ch1 = Character.toLowerCase(ch);
            switch (ch1) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(ch + " is Vowel");
                    break;
                default:
                    System.out.println(ch + " is Consonant");
            }
        }catch(InputMismatchException e){
            System.out.println("Error");
        }
    }
}
