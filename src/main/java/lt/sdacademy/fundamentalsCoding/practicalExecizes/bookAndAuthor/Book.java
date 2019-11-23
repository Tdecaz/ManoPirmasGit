package lt.sdacademy.fundamentalsCoding.practicalExecizes.bookAndAuthor;

import java.util.List;

public class Book {

    private String title;
    private List<Author> authors;
    private double price;
    private int qnt;

    public Book(String title, List<Author> author, double price, int qnt) {
        this.title = title;
        this.authors = author;
        this.price = price;
        this.qnt = qnt;
    }

    /*public String gettitle() { return title; }
    public List<Author> authors() { return authors; }
    public double price() { return price; }
    public int qnt() { return qnt; }*/

    public String toString() {
        return String.format("Autoriaus vardas: %s, pastas: %s", title, authors.get(0).toString());

}}




