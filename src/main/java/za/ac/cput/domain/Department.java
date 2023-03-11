package za.ac.cput.domain;

public class Department {
    private String departmentID;
    private String departmentName;
    private String departmentEmail;
    private String professorID;
    private String studentID;
    private String lecturerID;
    private String courseID;
    private String classroomID;

    private Department() {

    }

    public String getDepartmentID() {
        return departmentID;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getDepartmentEmail() {
        return departmentEmail;
    }

    public String getProfessorID() {
        return professorID;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getLecturerID() {
        return lecturerID;
    }

    public String getCourseID() {
        return courseID;
    }

    public String getClassroomID() {
        return classroomID;
    }

    @Override
    public String toString() {
        return "department{" +
                "departmentID='" + departmentID + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", departmentEmail='" + departmentEmail + '\'' +
                ", professorID='" + professorID + '\'' +
                ", studentID='" + studentID + '\'' +
                ", lecturerID='" + lecturerID + '\'' +
                ", courseID='" + courseID + '\'' +
                ", classroomID='" + classroomID + '\'' +
                '}';
    }
}
