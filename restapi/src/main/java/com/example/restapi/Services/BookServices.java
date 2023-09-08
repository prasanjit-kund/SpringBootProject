package com.example.restapi.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.example.restapi.Entities.Books;
@Component
public class BookServices {
    static List<Books> list=new ArrayList<>();
    static{
        list.add(new Books(1, "Fundamentals Of Java", "Prasanjit"));
        list.add(new Books(2, "Java For Advanced", "Bhramara Roy"));
        list.add(new Books(3, "Java For Realtime", "Manoj"));
    }
    public List<Books> getBooks(){
        return list;
    }
    public Books getBookById(int id){
        Books book=null;
        book=list.stream().filter(e->e.getId()==id).findFirst().get();
        return book;
    }
    public Books addBook(Books book){
       list.add(book);
       return book;
    }
    public void deleteBooks(int  id){
       list=list.stream().filter(e->e.getId()!=id).collect(Collectors.toList());
    }
    public void updateBooks(Books book,int  id){
      list=list.stream().map(b->{
        if(b.getId()==id){
            b.setName(book.getName());
            b.setAuthor(book.getAuthor());
        }
        return b;
      }).collect(Collectors.toList());
    }
}
