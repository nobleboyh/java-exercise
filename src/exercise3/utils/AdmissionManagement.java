package exercise3.utils;

import exercise3.models.ExaminationBlock;
import exercise3.models.Student;
import exercise3.models.Subject;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AdmissionManagement {
    private static final List<Student> studentList = new ArrayList<>();
    public static final ExaminationBlock blockA = new ExaminationBlock("A", List.of(Subject.Math, Subject.Physics, Subject.Chemistry));
    public static final ExaminationBlock blockB = new ExaminationBlock("B", List.of(Subject.Math, Subject.Literature, Subject.English));
    public static final ExaminationBlock blockC = new ExaminationBlock("C", List.of(Subject.Literature, Subject.History, Subject.Geography));

    public static boolean addStudent(Student student){
        Optional<Student> existingStudent = searchById(student.getID());
        if (existingStudent.isPresent()) return false;
        studentList.add(student);        return true;
    }

    public static void showAllStudents(){
        studentList.forEach(System.out::println);
    }

    public static Optional<Student> searchById(int id){
        return studentList.stream().filter(item -> item.getID() == id).findFirst();
    }

}
