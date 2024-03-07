package com.javaapi.api.Controller;

import jakarta.persistence.*;
import jdk.jfr.DataAmount;
/*import lombok.Data;
import lombok.Getter;
import lombok.Setter;*/
import org.springframework.beans.factory.annotation.Value;


@Entity
@Table(name = "SQLbook", schema = "dbo")
/*@Data
@Getter
@Setter*/
public class SqlBook  {
    @Id
    @Column(name = "book_id")
    private Long id;

    @Column(name = "book_name")
    private String bookName;

    @Column(name = "book_pages")
    private Long bookPages;

    @Column(name = "book_author")
    private String bookAuthor;

    @Column(name = "book_price")
    private Long bookPrice;

    @Column(name = "book_detail")
    private String bookDetail;


}
