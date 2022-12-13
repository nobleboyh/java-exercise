package exercise15;

import exercise15.models.Department;
import exercise15.models.OnjobStudent;
import exercise15.models.Student;
import exercise15.models.StudyResult;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = List.of(
                new Student(1,"hoang hoang","31/12/1995",2009, 3.0, List.of( new StudyResult("A",3.5))),
                new OnjobStudent(2,"chi mai khanh","31/12/1998",2008, 4.0,
                        List.of( new StudyResult("A",3.5),new StudyResult("B",3.8)), "Dong nai"),
                new Student(3,"hoang hoangA","31/12/1995",2010, 2.0, List.of( new StudyResult("A",2.5))),
                new OnjobStudent(4,"chi mai khanhB","31/12/1998",2010, 3.0,
                        List.of( new StudyResult("A",2.5),new StudyResult("B",1.8)), "Ha nam"),
                new Student(5,"hoang hoangC","31/12/1995",2000, 1.0, List.of( new StudyResult("A",8.5))),
                new OnjobStudent(6,"chi mai khanhD","31/12/1998",2018, 1.5,
                        List.of( new StudyResult("A",3.5),new StudyResult("B",3.8),new StudyResult("B",8.8))
                        , "Dong nai")
        );
        Department department = new Department("Mechanics");

        studentList.forEach(department::addStudent);
        department.showAllStudents();

        //#6
        System.out.println("Get CPA: ");
        System.out.println(studentList.get(3).getCPA("A"));

        //#7
        System.out.println("Get number of regular students: ");
        System.out.println(department.getNumberOfRegularStudents());

        //#8
        System.out.println("Get best student: ");
        System.out.println(department.bestStudent());

        //#9
        System.out.println("Get on-job student by location: ");
        department.getOnjobStudentsByLocation("Dong nai").forEach(System.out::println);

        //#10
        System.out.println("Get good students at last semester: ");
        department.getGoodStudentInLastSemester().forEach(System.out::println);

        //#11
        System.out.println("\nGet best student in all semester: ");
        System.out.println(department.getGoodStudentsInAllSemester());

        //#12
        System.out.println("\nSort by increasing year: ");
        department.increasingYearSort();
        department.showAllStudents();

        System.out.println("\nSort by decreasing year: ");
        department.decreasingYearSort();
        department.showAllStudents();

        //#13
        System.out.println("Summary by year: ");
        department.summaryStudentByYear(2010);
    }
}


