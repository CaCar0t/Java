import java.util.*;
import java.lang.Math;

public class TestCircle1 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter Radius : ");
        int i = r.nextInt();
        double pow = Math.pow(i,2);

        double area = pow * Math.PI;
        System.out.println(area);
    }

}
