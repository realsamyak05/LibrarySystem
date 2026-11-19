package com.exam.LibraryManagment.model;

public class Book {
    private int id;
    private String title;
    private String auther;
    private String category;
    private int availableCopies;

    public Book() {
    }

    public Book(int id, String title, String auther, String category, int availableCopies) {
        this.id = id;
        this.title = title;
        this.auther = auther;
        this.category = category;
        this.availableCopies = availableCopies;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void setAvailableCopies(int availableCopies) {
        this.availableCopies = availableCopies;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }
}
