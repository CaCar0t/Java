import java.util.InputMismatchException;
import java.util.Scanner;

public class TaxCalculate {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        double[] moneys = new double[10];
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Person " + (i + 1) + ":");
                moneys[i] = sn.nextDouble();
            }
            double tax = moneys[0];
            for (int i = 0; i < moneys.length; i++) {
                if (moneys[i] < 100000) {
                    System.out.println("Your tax is : " + (tax*0.05));
                }
                if (moneys[i] == 100000) {
                    System.out.println("Your tax is : " + (tax*0.1));
                }
                if (moneys[i] < 500000) {
                    System.out.println("Your tax is : " + (tax*0.1));
                }
                if (moneys[i] == 500000) {
                    System.out.println("Your tax is : " + (tax*0.2));
                }
                if (moneys[i] < 1000000) {
                    System.out.println("Your tax is : " + (tax*0.2));
                }
                if (moneys[i] == 1000000) {
                    System.out.println("Your tax is : " + (tax*0.3));
                }
                if (moneys[i] < 4000000) {
                    System.out.println("Your tax is : " + (tax*0.3));
                } else {
                    System.out.println("Your tax is : " + (tax*0.37));
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Error");
        }
    }
}