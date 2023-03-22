package com.books.books.controller;

import com.books.books.entity.Book;
import com.books.books.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    //@Autowired
    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/addBook")
    public Book addBook(@RequestBody Book book){
        return bookService.saveBook(book);
    }
    @PostMapping("/addBooks")
    public List<Book> addBooks(@RequestBody List<Book> book){

        return bookService.saveBooks(book);
    }
    @GetMapping("/getAllBooks")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }


    @GetMapping("/bookById/{id}")
    public Book findBookById(@PathVariable long id){
        return  bookService.getBookById(id);
    }
    @GetMapping("/bookByTitle/{title}")
    public Book findBookByTitle(@PathVariable String title){
        return  bookService.getBookByTitle(title);
    }

    @PutMapping("/updateBook")
    public Book updateBook(@RequestBody Book book){
        return bookService.updateBook(book);
    }
    @DeleteMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable long id){
        return bookService.deleteBook(id);
    }
}
