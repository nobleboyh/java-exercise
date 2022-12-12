package exercise13.models;

import java.util.Date;
import java.util.List;

public class Fresher extends Employee{
    private Date graduateYear;

    private String GraduationRank;

    private String GraduatedSchool;

    public Fresher(int id, String fullName, Date birthDay, int phoneNumber, String email, EmployeeType employeeType, List<Certificate> certificateList, Date graduateYear, String graduationRank, String graduatedSchool) {
        super(id, fullName, birthDay, phoneNumber, email, employeeType, certificateList);
        this.graduateYear = graduateYear;
        GraduationRank = graduationRank;
        GraduatedSchool = graduatedSchool;
    }

    public Date getGraduateYear() {
        return graduateYear;
    }

    public void setGraduateYear(Date graduateYear) {
        this.graduateYear = graduateYear;
    }

    public String getGraduationRank() {
        return GraduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        GraduationRank = graduationRank;
    }

    public String getGraduatedSchool() {
        return GraduatedSchool;
    }

    public void setGraduatedSchool(String graduatedSchool) {
        GraduatedSchool = graduatedSchool;
    }

    @Override
    public String toString() {
        return "Fresher{" +
                "graduateYear=" + graduateYear +
                ", GraduationRank='" + GraduationRank + '\'' +
                ", GraduatedSchool='" + GraduatedSchool + '\'' +
                ", id=" + id +
                ", fullName='" + fullName + '\'' +
                ", birthDay=" + birthDay +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", employeeType=" + employeeType +
                ", certificateList=" + certificateList +
                '}';
    }

    @Override
    public void showMe() {
        System.out.println(this);
    }
}
