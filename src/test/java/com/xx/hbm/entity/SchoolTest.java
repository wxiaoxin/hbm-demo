package com.xx.hbm.entity;

import com.xx.hbm.util.UUIDGenerator;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

/**
 * Created by Administrator on 2016/9/25.
 */
public class SchoolTest extends BaseTest {


    @Test
    public void test1() {

        School school = new School();
        school.setId(UUIDGenerator.randUUID());
        school.setName("六安一中");

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(school);

        transaction.commit();

    }


}