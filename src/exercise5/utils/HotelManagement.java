package exercise5.utils;

import exercise5.models.Customer;
import exercise5.models.Reservation;
import exercise5.models.Room;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class HotelManagement {
    private static final List<Customer> customerList = new ArrayList<>();
    private static final List<Reservation> reservationList = new ArrayList<>();

    public static final Room RoomA = new Room("A", 500);
    public static final Room RoomB = new Room("B", 300);
    public static final Room RoomC = new Room("C", 100);

    public static void addCustomer(Customer customer){
        if(isExistingCustomer(customer)) return;
        customerList.add(customer);
    }

    public static void deleteCustomer(Customer customer){
        customerList.removeIf(item -> item.getID() == customer.getID());
        reservationList.removeIf(item -> item.getCustomer().getID() == customer.getID());
    }

    public static void addReservation(Customer customer, Room room, int days){
        if (!isExistingCustomer(customer)){
            addCustomer(customer);
        }
        Reservation reservation = new Reservation(customer, room, days);
        reservationList.add(reservation);
    }

    public static void showCalculatedPrice(Customer customer){
        List<Reservation> reservations = reservationList.stream().filter(reserv -> reserv.getCustomer().getID() == customer.getID()).toList();
        reservations.forEach(reservation -> System.out.println(reservation.toString() + "Total price: " + reservation.getTotalPrice()));
    }

    public static void showAllCustomers(){
        customerList.forEach(System.out::println);
    }

    public static void showAllReservation(){
        reservationList.forEach(System.out::println);
    }


    public static Optional<Customer> searchCustomerById(int id){
        return customerList.stream().filter(customer -> customer.getID() == id).findFirst();
    }

    private static boolean isExistingCustomer(Customer customer){
        Optional<Customer> existingCustomer = searchCustomerById(customer.getID());
        return existingCustomer.isPresent();
    }
}
