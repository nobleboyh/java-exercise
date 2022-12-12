package exercise13.utils;

import exercise13.exceptions.BirthDayException;
import exercise13.exceptions.EmailException;
import exercise13.exceptions.FullnameException;
import exercise13.exceptions.PhoneException;
import exercise13.models.*;

import java.util.regex.*;
import java.util.*;

public class EmployeeManagement {
    public static List<Employee> employeeList = new LinkedList<>();

    private static final Pattern regexPhoneNumber = Pattern.compile("^[0-9]{10}$");

    private static final Pattern regexEmail = Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");

    private static final Pattern regexDoB = Pattern.compile("^(19|20)\\d\\d[- /.](0[1-9]|1[012])[- /.](0[1-9]|[12][0-9]|3[01])$");

    private static final Pattern regexFullName = Pattern.compile("^([a-zA-Z0-9]+|[a-zA-Z0-9]+\\s{1}[a-zA-Z0-9]{1,}|[a-zA-Z0-9]+\\s{1}[a-zA-Z0-9]{3,}\\s{1}[a-zA-Z0-9]{1,})");

    //MARK:- Public methods
    public static void showAllEmployees(){
        employeeList.forEach(System.out::println);
    }

    public static void showAll(EmployeeType employeeType){
        switch (employeeType) {
            case Intern -> getAllIntern().forEach(System.out::println);
            case Fresher -> getAllFresher().forEach(System.out::println);
            case Experienced -> getAllExperience().forEach(System.out::println);
        }
    }
    public static List<Intern> getAllIntern(){
        return employeeList.stream().filter(item -> item.getEmployeeType() == EmployeeType.Intern).map(i->(Intern) i).toList();
    }

    public static List<Experience> getAllExperience(){
        return employeeList.stream().filter(item -> item.getEmployeeType() == EmployeeType.Experienced).map(i->(Experience) i).toList();
    }

    public static List<Fresher> getAllFresher(){
        return employeeList.stream().filter(item -> item.getEmployeeType() == EmployeeType.Fresher).map(i->(Fresher) i).toList();
    }

    public static Optional<Employee> getEmployeeById(int id){
        return employeeList.stream().filter(i -> i.getId() == id).findFirst();
    }

    public static boolean isExistingEmployee(Employee employee){
        return getEmployeeById(employee.getId()).isPresent();
    }

    public static void addEmployee(Employee employee){
        if(isExistingEmployee(employee)){
            changeEmployeeId(employee);
        }
        try{
            addEmployeeWithCheck(employee);
        }catch (PhoneException e){
            System.out.println("Phone invalid - cancel");
        }catch (BirthDayException e){
            System.out.println("DOB invalid - cancel");
        }catch (FullnameException e){
            System.out.println("Name invalid - cancel");
        }catch (EmailException e){
            System.out.println("Email invalid - cancel");
        }

    }




    //MARK: -Private methods
    private static void changeEmployeeId(Employee employee){
        int newId = employee.getId();
        do{
            System.out.println("The employee ID " + newId + " exists. Please change");
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter a new Id: ");
            try {
                newId = sc.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Please input number only");
            }

        }while(getEmployeeById(newId).isPresent());
        employee.setId(newId);
    }

    private static void addEmployeeWithCheck(Employee employee){
        if(!regexPhoneNumber.matcher(String.valueOf(employee.getPhoneNumber())).matches()) {
            System.out.println("Not valid phone number: " + employee.getPhoneNumber());
            throw new PhoneException();
        }

        if(!regexFullName.matcher(employee.getFullName()).matches()) {
            System.out.println("Not valid full name: " + employee.getFullName() );
            throw new FullnameException();
        }

        if(!regexEmail.matcher(employee.getEmail()).matches()) {
            System.out.println("Not valid email " + employee.getEmail());
            throw new EmailException();
        }

        if(!regexDoB.matcher(employee.getBirthDay()).matches()) {
            System.out.println("Not valid dob " + employee.getBirthDay());
            throw new BirthDayException();
        }
        employeeList.add(employee);
    }

}
