package exercise12.models;

import java.util.Date;

public class Car extends Vehicle{
    private int seats;

    private String engineType;

    public Car(int id, String brand, Date manufactureDate, int price, String color, int seats, String engineType) {
        super(id, brand, manufactureDate, price, color);
        this.seats = seats;
        this.engineType = engineType;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "seats=" + seats +
                ", engineType='" + engineType + '\'' +
                '}';
    }
}
