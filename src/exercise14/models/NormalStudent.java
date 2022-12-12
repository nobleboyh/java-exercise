package exercise14.models;

import exercise1.models.Sex;

public class NormalStudent extends Student{
    public static final StudentLevel STUDENT_LEVEL = StudentLevel.Normal;

    private double toeic;

    private double entryTestScore; //Base 10

    public NormalStudent(String fullName, String dob, Sex sex, String phoneNumber, String schoolName, int gradeLevel, double toeic, double entryTestScore) {
        super(fullName, dob, sex, phoneNumber, schoolName, gradeLevel, STUDENT_LEVEL);
        this.toeic = toeic;
        this.entryTestScore = entryTestScore;
    }

    public double getToeic() {
        return toeic;
    }

    public void setToeic(double toeic) {
        this.toeic = toeic;
    }

    public double getEntryTestScore() {
        return entryTestScore;
    }

    public void setEntryTestScore(double entryTestScore) {
        this.entryTestScore = entryTestScore;
    }

    @Override
    public void showInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "NormalStudent{" +
                "toeic=" + toeic +
                ", entryTestScore=" + entryTestScore +
                ", fullName='" + fullName + '\'' +
                ", dob='" + dob + '\'' +
                ", sex=" + sex +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", gradeLevel=" + gradeLevel +
                ", studentLevel=" + studentLevel +
                '}';
    }
}
