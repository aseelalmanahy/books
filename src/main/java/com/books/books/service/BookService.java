package com.books.books.service;

import com.books.books.entity.Book;
import com.books.books.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book saveBook(Book book){
        return bookRepository.save(book);
    }

    public List<Book> saveBooks(List<Book> books){
        return bookRepository.saveAll(books);
    }

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    public Book getBookById(long id){
        return bookRepository.findById(id).orElse(null);
    }
    public Book getBookByTitle(String title){
        return bookRepository.findByTitle(title);
    }

    public String deleteBook(long id){
        bookRepository.deleteById(id);
        return "Book removed " + id;
    }

    public Book updateBook(Book book){
        Book existedBook = bookRepository.findById(book.getId()).orElse(null);
        existedBook.setAuthor(book.getAuthor());
        existedBook.setCountry(book.getCountry());
        existedBook.setLanguage(book.getLanguage());
        existedBook.setPages(book.getPages());
        existedBook.setTitle(book.getTitle());
        existedBook.setYear(book.getYear());

        return bookRepository.save(existedBook);
    }
}
