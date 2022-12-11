package exercise5.models;

public class Reservation {

    private Customer customer;

    private Room room;

    private int numberOfDays;

    public Reservation(Customer customer, Room room, int numberOfDays) {
        this.customer = customer;
        this.room = room;
        this.numberOfDays = numberOfDays;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public double getTotalPrice(){
        return numberOfDays*room.getPrice();
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "customer=" + customer +
                ", room=" + room +
                ", numberOfDays=" + numberOfDays +
                '}';
    }
}
