import java.util.*;

public class TestRec1 {
    public static void main(String[] args) {
        Scanner fir = new Scanner(System.in);
        System.out.println("Enter First : ");

        Scanner sec = new Scanner(System.in);
        System.out.println("Enter Second : ");

        int length = fir.nextInt();
        int width = sec.nextInt();

        System.out.println("First is : " + fir);
        System.out.println("Second is : " + sec);

        int area = length * width ;

        System.out.println(area);


    }
}
