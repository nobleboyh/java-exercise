package exercise12.models;

import java.util.Date;

public class MotorBike extends Vehicle {
    private int power;

    public MotorBike(int id, String brand, Date manufactureDate, int price, String color, int power) {
        super(id, brand, manufactureDate, price, color);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "MotorBike{" +
                "power=" + power +
                '}';
    }
}
