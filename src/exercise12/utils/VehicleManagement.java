package exercise12.utils;

import exercise12.models.Vehicle;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class VehicleManagement {
    private static List<Vehicle> vehicleList = new LinkedList<>();

    public static void addVehicle(Vehicle vehicle){
        if (getVehicleById(vehicle).isPresent()) return;
        vehicleList.add(vehicle);
    }

    public static void removeVehicle(Vehicle vehicle){
        vehicleList.remove(vehicle);
    }

    public static void showAllVehicle(){
        vehicleList.forEach(System.out::println);
    }

    public static Optional<Vehicle> getVehicleById(Vehicle vehicle){
        return vehicleList.stream().filter(i->i.getId() == vehicle.getId()).findFirst();
    }

    public static List<Vehicle> getVehicleByColor(String color){
        return vehicleList.stream().filter(i->i.getColor().equals(color)).toList();
    }

    public static List<Vehicle> getVehicleByBrand(String brand){
        return vehicleList.stream().filter(i->i.getBrand().equals(brand)).toList();
    }
}
