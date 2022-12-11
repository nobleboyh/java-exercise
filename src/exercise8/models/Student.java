package exercise8.models;

public class Student {
    private String name;

    private int age;

    private String studentClass;


    public Student(String name, int age, String studentClass) {
        this.name = name;
        this.setAge(age);
        this.studentClass = studentClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0) this.age = age;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", studentClass='" + studentClass + '\'' +
                '}';
    }
}
