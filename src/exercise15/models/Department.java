package exercise15.models;

import exercise14.exceptions.InvalidDOBException;
import exercise14.exceptions.InvalidFullNameException;

import java.util.*;

public class Department {
    private String name;

    private List<Student> studentList = new LinkedList<>();

    public Department(String name) {
        this.name = name;
    }

    public Department(String name, List<Student> studentList) {
        this.name = name;
        this.studentList = studentList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", studentList=" + studentList +
                '}';
    }

    //Utils method
    public void addStudent(Student student){
        if(!isExistStudentID(student.getId())){
            addStudentWithValidation(student);
        }
    }

    public void showAllStudents(){
        studentList.forEach(System.out::println);
    }

    public boolean isExistStudentID(int id){
        return studentList.stream().anyMatch(i->i.getId() == id);
    }

    public void addStudentWithValidation(Student student){
        if(!RegexCheck.regexName.matcher(student.getFullName()).matches()){
            throw new InvalidFullNameException(student.getFullName() + " is invalid");
        }
        if(!RegexCheck.regexDoB.matcher(student.getDob()).matches()){
            throw new InvalidDOBException(student.getDob() + " is invalid");
        }
        studentList.add(student);
    }

    //#7
    public long getNumberOfRegularStudents(){
        return studentList.stream().filter(Student::isRegularStudent).count();
    }

    //#8
    public Optional<Student> bestStudent(){
        return studentList.stream().max(Comparator.comparing(Student::getEntryGrade));
    }

    //#9
    public List<OnjobStudent> getOnjobStudentsByLocation(String link){
        return studentList.stream().filter(i-> !i.isRegularStudent()).map(i->(OnjobStudent)i).filter(i->i.getEducationLink().equals(link)).toList();
    }

    //#10
    public List<Student> getGoodStudentInLastSemester(){
        return studentList.stream().filter(i->{
            List<StudyResult> studyResults = i.getStudyResultList();
            double lastCPA = studyResults.get(studyResults.size()-1).getCpa();
            return lastCPA >= 8.0;
        }).toList();
    }

    //#11
    public Optional<Student> getGoodStudentsInAllSemester(){
        return  studentList.stream().max(
                (a,b)->{
                    Optional<Double> cpa1 = a.getStudyResultList().stream().max(Comparator.comparing(StudyResult::getCpa)).map(StudyResult::getCpa);
                    Optional<Double> cpa2 = b.getStudyResultList().stream().max(Comparator.comparing(StudyResult::getCpa)).map(StudyResult::getCpa);
                    if( cpa1.isPresent() && cpa2.isEmpty()) return -1;
                    else if (cpa1.isEmpty() && cpa2.isPresent()) return 1;
                    else return cpa1.get().compareTo(cpa2.get());
                }
        );
    }

    //#12
    public void increasingYearSort(){
        studentList.sort(Comparator.comparing(Student::getStartYear));
    }

    public void decreasingYearSort(){
        studentList.sort(Comparator.comparing(Student::getStartYear).reversed());
    }

    //#13
    public void summaryStudentByYear(int startYear){
        long num = studentList.stream().filter(i->i.getStartYear() == startYear).count();
        System.out.println("" + startYear + ": " + num);
    }
}
