package za.ac.cput.domain;

public class Student {
    private String studentNo;
    private String studentLName;
    private String studentFName;
    private String email;

    public Student(){

    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getStudentLName() {
        return studentLName;
    }

    public void setStudentLName(String studentLName) {
        this.studentLName = studentLName;
    }

    public String getStudentFName() {
        return studentFName;
    }

    public void setStudentFName(String studentFName) {
        this.studentFName = studentFName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNo='" + studentNo + '\'' +
                ", studentLName='" + studentLName + '\'' +
                ", studentFName='" + studentFName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
