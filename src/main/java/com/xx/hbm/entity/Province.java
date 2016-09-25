package com.xx.hbm.entity;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Administrator on 2016/9/25.
 *
 * 省
 *
 */

@Entity
@Table(name = "t_province")
public class Province {


    @Id
    @Column(length = 32)
    private String id;

    private String name;


    /**
     * 一方实体类持有多方的集合
     */
    @OneToMany()
    @JoinColumn(name = "province_id")
    private Set<City> cities;


    public Province() {}

    @Override
    public String toString() {
        return "Province{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", cities=" + cities +
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

    public Set<City> getCities() {
        return cities;
    }

    public void setCities(Set<City> cities) {
        this.cities = cities;
    }
}
