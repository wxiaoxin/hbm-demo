package com.xx.hbm.entity;

import com.xx.hbm.util.UUIDGenerator;
import junit.framework.TestCase;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Administrator on 2016/9/25.
 */
public class EntityManagerTest extends TestCase {


    private EntityManagerFactory entityManagerFactory;

    @Override
    protected void setUp() throws Exception {
        entityManagerFactory = Persistence.createEntityManagerFactory("hbm.provider.config");
    }

    @Override
    protected void tearDown() throws Exception {
        entityManagerFactory.close();
    }


    @Test
    public void test1() {

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // 开启事务
        entityManager.getTransaction().begin();

        School school = new School();
        school.setId(UUIDGenerator.randUUID());
        school.setName("六安一中");
        entityManager.persist(school);

        // 提交事务
        entityManager.getTransaction().commit();

        entityManager.close();

    }

}
