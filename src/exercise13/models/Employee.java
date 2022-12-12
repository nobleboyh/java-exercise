package exercise13.models;

import java.util.Date;
import java.util.List;

public abstract class Employee {
    protected int id;

    protected String fullName;

    protected String birthDay;

    protected String phoneNumber;

    protected String email;

    protected EmployeeType employeeType;

    protected List<Certificate> certificateList;

    private static int count = 0;

    public abstract void showMe();

    public Employee(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    public Employee(int id, String fullName, String birthDay, String phoneNumber, String email, EmployeeType employeeType, List<Certificate> certificateList) {
        this.id = id;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.employeeType = employeeType;
        this.certificateList = certificateList;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    public List<Certificate> getCertificateList() {
        return certificateList;
    }

    public void setCertificateList(List<Certificate> certificateList) {
        this.certificateList = certificateList;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Employee.count = count;
    }
}
