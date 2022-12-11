package exercise5.models;

public class Customer {
    private int ID;

    private String name;

    private int age;

    public Customer(int ID, String name, int age) {
        this.ID = ID;
        this.name = name;
        this.setAge(age);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    @Override
    public String toString() {
        return "Customer{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
