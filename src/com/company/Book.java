package com.company;

public class Book {
    int yearOfBook;
    String author;
    String name;

    public Book(int yearOfBook, String author, String name) {
        this.yearOfBook = yearOfBook;
        this.author = author;
        this.name = name;
    }

    public int getYearOfBook() {
        return yearOfBook;
    }

    public void setYearOfBook(int yearOfBook) {
        this.yearOfBook = yearOfBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "yearOfBook='" + yearOfBook + '\'' +
                ", author='" + author + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
