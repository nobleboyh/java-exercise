package exercise5;

import exercise5.models.Customer;
import exercise5.utils.HotelManagement;

public class Main {
    public static void main(String[] args) {
        //Add customer
        Customer customer1 = new Customer(123, "hoang", 18);
        Customer customer2 = new Customer(321, "hoang123", 19);
        HotelManagement.addCustomer(customer1);
        HotelManagement.addCustomer(customer2);
        HotelManagement.showAllCustomers();

        //Add reservations
        HotelManagement.addReservation(customer1, HotelManagement.RoomA, 3);
        HotelManagement.addReservation(customer1, HotelManagement.RoomB, 4);
        HotelManagement.addReservation(customer2, HotelManagement.RoomC, 1);

        //Show price
        HotelManagement.showCalculatedPrice(customer1);
    }
}
