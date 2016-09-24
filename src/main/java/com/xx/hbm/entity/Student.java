package com.xx.hbm.entity;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Administrator on 2016/9/24.
 *
 * 学生
 *
 */

@Entity
@Table(name = "t_student")
public class Student {


    @Id
    @Column(length = 32)
    private String id;

    private String number;

    @Embedded
    private Name name;


    /**
     * 单向一对多关联关系：一方持有多方的集合
     *   如果不使用@Column注解，将会生成一张t_student和t_book的中间表，用于关联book_id和student_id
     *   使用@Column注解，将不会生成中间表，但是会在多方表中持有对一方的引用字段,stu_id指定了引用的字段名称
     */
    @OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinColumn(name = "stu_id")
    private Set<Book> books;


    public Student() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
