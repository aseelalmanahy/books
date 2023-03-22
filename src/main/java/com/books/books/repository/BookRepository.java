package com.books.books.repository;

import com.books.books.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface BookRepository extends JpaRepository<Book, Long> {
    Book findByTitle(String title);
}
