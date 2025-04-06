package com.example.tpo4;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

//each book is published by ONE publisher (MANY -> ONE)
//each book can have MULTIPLE authors (MANY -> MANY) [?]
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBook;
    private String title;
    private String genre;
    private Double price;

    @ManyToOne
    @JoinColumn(name = "idPublisher")
    private Publisher publisher;

    @ManyToMany
    @JoinTable(
            name = "AuthorOfTheBook",
            joinColumns = @JoinColumn(name = "idBook"),
            inverseJoinColumns = @JoinColumn(name = "idAuthor")
    )
    private List<Author> authors = new ArrayList<>();

    public Book() {}

    public Book(Long idBook, String title, String genre, Double price, Publisher publisher) {
        this.idBook = idBook;
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.publisher = publisher;
    }

    public Long getIdBook() {
        return idBook;
    }

    public void setIdBook(Long idBook) {
        this.idBook = idBook;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

//    public void addAuthor(Author author){
//        authors.add(author);
//        authors.getBooks().add(this);
//    }
}



