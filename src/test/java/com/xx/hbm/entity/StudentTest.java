package com.xx.hbm.entity;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

/**
 * Created by Administrator on 2016/9/24.
 */
public class StudentTest extends BaseTest {


    @Test
    public void test1() {

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Student student = (Student) session.get(Student.class, "stu_1");
        session.delete(student);

        transaction.commit();
    }

}