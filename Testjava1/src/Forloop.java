import java.util.InputMismatchException;
import java.util.Scanner;

public class Forloop {

    public static void main(String[] args) {
//        for(int i = 0; i <= 10; i = i+2){
//            System.out.println(i);
//        }

//        for(int i = 1; i <=5; i++){
//            for(int j = 1; j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();// new line
//        }

//        for (int countdown = 3; countdown <=3; countdown--){
//            if (countdown == 0) {
//                System.out.println("Happy New Year!!!");
//                break;
//            }
//            System.out.println(countdown);
//
//        }

//        int dice = 1;
//        while (dice < 6 ){
//            System.out.println("Yatzy");
//            dice++;
//            if (dice == 6){
//                System.out.println("No Yatzy");
//                break;
//            } // <= 6 ก็ได้ ลบ break
//        }

//        for (int i = 1;i <= 2; i++){
//            System.out.println("Outer : "+i);
//            for (int j = 1;j <=3; j++){
//                System.out.println(" Inner : "+j);
//            }
//        }

//        for (int i = 0; i <= 100; i = i + 10){
//            System.out.println(i);
//        }

//        int x = 2;
//        for (int i = 1; i <= 12; i++){
//            System.out.println(x+" * "+i+" : "+x*i);
//
//        }

        Scanner sa = new Scanner(System.in);
        System.out.println("World : ");

        try {
            String str = sa.nextLine();
            System.out.println(str);
            str = str.toLowerCase();
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
                        || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                        || str.charAt(i) == 'u') {
                    count++;
                }
            }
            System.out.println("Vowell : " + count);
            System.out.println("Con");
        }catch (InputMismatchException e) {
            System.out.println("Error");
        }
    }
}

