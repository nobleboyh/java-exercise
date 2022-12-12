package exercise13.models;

import java.util.Date;

public class Certificate {
    private int id;

    private String name;

    private String rank;

    private Date date;

    public Certificate(int id, String name, String rank, Date date) {
        this.id = id;
        this.name = name;
        this.rank = rank;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Certificate{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rank='" + rank + '\'' +
                ", date=" + date +
                '}';
    }
}
