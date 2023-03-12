package za.ac.cput.domain;
//Sinentlahla Pindani 219081328
public class Course {
  private String CRS_Code;
    private String DEPT_Code;
    private String CRS_Description;
    private int CRS_Credits;

    private Course(){

    }

    public String getCRS_Code() {
        return CRS_Code;
    }

    public String getDEPT_Code() {
        return DEPT_Code;
    }

    public String getCRS_Description() {
        return CRS_Description;
    }

    public int getCRS_Credits() {
        return CRS_Credits;
    }

    @Override
    public String toString() {
        return "Course{" +
                "CRS_Code='" + CRS_Code + '\'' +
                ", DEPT_Code='" + DEPT_Code + '\'' +
                ", CRS_Description='" + CRS_Description + '\'' +
                ", CRS_Credits=" + CRS_Credits +
                '}';
    }
}
