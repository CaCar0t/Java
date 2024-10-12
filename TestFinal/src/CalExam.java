import java.util.*;
public class CalExam {
    String stunum;
    String stuname;
    int stuwork;
    int stutest;
    int stumid;
    int stufinal;
    static void gradeCalculate(int score){
        if (score > 80){
            System.out.println("Your Score: "+score+" Your Grade A!!!");
        } else if (score >69) {
            System.out.println("Your Score: "+score+" Your Grade B!!!");
        } else if (score >59) {
            System.out.println("Your Score: "+score+" Your Grade C!!!");
        } else if (score >49) {
            System.out.println("Your Score: "+score+" Your Grade D!!!");
        } else{
            System.out.println("Your Score: "+score+" Your Grade is F!!!");
        }
    }
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        CalExam s = new CalExam();
        try{
            System.out.print("Input Student ID: ");
            s.stunum= sn.nextLine();
            System.out.print("Input Student Name: ");
            s.stuname = sn.nextLine();
            System.out.print("Input Student HomeWork Score: ");
            s.stuwork = sn.nextInt();
            System.out.print("Input Student Test Score: ");
            s.stutest = sn.nextInt();
            System.out.print("Input Student Midterm Score: ");
            s.stumid = sn.nextInt();
            System.out.print("Input Student Final Score: ");
            s.stufinal = sn.nextInt();
            int sum = s.stuwork+ s.stutest+ s.stumid+s.stufinal;
            System.out.println("Your Student ID: "+s.stunum+" "+"Your Student Name: "+s.stuname);
            gradeCalculate(sum);
        } catch (InputMismatchException e){
            System.out.println("Input Error!!!");
        }
    }
}