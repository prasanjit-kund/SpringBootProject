package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.Book;
@Component
public class BookService {
    private static List<Book> list=new ArrayList<>();
    static{
        list.add(new Book(1,"Java For Biggner","Corey Anderson"));
        list.add(new Book(2,"Python For Biggner","Brain Lara"));
        list.add(new Book(3,"Springboot For Biggner","Sachin Ambore"));
         }
    public List<Book> getAllBooks(){
        return list;
    }
    public Book getBookById(int id){
        Book book=null;
        book=list.stream().filter(e->e.getId()==id).findFirst().get();
        return book;
    }
}
