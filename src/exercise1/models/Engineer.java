package exercise1.models;

public class Engineer extends Member{
    /*Major*/
    private String major;

    public Engineer() {
    }

    public Engineer(String major) {
        this.major = major;
    }

    public Engineer(String name, int age, Sex sex, String address, String major) {
        super(name, age, sex, address);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "name='" + this.getName() + '\'' +
                ", age=" + this.getAge() +
                ", sex=" + this.getSex() +
                ", address='" + this.getAddress() + '\'' +
                ", major='" + this.getMajor() + '\'' +
                '}';
    }
}
