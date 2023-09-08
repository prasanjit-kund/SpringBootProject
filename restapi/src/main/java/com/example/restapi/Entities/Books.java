package com.example.restapi.Entities;

public class Books {
    int id;
    String name;
    String author;
    
    public Books() {
    }
    
    public Books(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
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
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Books [id=" + id + ", name=" + name + ", author=" + author + "]";
    }
    
    
}
