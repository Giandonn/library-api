package com.example.library.model;

import jakarta.persistence.*;

@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto incremento isso
    private Long id;
    private String name;
    private String description;
    private Boolean onLoan = false; // emprestado ou nao

    public Book(String name, String description, Boolean onLoan) {
        this.name = name;
        this.description = description;
        this.onLoan = onLoan;
    }

    // Construtor default
    public Book() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getOnLoan() {
        return onLoan;
    }

    public void setOnLoan(Boolean onLoan) {
        this.onLoan = onLoan;
    }
}
