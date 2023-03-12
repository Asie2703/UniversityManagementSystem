package za.ac.cput.domain;

public class Classroom {
    private String classroomId;
    private String campus;
    private String building;
    private int floorNo;
    private double roomNo;

    //my constructor
    private Classroom(){
        //
    }

    //my getters
    public String getClassroomId() {
        return classroomId;
    }

    public String getCampus() {
        return campus;
    }

    public String getBuilding() {
        return building;
    }

    public int getFloorNo() {
        return floorNo;
    }

    public double getRoomNo() {
        return roomNo;
    }

    //toString
    @Override
    public String toString() {
        return "Classroom{" +
                "classroomId='" + classroomId + '\'' +
                ", campus='" + campus + '\'' +
                ", building='" + building + '\'' +
                ", floorNo=" + floorNo +
                ", roomNo=" + roomNo +
                '}';
    }
}
