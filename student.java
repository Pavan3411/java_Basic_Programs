public class student {
    public static void main(String[] args){
        String studName = "Pavan";
        int studScore = 80;
        char grade = divisonCalc(studScore);
        System.out.println("Student Name: " + studName);
        System.out.println("Student Score: " + studScore);
        System.out.println("Student Grade: " + grade);

    }
    public static char divisonCalc(int student_Score){
        char grade;
        if(student_Score>=80){
            grade = 'A';
        }
        else if(student_Score>=60 && student_Score<80){
            grade = 'B';
        }
        else if(student_Score>=40 && student_Score<60){
            grade = 'C';
        }
        else{
            grade = 'F';
        }
        return grade;
    }
}
