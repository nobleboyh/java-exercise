package exercise3.models;

public class Student {
    private int ID;

    private String name;

    private String address;

    private int priority;

    private ExaminationBlock examinationBlock;

    public Student(int ID, String name, String address, int priority, ExaminationBlock examinationBlock) {
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.priority = priority;
        this.examinationBlock = examinationBlock;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public ExaminationBlock getExaminationBlock() {
        return examinationBlock;
    }

    public void setExaminationBlock(ExaminationBlock examinationBlock) {
        this.examinationBlock = examinationBlock;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priority=" + priority +
                ", examinationBlock=" + examinationBlock +
                '}';
    }
}
