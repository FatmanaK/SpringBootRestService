package com.learningspring.controller;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity  //help JPA understand that is the class which needs to map with database
//Entities in JPA are nothing but POJOs representing data that can be persisted in the database.
// An entity represents a table stored in a database.
// Every instance of an entity represents a row in the table.
//before spring3 we used Javax but now need Jakarta library (import jakarta.persistence.Entity;)add dependency for jakarta
@Table(name= "LibraryDemo")
public class Library {

    @Column (name = "book_name")
    private String book_name;
    private  String id;
    private  String isbn;
    private  int aisle;
    private String author;

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getAisle() {
        return aisle;
    }

    public void setAisle(int aisle) {
        this.aisle = aisle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
