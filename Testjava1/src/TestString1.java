import java.util.Scanner;

public class TestString1 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter Message : ");
        String txt = r.nextLine();

        int i = txt.length();
        int j = txt.indexOf("e",0);

        System.out.println(i);
        System.out.println(j);
    }
}
