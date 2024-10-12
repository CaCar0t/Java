import java.util.Scanner;

public class Testif3 {
    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        System.out.println("Enter Score 1 - 100 : ");
        int marks = sa.nextInt();

        if (marks < 1 || marks > 100){
            System.out.println("Try Again! Please Enter 1 - 100");
        }else {
            if (marks < 50){
                System.out.println("Fail");
            }else if (marks >= 90){
                System.out.println("A+ grade");
            }else if (marks >= 80){
                System.out.println("A grade");
            }else if (marks >= 70){
                System.out.println("B grade");
            }else if (marks >= 60){
                System.out.println("C grade");
            }else if (marks >=50){
                System.out.println("D grade");
            }else{
                System.out.println("Invalid");
            }
        }
    }
}
