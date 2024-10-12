interface MyNumbers {
    public String findNumber(int[] num);
}
class MaxNumT implements MyNumbers {
    public String findNumber(int[] num) {
        String str = "";
        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            if (max < num[i]) {
                max = num[i];
            }
        }
        str = "Maximum Num is " + max;
        return str;
    }
}
    class main {
    public static void main(String[] args) {
        MaxNum m = new MaxNum();
        int [] num2 = {10,20,300,40,50};
        for (int i=0; i<num2.length;i++){
            System.out.print(num2[i]+" ");
        }
        System.out.println();
        System.out.println(m.findNumber(num2));

    }
}