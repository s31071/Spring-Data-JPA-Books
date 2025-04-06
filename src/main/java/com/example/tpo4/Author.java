package com.example.tpo4;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

//each person can be the autor of MULTIPLE books (MANY -> MANY
@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAuthor;
    private String name;
    private int age;

    @ManyToMany(mappedBy = "authors")
    private List<Book> books = new ArrayList<>();

    public Author(){}

    public Author(String name, int age){
        //this.idAuthor = idAuthor;
        this.name = name;
        this.age = age;
    }

    public Long getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(Long idAuthor) {
        this.idAuthor = idAuthor;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
