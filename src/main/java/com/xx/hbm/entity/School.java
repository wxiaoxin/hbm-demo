package com.xx.hbm.entity;

import javax.persistence.*;

/**
 * Created by Administrator on 2016/9/25.
 */

@Entity
@Table(name = "t_school")
public class School {

    @Id
    @Column(length = 32)
    private String id;

    @Basic(fetch = FetchType.LAZY)
    private String name;

    public School() {}

    public School(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "School{" +
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
}
