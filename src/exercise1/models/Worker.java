package exercise1.models;

public class Worker extends Member{
    private int level;

    public Worker() {
    }

    public Worker(int level) {
        this.level = level;
    }

    public Worker(String name, int age, Sex sex, String address, int level) {
        super(name, age, sex, address);
        this.setLevel(level);
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if(level >= 1 && level <= 10) this.level = level;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + this.getName() + '\'' +
                ", age=" + this.getAge() +
                ", sex=" + this.getSex() +
                ", address='" + this.getAddress() + '\'' +
                ", level='" + this.getLevel() + '\'' +
                '}';
    }
}
