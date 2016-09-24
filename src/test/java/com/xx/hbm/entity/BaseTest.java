package com.xx.hbm.entity;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.junit.After;
import org.junit.Before;

/**
 * Created by Administrator on 2016/9/24.
 */
public class BaseTest {

    protected SessionFactory sessionFactory;

    @Before
    public void fefore() {
        Configuration configuration = new Configuration().configure();
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
    }


    @After
    public void after() {
        if(sessionFactory != null) {
            sessionFactory.close();
        }
    }

}
