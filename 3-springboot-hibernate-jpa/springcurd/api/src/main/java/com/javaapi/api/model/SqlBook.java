package com.javaapi.api.model;

import jakarta.persistence.*;
import jdk.jfr.DataAmount;
import org.springframework.beans.factory.annotation.Value;


@Entity
@Table(name = "SQLbook", schema = "dbo")
public class SqlBook  {

    /*@Id
    @Column(name = "book_id")
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;*/

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer book_id;

    @Column(name = "book_name")
    private String bookName;

    @Column(name = "book_pages")
    private Integer bookPages;

    @Column(name = "book_author")
    private String bookAuthor;

    @Column(name = "book_price")
    private Integer bookPrice;

    @Column(name = "book_detail")
    private String bookDetail;

    public SqlBook(){

    }

    // Getter and setter methods
    public Integer getId() {
        return book_id;
    }
    public void setId(Integer book_id) {
        this.book_id = book_id;
    }

    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getBookPages() {
        return bookPages;
    }
    public void setBookPages(Integer bookPages) {
        this.bookPages = bookPages;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }
    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public Integer getBookPrice() {
        return bookPrice;
    }
    public void setBookPrice(Integer bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookDetail() {
        return bookDetail;
    }
    public void setBookDetail(String bookDetail) {
        this.bookDetail = bookDetail;
    }

    public SqlBook( String bookName, Integer bookPages, String bookAuthor, Integer bookPrice, String bookDetail){

        this.bookName = bookName;
        this.bookPages = bookPages;
        this.bookAuthor = bookAuthor;
        this.bookPrice = bookPrice;
        this.bookDetail = bookDetail;
    }

}
