package com.example.demo.entity;


import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2020-01-08 09:25:53
 */
public class User implements Serializable {
    private static final long serialVersionUID = 518515160285583803L;
    
    private Integer id;
    
    private Integer age;
    
    private String name;
    
    private String phone;
    
    private String addr;

    public User() {
    }

    public User(Integer age, String name, String phone, String addr) {
        this.age = age;
        this.name = name;
        this.phone = phone;
        this.addr = addr;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }
}