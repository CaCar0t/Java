import java.util.InputMismatchException;
import java.util.Scanner;

public class Post5Sub {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int vowel = 0 , con = 0;
        System.out.println("Input Sentence : ");
        try {
            String str = sn.nextLine();
            for(int i = 0 ; i < str.length();i++){
                String str1 = str.substring(i,i+1);
                if(str1.equalsIgnoreCase("a")||str1.equalsIgnoreCase("e")||str1.equalsIgnoreCase("i")||str1.equalsIgnoreCase("o")||str1.equalsIgnoreCase("u"));
                vowel++;
            }
            con++;
        }catch (InputMismatchException e){
            System.out.println("Error");
        }
        System.out.println("Vowel : "+ vowel);
        System.out.println("Consonant : "+ con);
    }
}
