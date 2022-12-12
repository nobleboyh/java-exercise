package exercise13;

import exercise13.models.*;
import exercise13.utils.EmployeeManagement;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Certificate certificate = new Certificate(1,"Tester", "A1", new Date());
        Employee employee1 = new Experience(1, "hoang", "1992/12/01", "0123458912",
                "hoang@123mail.com", List.of(certificate), 3, "java");

        Employee employee2 = new Intern(1, "hoang2", "1995/11/12", "0123458912",
                "hoang2@123.xyz", List.of(certificate), "Mechanics", 2, "HUST");

        Employee employee3 = new Fresher(3, "hoang2", "1995/11/12", "0123458912",
                "hoang2@123.xyz", List.of(certificate), new Date(), "Good", "HUST");

        EmployeeManagement.addEmployee(employee1);
        EmployeeManagement.addEmployee(employee2);
        EmployeeManagement.addEmployee(employee3);

        EmployeeManagement.showAllEmployees();

        System.out.println("Fresher list: ");
        EmployeeManagement.showAll(EmployeeType.Fresher);
        System.out.println("Intern list: ");
        EmployeeManagement.showAll(EmployeeType.Intern);
        System.out.println("Experienced list: ");
        EmployeeManagement.showAll(EmployeeType.Experienced);


    }
}
