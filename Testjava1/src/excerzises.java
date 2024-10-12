import java.util.InputMismatchException;
import java.util.Scanner;

public class excerzises {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int[] numbers = new int[10];
        try {
            System.out.println("Enter Your Numbers : ");
            for (int i = 0; i < 10; i++) {
                System.out.println("Number " + (i + 1) + ": ");
                numbers[i] = sn.nextInt();
            }
            int max = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] > max) {
                    max = numbers[i];
                }
            }
            System.out.println("Max Vaule : "+max);
        }catch (InputMismatchException e){
            System.out.println("Error");
        }



    }
}
