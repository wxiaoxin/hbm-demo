package com.xx.hbm.entity;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

/**
 * Created by Administrator on 2016/9/25.
 */
public class BookTest extends BaseTest {


    /**
     * 更新操作
     */
    @Test
    public void test4() {

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Book book = (Book) session.get(Book.class, "book_1");

        Student student = (Student) session.get(Student.class, "stu_2");

        Student newStu = new Student();
        newStu.setId("stu_0");

        Name name = new Name();
        name.setFirstName("first name");
        name.setMiddleName("中");
        name.setLastName("last name");

        newStu.setName(name);
        newStu.setNumber("123098");

        // 更新后外键字段的值在主表中不存在
//        book.setStudent(newStu);

        // 更新后的外键字段的值在主表中已经存在
        book.setStudent(student);


        transaction.commit();

    }


    /**
     * 删除操作
     */
    @Test
    public void test3() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Book book = (Book) session.get(Book.class, "book_1");
        session.delete(book);

        transaction.commit();
    }


    /**
     * 查询操作
     */
    @Test
    public void test2() {

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

//        Student student = (Student) session.get(Student.class, "30a25d86e7f14e4b95d3b551cfd0f83e");
//        session.delete(student);

        Book book1 = (Book) session.get(Book.class, "book_1");
//        System.out.println(book1.getStudent());

        transaction.commit();

    }


    /**
     * 插入操作
     */
    @Test
    public void test1() {

        Book book1 = new Book();
//        book1.setId(UUIDGenerator.randUUID());
        book1.setId("book_1");
        book1.setBookType(BookTypeEnum.CHINESE);
        book1.setTitle("论语");
        book1.setAuthor("孔子");
        book1.setContent("有朋自远方来，不亦乐乎");

        Book book2 = new Book();
//        book2.setId(UUIDGenerator.randUUID());
        book2.setId("book_2");
        book2.setBookType(BookTypeEnum.MATH);
        book2.setTitle("数学分析");
        book2.setAuthor("不知道");
        book2.setContent("拉格朗日中值定理");


        Book book3 = new Book();
//        book2.setId(UUIDGenerator.randUUID());
        book3.setId("book_3");
        book3.setBookType(BookTypeEnum.ENGLISH);
        book3.setTitle("大学英语-1");
        book3.setAuthor("米国");
        book3.setContent("Hello EveryOne");

        Book book4 = new Book();
//        book2.setId(UUIDGenerator.randUUID());
        book4.setId("book_4");
        book4.setBookType(BookTypeEnum.ENGLISH);
        book4.setTitle("Java编程思想");
        book4.setAuthor("American");
        book4.setContent("Hello World");


        Name name1 = new Name();
        name1.setFirstName("赵四");
        name1.setMiddleName("中");
        name1.setLastName("尼古拉斯");

        Name name2 = new Name();
        name2.setFirstName("张三");
        name2.setMiddleName("中");
        name2.setLastName("克里斯蒂亚诺");

        Student student = new Student();
//        student.setId(UUIDGenerator.randUUID());
        student.setId("stu_1");
        student.setNumber("123456");
        student.setName(name1);

        Student student2 = new Student();
//        student.setId(UUIDGenerator.randUUID());
        student2.setId("stu_2");
        student2.setNumber("147258");
        student2.setName(name2);

        book1.setStudent(student);
        book2.setStudent(student);
        book3.setStudent(student2);
        book4.setStudent(student2);

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();


        // 保存从表
        session.save(book1);
        session.save(book2);
        session.save(book3);
        session.save(book4);

        // 保存主表
        session.save(student);
        session.save(student2);

        transaction.commit();

    }


}