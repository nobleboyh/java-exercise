package exercise14.utils;

import exercise14.exceptions.InvalidDOBException;
import exercise14.exceptions.InvalidFullNameException;
import exercise14.exceptions.InvalidPhoneNumberException;
import exercise14.models.GoodStudent;
import exercise14.models.NormalStudent;
import exercise14.models.Student;
import exercise14.models.StudentLevel;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

public class StudentManagement {
    private static final List<Student> studentList = new LinkedList<>();

    private static final Pattern regexPhoneNumber = Pattern.compile("^(090|098|031|035|038)([0-9]{7})$");

    private static final Pattern regexDoB = Pattern.compile("^(0[1-9]|[12][0-9]|3[01])(/)(0[1-9]|1[012])(/)(19|20)\\d\\d$");

    private static final Pattern regexName = Pattern.compile("^[a-zA-Z\\s]{10,50}");

    public static void addStudent(Student student){
        //Validation
        try{
            validStudent(student);
            studentList.add(student);
        }catch (InvalidDOBException | InvalidFullNameException | InvalidPhoneNumberException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("Input have unknown errors!");
        }
    }

    public static List<Student> getQualifiedStudent(int limit){
        List<Student> finalList = new LinkedList<>();
        Comparator<GoodStudent> goodStudentGpa = (a,b) -> (int) (a.getGpa() - b.getGpa());
        Comparator<GoodStudent> goodStudentName = Comparator.comparing(Student::getFullName);
        Comparator<NormalStudent> normalStudentEntranceGrade = (a,b) -> (int) (a.getEntryTestScore() - b.getEntryTestScore());
        Comparator<NormalStudent> normalStudentEntranceToeic = (a,b) -> (int) (a.getToeic() - b.getToeic());

        List<GoodStudent> goodStudentList = studentList.stream().filter(s->s.getStudentLevel()== StudentLevel.Good).map(s->(GoodStudent)s)
                .sorted(goodStudentGpa.thenComparing(goodStudentName)).toList();
        List<NormalStudent> normalStudentList = studentList.stream().filter(s->s.getStudentLevel()== StudentLevel.Normal).map(s->(NormalStudent)s)
                .sorted(normalStudentEntranceGrade.thenComparing(normalStudentEntranceToeic)).toList();
        if(goodStudentList.size() <= limit){
            finalList.addAll(goodStudentList);
            finalList.addAll(normalStudentList.stream().limit(limit - goodStudentList.size()).toList());
        }else{
            finalList.addAll(goodStudentList.stream().limit(limit).toList());
        }

        return finalList;
    }

    public static void showNameAndPhoneAll(){
        Comparator<Student> studentNameComp = (a,b)->b.getFullName().compareTo(a.getFullName());
        Comparator<Student> studentNamePhone = Comparator.comparing(Student::getPhoneNumber);

        studentList.stream().sorted(studentNameComp.thenComparing(studentNamePhone))
                .forEach(s -> System.out.println(s.getFullName() + ":" + s.getPhoneNumber()));
    }

    //MARK:- Private methods
    private static void validStudent(Student student){
        if(regexName.matcher(student.getFullName()).matches()){
            throw new InvalidFullNameException("Full name invalid");
        }
        if(regexDoB.matcher(student.getDob()).matches()){
            throw new InvalidDOBException("DOB invalid");
        }
        if(regexPhoneNumber.matcher(student.getPhoneNumber()).matches()){
            throw new InvalidPhoneNumberException("Phone invalid");
        }
    }
}
