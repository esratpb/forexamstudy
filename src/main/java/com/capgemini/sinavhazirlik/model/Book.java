package com.capgemini.sinavhazirlik.model;


import org.hibernate.annotations.GenericGenerator;


import javax.persistence.*;
import java.util.Optional;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "native")
    @GenericGenerator(name="native",strategy = "native")
    private int id;
    private String bookName;

    @ManyToOne
    private Author author;

    public Book() {
    }

    public Book(int bookId, String bookName, Author author) {
        this.id = bookId;
        this.bookName = bookName;
        this.author = author;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", author=" + author +
                '}';
    }
}
