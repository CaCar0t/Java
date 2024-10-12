import java.util.*;
import java.io.*;

public class ScanData {
    public static void main(String[] args) {
        String inputfile = "C:/Users/Dell3010/IdeaProjects/Testjava1/src/contact.csv";
        // String inputStr;
        Scanner sn;
        try {
            sn = new Scanner(new File(inputfile));
            sn.useDelimiter(",");
            while (sn.hasNext()) {
                System.out.println("Name : " + sn.next());
                System.out.println("Last Name : " + sn.next());
                System.out.println("Phone : " + sn.next());
                System.out.println("Email : " + sn.nextLine().substring(1));
                System.out.println(); // blank Line
            }
        } catch (FileNotFoundException e) {
            System.err.println("Input File not Found : " + inputfile);
            System.exit(0);
        }
    }
}
