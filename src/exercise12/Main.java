package exercise12;

import exercise12.models.Car;
import exercise12.models.MotorBike;
import exercise12.models.Truck;
import exercise12.models.Vehicle;
import exercise12.utils.VehicleManagement;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car(1,"Toyota", new Date(), 10000, "red", 5, "V8");
        Vehicle vehicle2 = new Truck(2,"Truck", new Date(), 10000, "red", 5000);
        Vehicle vehicle3 = new MotorBike(3,"Honda", new Date(), 10000, "red", 200);
        Vehicle vehicle4 = new MotorBike(3,"HondaA", new Date(), 10000, "red", 300);

        VehicleManagement.addVehicle(vehicle1);
        VehicleManagement.addVehicle(vehicle2);
        VehicleManagement.addVehicle(vehicle3);
        VehicleManagement.addVehicle(vehicle4);
        VehicleManagement.showAllVehicle();

        System.out.println("After delete: ");
        VehicleManagement.removeVehicle(vehicle2);
        VehicleManagement.showAllVehicle();

        System.out.println("Search by Brand: ");
        VehicleManagement.getVehicleByBrand("Honda").forEach(System.out::println);

        System.out.println("Search by color: ");
        VehicleManagement.getVehicleByColor("red").forEach(System.out::println);

    }
}
