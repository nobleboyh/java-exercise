package exercise3;

import exercise3.models.Student;
import exercise3.utils.AdmissionManagement;

public class Main {
    public static void main(String[] args) {
        //Init students
        Student student1 = new Student(1, "hoang1", "Hanoi1", 1, AdmissionManagement.blockA);
        Student student2 = new Student(2, "hoang2", "Hanoi2", 2, AdmissionManagement.blockB);
        Student student3 = new Student(3, "hoang3", "Hanoi3", 3, AdmissionManagement.blockC);
        Student studentS = new Student(3, "hoangS", "HanoiS", 44, AdmissionManagement.blockA);

        //Add students
        AdmissionManagement.addStudent(student1);
        AdmissionManagement.addStudent(student2);
        AdmissionManagement.addStudent(student3);
        AdmissionManagement.addStudent(studentS);

        //Show all students
        AdmissionManagement.showAllStudents();

        //Search student by ID
        AdmissionManagement.searchById(2).ifPresent(System.out::println);

    }
}
