/*
 * Classroom.java
 * This is my worker class
 * @author Mthandeni Mbobo - 218223579
 * 12 March 2023
*/

package za.ac.cput.domain;

public class Classroom {
    private String classroomId;
    private String campus;
    private String building;
    private int floorNo;
    private double roomNo;

    //my constructor
    public Classroom(String classroomId, String campus, String building, int floorNo, double roomNo){
        this.classroomId = classroomId;
        this.campus = campus;
        this.building = building;
        this.floorNo = floorNo;
        this.roomNo = roomNo;
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
