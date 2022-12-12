package exercise14;

import exercise1.models.Sex;
import exercise14.models.GoodStudent;
import exercise14.models.NormalStudent;
import exercise14.models.Student;
import exercise14.utils.StudentManagement;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = List.of(
                new GoodStudent("Hoang Bui Tien", "13/12/1995", Sex.Male, "0985691178",
                        "HUST", 2, 4.0, "None"),
                new NormalStudent("Tien Hoang Bui", "11/11/1995", Sex.Male, "0911567890",
                        "HUST", 2, 4.0, 5.0),
                new GoodStudent("Hoang Bui ABC", "03/12/1995", Sex.Male, "0312452452",
                        "HUST", 2, 6.0, "None"),
                new GoodStudent("Chi Mai Khanh", "03/07/1998", Sex.Female, "0987689072",
                        "FTU", 2, 6.0, "None"),
                new NormalStudent("NNN NNN MMMM", "13/11/1995", Sex.Male, "0384879871",
                "HUST", 2, 4.0, 5.0)

        );

        studentList.forEach(StudentManagement::addStudent);

        StudentManagement.showNameAndPhoneAll();

        StudentManagement.getQualifiedStudent(6).forEach(Student::showInfo);
    }
}
