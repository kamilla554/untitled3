package com.company;

public class BookTest {

    void test(){
        System.out.println("test..");
        Book book = new Book(1890, "Oscar Wilde","The Picture of Dorian Gray");
        System.out.println(book.toString());
    }
}
