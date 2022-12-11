package exercise8.models;

import java.util.Date;

public class LibraryCard {
    private int id;

    private Student student;

    private Date getDate;

    private Date returnDate;

    private int bookID;

    public LibraryCard(int id, Student student, Date getDate, Date returnDate, int bookID) {
        this.id = id;
        this.student = student;
        this.getDate = getDate;
        this.returnDate = returnDate;
        this.bookID = bookID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Date getGetDate() {
        return getDate;
    }

    public void setGetDate(Date getDate) {
        this.getDate = getDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    @Override
    public String toString() {
        return "LibraryCard{" +
                "id=" + id +
                ", student=" + student +
                ", getDate=" + getDate +
                ", returnDate=" + returnDate +
                ", bookID=" + bookID +
                '}';
    }
}
