package exercise8;

import exercise8.models.LibraryCard;
import exercise8.models.Student;
import exercise8.utils.LibraryCardManagement;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    private static final long MILLIS_IN_A_DAY = 1000 * 60 * 60 * 24;

    public static void main(String[] args) {
        Student student1 = new Student("Hoang", 18, "A1");
        Student student2 = new Student("Hoang2", 19, "A2");

        Date dateNow = new Date();
        Date dateNext = new Date(dateNow.getTime() + MILLIS_IN_A_DAY);
        LibraryCard libraryCard1 = new LibraryCard(1, student1, dateNow, dateNext, 1);
        LibraryCard libraryCard2 = new LibraryCard(2, student2, dateNow, dateNext, 2);

        LibraryCardManagement.addCard(libraryCard1);
        LibraryCardManagement.addCard(libraryCard2);

        LibraryCardManagement.showAllCard();

        LibraryCardManagement.deleteCard(libraryCard1);
        LibraryCardManagement.showAllCard();

    }
}
