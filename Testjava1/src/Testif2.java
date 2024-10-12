import java.util.Scanner;

public class Testif2 {
    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        System.out.println("Enter Number 1 - 10 : ");
        int num = sa.nextInt();

        if(num < 1 || num > 10){
            System.out.println("Try Again!! please enter 1 - 10");
        }else{
            if(num > 5){
                System.out.println("Num more than 5");
            }
            else if(num < 5){
                System.out.println("Num less than 5");
            }
        }
    }
}
