import java.util.InputMismatchException;
import java.util.Scanner;

public class InputCharDetect {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter Character : ");
        char detec = sn.next().charAt(0);

        try{
            if((detec >='a' && detec <='z') || (detec >='A' && detec <= 'Z')){
                System.out.println("Your Character is : "+detec+" Not Number");
            }else{
                System.out.println("Your Character is : "+detec+" It's Number");
            }
        }catch (InputMismatchException e){
            System.out.println("Error");
        }
    }
}



