import java.util.InputMismatchException;
import java.util.Scanner;

// เฉลยอาจาร์ย

public class SwitchVowell1 {
    public static void main(String[] args) {
        char ch;
        Scanner sa = new Scanner(System.in);
        System.out.println("Enter a - z : ");

        // ตัวดำเนินการจะอยู่นอก try ก็ได้
        // try เป็นตัวดำเนินการ catch ตัวจบ error

        try{
            String str = sa.nextLine();
            String s = str.toLowerCase();
            ch = s.charAt(0);
            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(ch + " is Vowel");
                    break;
                default:
                    System.out.println(ch + " is Consonant");
            }
        }catch(InputMismatchException e){
                System.out.println("Error"); // ตัวจับ Error ที่ไม่ใช่ Char
            }
        }
    }

