package exercise12.models;

import java.util.Date;

public class Vehicle {
    private int id;

    private String brand;

    private Date manufactureDate;

    private int price;

    private String color;

    public Vehicle(int id, String brand, Date manufactureDate, int price, String color) {
        this.id = id;
        this.brand = brand;
        this.manufactureDate = manufactureDate;
        this.price = price;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", manufactureDate=" + manufactureDate +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
