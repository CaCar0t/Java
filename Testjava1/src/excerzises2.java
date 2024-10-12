import java.util.InputMismatchException;
import java.util.Scanner;

public class excerzises2 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int[] numbers = new int[10];
        try {
            System.out.println("Enter Your Numbers : ");
            for (int i = 0; i < 10; i++) {
                System.out.println("Number " + (i + 1) + ": ");
                numbers[i] = sn.nextInt();
            }
            int min = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] < min) {
                    min = numbers[i];
                }
            }
            System.out.println("Min Vaule : " + min);
        }catch (InputMismatchException e){
            System.out.println("Error");
        }


    }
}
