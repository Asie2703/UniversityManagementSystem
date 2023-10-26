package za.ac.cput.domain;

public class Student {
    private String studentId;
    private String studentFName;
    private String studentLName;
    private String studentEmail;

    public Student(){

    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentFName() {
        return studentFName;
    }

    public void setStudentFName(String studentFName) {
        this.studentFName = studentFName;
    }

    public String getStudentLName() {
        return studentLName;
    }

    public void setStudentLName(String studentLName) {
        this.studentLName = studentLName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", studentFName='" + studentFName + '\'' +
                ", studentLName='" + studentLName + '\'' +
                ", studentEmail='" + studentEmail + '\'' +
                '}';
    }
}
