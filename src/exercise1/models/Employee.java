package exercise1.models;

public class Employee extends Member{
    private String job;

    public Employee() {
    }

    public Employee(String job) {
        this.job = job;
    }

    public Employee(String name, int age, Sex sex, String address, String job) {
        super(name, age, sex, address);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + this.getName() + '\'' +
                ", age=" + this.getAge() +
                ", sex=" + this.getSex() +
                ", address='" + this.getAddress() + '\'' +
                ", job='" + this.getJob() + '\'' +
                '}';
    }
}
