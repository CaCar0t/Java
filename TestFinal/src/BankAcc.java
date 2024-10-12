import java.util.InputMismatchException;
import java.util.Scanner;

public class BankAcc {
    String numacc;
    String name;
    int money;

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        BankAcc s = new BankAcc();
        String mon;

        try{
            System.out.println("Enter Account Number : ");
            s.numacc = sn.nextLine();
            System.out.println("Enter Name : ");
            s.name = sn.nextLine();
            System.out.println("Enter Money : ");
            s.money = sn.nextInt();

            System.out.println(s.name);
            int stringzie = s.numacc.length();
            if(stringsize = 10){

            }
            String sub = s.numacc.substring(s.numacc.length() -2);
            if (sub == "01"){
                mon = "3";
            }else if(sub.equals("02")){
                mon = "6";
            }else if(sub.equals("03")){
                mon = "12";
            }else if(sub.equals("04")){
                mon = "24";
            }else{
                mon = "1";
            }

            if(mon == "1"){
                System.out.println("Your interest : "+s.money * 0.5);
            }else if(mon == "3"){
                System.out.println("Your interest : "+s.money * 0.75);
            }else if (mon == "6"){
                System.out.println("Your interest : "+s.money * 1.00);
            }else if(mon == "12"){
                System.out.println("Your interest : "+s.money * 1.25);
            }else if(mon == "24"){
                System.out.println("Your interest : "+s.money * 1.75);
            }
        }catch (InputMismatchException e){
            System.out.println("Input Error!!!");
        }
    }
}
