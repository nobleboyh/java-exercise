package exercise15.models;

public class StudyResult {
    private String semesterName;

    private double cpa;

    public StudyResult(String semesterName, double cpa) {
        this.semesterName = semesterName;
        this.cpa = cpa;
    }

    public String getSemesterName() {
        return semesterName;
    }

    public void setSemesterName(String semesterName) {
        this.semesterName = semesterName;
    }

    public double getCpa() {
        return cpa;
    }

    public void setCpa(double cpa) {
        this.cpa = cpa;
    }



    @Override
    public String toString() {
        return "StudyResult{" +
                "semesterName='" + semesterName + '\'' +
                ", cpa=" + cpa +
                '}';
    }
}
