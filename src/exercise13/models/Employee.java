package exercise13.models;

import java.util.Date;
import java.util.List;

public abstract class Employee {
    protected int id;

    protected String fullName;

    protected Date birthDay;

    protected int phoneNumber;

    protected String email;

    protected EmployeeType employeeType;

    protected List<Certificate> certificateList;

    private static int count = 0;

    public abstract void showMe();

    public Employee(int id, String fullName, Date birthDay, int phoneNumber, String email, EmployeeType employeeType, List<Certificate> certificateList) {
        this.id = id;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.employeeType = employeeType;
        this.certificateList = certificateList;
        count++;
    }
}
