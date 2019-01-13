package com.demo.spdemo.domain;

import javax.xml.bind.annotation.XmlRootElement;
/**
 * User.
 */
@XmlRootElement // mediatype 转为xml
public class User {

    private long id; // 用户的唯一标识
    private String name;
    private String email;

    public User() {
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}