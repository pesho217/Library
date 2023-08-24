package library.members;

public class StudentMember extends Member {
    public String schoolName;
    public int grade;
    boolean parentVerified = false;
    public StudentMember(String schoolName, int grade, boolean parentVerified){
        this.schoolName =schoolName;
        this.grade = grade;
        this.parentVerified = parentVerified;
    }
    public StudentMember(){}

}
