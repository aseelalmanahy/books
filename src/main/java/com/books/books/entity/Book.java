package com.books.books.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name="books")
public class Book {

    @Id
    @GeneratedValue
    private long id;

    private String author;
    private String country;
    private String language;
    private String pages;
    private String title;
    private String year;


    public Book(String author, String country, String language, String pages, String title, String year) {
        this.author = author;
        this.country = country;
        this.language = language;
        this.pages = pages;
        this.title = title;
        this.year = year;
    }

    public Book(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id && Objects.equals(author, book.author) && Objects.equals(country, book.country) && Objects.equals(language, book.language) && Objects.equals(pages, book.pages) && Objects.equals(title, book.title) && Objects.equals(year, book.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, author, country, language, pages, title, year);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", country='" + country + '\'' +
                ", language='" + language + '\'' +
                ", pages='" + pages + '\'' +
                ", title='" + title + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
