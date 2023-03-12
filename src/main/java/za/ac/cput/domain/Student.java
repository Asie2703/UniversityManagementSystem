package za.ac.cput.domain;
//Asive Sibeko 219475296

public class Student {
    private String studentId;
    private String studentFName;
    private String studentLName;
    private String studentEmail;

    private Student(){

    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentFName() {
        return studentFName;
    }

    public String getStudentLName() {
        return studentLName;
    }

    public String getStudentEmail() {
        return studentEmail;
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
