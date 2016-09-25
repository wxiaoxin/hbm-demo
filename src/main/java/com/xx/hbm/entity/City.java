package com.xx.hbm.entity;

import javax.persistence.*;

/**
 * Created by Administrator on 2016/9/25.
 *
 * 城市
 *
 */

@Entity
@Table(name = "t_city")
public class City {


    @Id
    @Column(length = 32)
    private String id;


    private String name;


    /**
     * 多方实体类持有一方的引用
     * 并在数据表中通过外键持有对一方主键的引用
    @ManyToOne
    private Province province;     */


    public City() {}


    @Override
    public String toString() {
        return "City{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

/*
    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }*/
}
