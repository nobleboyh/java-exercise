package exercise1.models;

public class Member {

    //Props
    /*Full name of member*/
    private String name;

    /*Age */
    private int age;

    /*0: Male, 1: Female*/
    private Sex sex;

    /*Address of member*/
    private String address;

    public Member() {
    }

    public Member(String name, int age, Sex sex, String address) {
        this.name = name;
        this.setAge(age);
        this.sex = sex;
        this.address = address;
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

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
