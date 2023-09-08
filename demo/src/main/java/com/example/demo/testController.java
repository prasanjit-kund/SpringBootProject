package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.BookService;
@RestController
// @Controller
public class testController {
    // @RequestMapping("/test")
    // @ResponseBody
    // public String handle(){
    //     return "This is testing response";
    // }
    // @RequestMapping(value = "/book",method =RequestMethod.GET )
    // @ResponseBody
    // public String getBooks(){
    //     return "One";
    // }
    @Autowired
    private BookService bookService;
    @GetMapping("/book" )
    public List<Book> getBooks(){
        // return "One";
        // Book book =new Book();
        // book.setId(1);
        // book.setName("Fundamentals Of Java");
        // book.setAuthor("reny Dekport");
        return this.bookService.getAllBooks();

    }
    @GetMapping("/book/{id}")
    public Book getBook(@PathVariable("id") int id){
        return bookService.getBookById(id);
    }
    
}
