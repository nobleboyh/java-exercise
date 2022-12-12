package exercise14.models;

import exercise1.models.Sex;

public class GoodStudent extends Student{
    public static final StudentLevel STUDENT_LEVEL = StudentLevel.Good;

    private double gpa;  //base 10

    private String bestRewardName;

    public GoodStudent(String fullName, String dob, Sex sex, String phoneNumber, String schoolName, int gradeLevel, double gpa, String bestRewardName) {
        super(fullName, dob, sex, phoneNumber, schoolName, gradeLevel, STUDENT_LEVEL);
        this.setGpa(gpa);
        this.bestRewardName = bestRewardName;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if (gpa >=0 && gpa <= 10) this.gpa = gpa;
    }

    public String getBestRewardName() {
        return bestRewardName;
    }

    public void setBestRewardName(String bestRewardName) {
        this.bestRewardName = bestRewardName;
    }

    @Override
    public void showInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "GoodStudent{" +
                "gpa=" + gpa +
                ", bestRewardName='" + bestRewardName + '\'' +
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
