package exercise15.models;

import java.util.List;

public class OnjobStudent extends Student{
    private String educationLink;

    public OnjobStudent(int id, String fullName, String dob, int startYear, double entryGrade, List<StudyResult> studyResultList, String educationLink) {
        super(id, fullName, dob, startYear, entryGrade, studyResultList);
        this.educationLink = educationLink;
    }

    public String getEducationLink() {
        return educationLink;
    }

    public void setEducationLink(String educationLink) {
        this.educationLink = educationLink;
    }

    @Override
    public String toString() {
        return "OnjobStudent{" + super.toString() +
                "educationLink='" + educationLink + '\'' +
                '}';
    }

    @Override
    public boolean isRegularStudent(){
        return false;
    }
}
