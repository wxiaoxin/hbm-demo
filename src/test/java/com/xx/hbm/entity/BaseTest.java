package com.xx.hbm.entity;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Administrator on 2016/9/24.
 */
public class BaseTest {

    protected SessionFactory sessionFactory;

    @Before
    public void before() {

        // 基于配置文件的启动形式
        Configuration configuration = new Configuration().configure();
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);

/*
        // 基于代码形式的启动形式
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .configure("基础配置文件路径等")
                .build();

        // 使用hibernate标准的隐含命名策略、catalog、schema等等配置
        MetadataSources metadataSources = new MetadataSources(serviceRegistry);
        // 添加注解类，映射文件等。支持链式编程风格
        metadataSources.addAnnotatedClass(Book.class)
                .addAnnotatedClass(Student.class)
                .addAnnotatedClassName("com.xx.hbm.entity.Province")
                .addAnnotatedClassName("com.xx.hbm.entity.City")
                .addResource("school.hbm.xml");*/

//        Metadata metadata = metadataSources.buildMetadata();



/*
        // 自定义实现MetadataSouce的各种配置
        MetadataBuilder metadataBuilder = metadataSources.getMetadataBuilder();
        // 自定义命名策略
        metadataBuilder.applyImplicitNamingStrategy(null);
        // 自定义catelog
        metadataBuilder.applyImplicitCatalogName("hbmdemo");
        // ...

        // 生成元数据对象
        Metadata metadata = metadataBuilder.build();

        SessionFactoryBuilder sessionFactoryBuilder = metadata.getSessionFactoryBuilder();
        sessionFactoryBuilder.applyBeanManager(null);
        SessionFactory sessionFactory = sessionFactoryBuilder.build();

        */

    }


    @Test
    public void test1() {

//        EntityManager entityManager = new EntityManagerFactoryBuilderImpl().build().createEntityManager();

    }


    @After
    public void after() {
        if(sessionFactory != null) {
            sessionFactory.close();
        }
    }

}
