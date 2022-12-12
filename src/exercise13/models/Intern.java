package exercise13.models;

import java.util.Date;
import java.util.List;

public class Intern extends Employee{
    private String major;

    private int semester;

    private String school;

    public Intern() {
        super(EmployeeType.Intern);
    }

    public Intern(int id, String fullName, String birthDay, String phoneNumber, String email, List<Certificate> certificateList, String major, int semester, String school) {
        super(id, fullName, birthDay, phoneNumber, email, EmployeeType.Intern, certificateList);
        this.major = major;
        this.semester = semester;
        this.school = school;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Intern{" +
                "major='" + major + '\'' +
                ", semester=" + semester +
                ", school='" + school + '\'' +
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

    @Override
    public EmployeeType getEmployeeType(){
        return EmployeeType.Intern;
    }
}
