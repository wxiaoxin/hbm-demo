package com.xx.hbm.entity;

import com.xx.hbm.util.UUIDGenerator;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2016/9/25.
 */
public class ProvinceTest extends BaseTest {


    @Test
    public void test2() {

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Province province = (Province) session.get(Province.class, "e95a3bd4b01643b29cb4656be34a50d8");
        System.out.println(province.getName());
//        System.out.println(province.getCities());

        transaction.commit();
    }


    @Test
    public void test1() {

        City city1 = new City();
        city1.setId(UUIDGenerator.randUUID());
        city1.setName("六安");

        City city2 = new City();
        city2.setId(UUIDGenerator.randUUID());
        city2.setName("合肥");

        City city3 = new City();
        city3.setId(UUIDGenerator.randUUID());
        city3.setName("黄山");


        Set<City> cities = new HashSet<>();
        cities.add(city1);
        cities.add(city2);
        cities.add(city3);


        Province province = new Province();
        province.setId(UUIDGenerator.randUUID());
        province.setName("安徽");
        province.setCities(cities);

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();


//        city1.setProvince(province);
//        city2.setProvince(province);
//        city3.setProvince(province);

        session.save(city1);
        session.save(city2);
        session.save(city3);
        session.save(province);

        transaction.commit();

    }



}