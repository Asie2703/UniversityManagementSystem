package za.ac.cput.domain;

public class Department {
    private String departmentID;
    private String departmentName;
    private String departmentEmail;

    Department() {

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

    @Override
    public String toString() {
        return "department{" +
                "departmentID='" + departmentID + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", departmentEmail='" + departmentEmail + '\'' +
                '}';
    }
}
