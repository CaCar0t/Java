import java.util.InputMismatchException;
import java.util.Scanner;

public class Post5 {
    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        System.out.println("Word : ");

        try {
            String str = sa.nextLine();
            System.out.println(str);
            str = str.toLowerCase();
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
                        || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                        || str.charAt(i) == 'u') {
                    count++;
                }
            }
            int conso = str.length()-count;
            System.out.println("Vowell : " + count);
            System.out.println("Consonant : "+conso);
        }catch (InputMismatchException e) {
            System.out.println("Error");
        }
    }
}