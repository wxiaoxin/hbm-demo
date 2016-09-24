package com.xx.hbm.entity;

import com.xx.hbm.util.UUIDGenerator;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2016/9/24.
 */
public class StudentTest extends BaseTest {


    @Test
    public void test1() {

        Book book1 = new Book();
        book1.setId(UUIDGenerator.randUUID());
        book1.setBookType(BookTypeEnum.CHINESE);
        book1.setTitle("论语");
        book1.setAuthor("孔子");
        book1.setContent("有朋自远方来，不亦乐乎");

        Book book2 = new Book();
        book2.setId(UUIDGenerator.randUUID());
        book2.setBookType(BookTypeEnum.MATH);
        book2.setTitle("数学分析");
        book2.setAuthor("不知道");
        book2.setContent("拉格朗日中值定理");

        Set<Book> books = new HashSet<>();
        books.add(book1);
        books.add(book2);

        Name name = new Name();
        name.setFirstName("赵四");
        name.setMiddleName("");
        name.setLastName("尼古拉斯");

        Student student = new Student();
        student.setId(UUIDGenerator.randUUID());
        student.setNumber("123456");
        student.setName(name);
        student.setBooks(books);

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(book1);
        session.save(book2);
        session.save(student);

        transaction.commit();

    }


}