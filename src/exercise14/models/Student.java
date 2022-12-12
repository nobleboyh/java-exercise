package exercise14.models;

import exercise1.models.Sex;

public abstract class Student {
    protected String fullName;

    protected String dob;

    protected Sex sex;

    protected String phoneNumber;

    protected String schoolName;

    protected int gradeLevel;

    protected StudentLevel studentLevel;

    public Student(String fullName, String dob, Sex sex, String phoneNumber, String schoolName, int gradeLevel, StudentLevel studentLevel) {
        this.fullName = fullName;
        this.dob = dob;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
        this.schoolName = schoolName;
        this.gradeLevel = gradeLevel;
        this.studentLevel = studentLevel;
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

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public StudentLevel getStudentLevel() {
        return studentLevel;
    }

    public void setStudentLevel(StudentLevel studentLevel) {
        this.studentLevel = studentLevel;
    }

    //MARK: -Abstract methods
    public abstract void showInfo();

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", dob='" + dob + '\'' +
                ", sex=" + sex +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", gradeLevel=" + gradeLevel +
                '}';
    }
}
