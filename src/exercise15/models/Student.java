package exercise15.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Student {
    private int id;

    private String fullName;

    private String dob;

    private int startYear;

    private double entryGrade;

    private List<StudyResult> studyResultList = new ArrayList<>();

    public Student(int id, String fullName, String dob, int startYear, double entryGrade, List<StudyResult> studyResultList) {
        this.id = id;
        this.fullName = fullName;
        this.dob = dob;
        this.startYear = startYear;
        this.entryGrade = entryGrade;
        this.studyResultList = studyResultList;
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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public double getEntryGrade() {
        return entryGrade;
    }

    public void setEntryGrade(double entryGrade) {
        this.entryGrade = entryGrade;
    }

    public List<StudyResult> getStudyResultList() {
        return studyResultList;
    }

    public void setStudyResultList(List<StudyResult> studyResultList) {
        this.studyResultList = studyResultList;
    }

    public boolean isRegularStudent(){
        return true;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", dob='" + dob + '\'' +
                ", startYear=" + startYear +
                ", entryGrade=" + entryGrade +
                ", studyResultList=" + studyResultList +
                '}';
    }

    public Optional<Double> getCPA(String semesterName){
        Optional<StudyResult> studyResultOptional = studyResultList.stream().filter(s-> Objects.equals(s.getSemesterName(), semesterName)).findFirst();
        return studyResultOptional.map(StudyResult::getCpa);
    }
}
