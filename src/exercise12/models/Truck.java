package exercise12.models;

import java.util.Date;

public class Truck extends Vehicle{
    private int tonnage;

    public Truck(int id, String brand, Date manufactureDate, int price, String color, int tonnage) {
        super(id, brand, manufactureDate, price, color);
        this.tonnage = tonnage;
    }

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "tonnage=" + tonnage +
                '}';
    }
}
