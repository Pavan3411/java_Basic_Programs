public class school_main {
    public static void main(String[] args) {
        school Stud1 = new school();
        school Stud2 = new school("StudName2","Stud2RollNo");
        school Stud3 = new school("studName3","3rollno","3stan", "3sec");

        System.out.println(Stud3.getStudName());
        System.out.println(Stud3.getSection());
    }
}
