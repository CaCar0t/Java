import java.util.Scanner;
import java.lang.Math;

public class TestMath2 {
    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int x = sa.nextInt();

        Double squrt = Math.sqrt(x);
        System.out.println(squrt);
    }
}
