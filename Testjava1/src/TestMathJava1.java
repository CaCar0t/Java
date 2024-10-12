import java.util.Scanner;
import java.lang.Math;

public class TestMathJava1 {
    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        System.out.println("Enter x : ");
        int x = sa.nextInt();

        Scanner sb = new Scanner(System.in);
        System.out.println("Enter y : ");
        int y = sb.nextInt();

        int min = Math.min(x,y);
        int max = Math.max(x,y);

        System.out.println("Min is : "+ min);
        System.out.println("Max is : "+ max);

    }
}
