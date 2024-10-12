
interface StudentData {
    public void data();
}

interface StudentResult{
    public void calGrade(int score);
}


public class Student implements StudentData, StudentResult{
    String name;
    String major;

    public Student(String name, String major){
        this.name = name;
        this.major = major;
    }
    public void data(){
        System.out.println("Name : "+name);
        System.out.println("Major : "+major);
    }
    public void calGrade(int score){
        String grade;

        if(score > 80){
            grade = "A";
        }else if (score >= 70){
            grade = "B";
        }else if (score >= 60){
            grade = "C";
        }else if (score >= 50){
            grade = "D";
        }else{
            grade = "F";
        }

        System.out.println("Score "+score);
        System.out.println("Grade "+grade);
    }
}
    class Mymain{
    public static void main(String[] args) {
        Student student = new Student("Somsak Kuamlao","Software Engineer");

        student.data();

        int score = 75;
        student.calGrade(score);
    }
}
