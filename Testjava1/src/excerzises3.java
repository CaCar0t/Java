import java.util.InputMismatchException;
import java.util.Scanner;
public class excerzises3{
    public static void main(String args[]){
        int count = 0;
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter Your Word : ");

        try {
            String word = sn.nextLine();
            int n = word.length();

            for (int i = 0; i < n; i++) {
                if (Character.isUpperCase(word.charAt(i)))
                    count++;
            }
            if (word.length() > 30) {
                String cutword = word.substring(0, 30);
                word = cutword;
                System.out.println("Your word : " + word);
            }

            System.out.println("Upper Case : " + count);
            System.out.println("Your Word Length : " + word.length());
        }catch (InputMismatchException e){
            System.out.println("Error");
        }
    }
}