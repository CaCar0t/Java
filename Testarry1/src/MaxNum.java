import java.util.Scanner;

interface MyNumber{
    String findNumber(int[]num);
}

public class MaxNum implements MyNumber{
    public String findNumber(int[]num){
        int max = num[0];

        for(int i = 0;i < 5;i++){
            if(num[i] > max ){
                max = num[i];
            }
        }
        StringBuilder numbers = new StringBuilder();
        for (int n : num){
            numbers.append(n).append(",");
        }
        numbers.deleteCharAt(numbers.length()-1);

        return "Set of Number is "+numbers.toString()+"\nMax Number is "+max;
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        int[] mynum = new int[5];

        System.out.println("Enter 5 Numbers : ");
        for (int i = 0;i <5;i++){
            System.out.println("Number "+(i+1)+":");
            mynum[i] = sn.nextInt();
        }
        MaxNum maxNum = new MaxNum();
        String result = maxNum.findNumber(mynum);

        System.out.println(result);

    }
}

