package com.example.library.dto;

public class BookDTO {
    private String name;
    private String description;
    private Boolean onLoan;

    public BookDTO(String name, String description, Boolean onLoan) {
        this.name = name;
        this.description = description;
        this.onLoan = onLoan;
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
        return this.onLoan;
    }

    public void setOnLoan(Boolean onLoan) {
        this.onLoan = onLoan;
    }
}