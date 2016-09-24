package com.xx.hbm.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;

/**
 * Created by Administrator on 2016/9/24.
 *
 * 书
 *
 */

@Entity
@Table(name = "t_book")
public class Book {

    @Id
    @Column(length = 32)
    private String id;

    @Enumerated(EnumType.STRING)
    @Column(name = "book_type")
    private BookTypeEnum bookType;

    private String title;

    private String author;

    @Type(type = "text")
    private String content;

    public Book() {}

    public Book(BookTypeEnum bookType, String title, String author, String content) {
        this.bookType = bookType;
        this.title = title;
        this.author = author;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", bookType=" + bookType +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                '}';
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BookTypeEnum getBookType() {
        return bookType;
    }

    public void setBookType(BookTypeEnum bookType) {
        this.bookType = bookType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
