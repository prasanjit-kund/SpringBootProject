package com.example.restapi.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.restapi.Entities.Books;
import com.example.restapi.Services.BookServices;

@RestController
public class BookControllers {
    @Autowired
    BookServices bookServices;
    @GetMapping(value = "/book")
    public Books getBooks(){
        Books book=new Books(1, "Fundamentals Of Java", "Codey Anderson");
        System.out.println(book.toString());
        return book;
    }
    @GetMapping(value = "/books")
    public List<Books> getBooks2(){
        return bookServices.getBooks();
    }
    @GetMapping(value="/books/{id}")
    public Books getBookById(@PathVariable("id") int id){
        return bookServices.getBookById(id);
    }
    @PostMapping(value="/book")
    public Books addBook1(@RequestBody Books book){
       Books b= this.bookServices.addBook(book);
        return b;
    }
    @DeleteMapping(value="/book/{id}")
    public void deleteBook(@PathVariable("id") int id){
      this.bookServices.deleteBooks(id);
    }
   @PutMapping(value="/book/{id}")
    public Books updateBook(@RequestBody Books book ,@PathVariable("id") int id){
      this.bookServices.updateBooks(book, id);
      return book;
    }
}
