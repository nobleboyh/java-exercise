package exercise13.models;

import java.util.Date;
import java.util.List;

public class Experience extends Employee{
    private int years;

    private String skills;

    public Experience(int id, String fullName, Date birthDay, int phoneNumber, String email, EmployeeType employeeType, List<Certificate> certificateList, int years, String skills) {
        super(id, fullName, birthDay, phoneNumber, email, employeeType, certificateList);
        this.years = years;
        this.skills = skills;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    @Override
    public void showMe() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Experience{" +
                "years=" + years +
                ", skills='" + skills + '\'' +
                ", id=" + id +
                ", fullName='" + fullName + '\'' +
                ", birthDay=" + birthDay +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", employeeType=" + employeeType +
                ", certificateList=" + certificateList +
                '}';
    }
}
