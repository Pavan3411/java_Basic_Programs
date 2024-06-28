public class school {
    private String StudName;
    private String RollNo;
    private String Standard;
    private String Section;

    public school(){
        this("DefName","000","X","C");
    }

    public school(String studName, String rollNo) {
        this(studName,rollNo, "IX", "D");
    }

    public school(String studName, String rollNo, String standard, String section) {
        StudName = studName;
        RollNo = rollNo;
        Standard = standard;
        Section = section;
    }

    public String getStudName() {
        return StudName;
    }

    public String getRollNo() {
        return RollNo;
    }

    public String getStandard() {
        return Standard;
    }

    public String getSection() {
        return Section;
    }
}
