package za.ac.cput.domain;

public class Professor {
    private String professorID;
    private String professorFName;
    private String professorLName;
    private String professorEmail;


    private Professor() {}



    public String getProfessorID() {
        return professorID;
    }

    public String getProfessorFName() {
        return professorFName;
    }

    public String getProfessorLName() {
        return professorLName;
    }

    public String getProfessorEmail() {
        return professorEmail;
    }


    @Override
    public String toString() {
        return "Professor{" +
                "professorID='" + professorID + '\'' +
                ", professorFName='" + professorFName + '\'' +
                ", professorLName='" + professorLName + '\'' +
                ", professorEmail='" + professorEmail + '\'' +
                '}';
    }
}
