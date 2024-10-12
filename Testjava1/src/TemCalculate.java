import java.util.Scanner;

public class TemCalculate {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int[] temp = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Your temp : "+(i + 1)+":");
            temp[i] = sn.nextInt();
        }
        int far = temp[0];
        for (int i = 0; i < temp.length;i++){
            System.out.println("Your temp : "+(far));
        }
    }
}
