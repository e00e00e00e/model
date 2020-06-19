package com.example.demo.entity;

import com.example.demo.entity.BaseBean;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "empe")
public class User extends BaseBean {

    private String name;
    private int age;
    private String info;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

}
