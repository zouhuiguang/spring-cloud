package com.yb.provider.service.providerservice.entity;

import javax.persistence.Column;
import javax.persistence.Id;

public class UserInfo {
    @Id
    private int id;
    @Column(name = "user_code")
    private String user_code;
    @Column(name = "user_name")
    private String user_name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_code() {
        return user_code;
    }

    public void setUser_code(String user_code) {
        this.user_code = user_code;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public UserInfo() {
    }

    public UserInfo(int id, String user_code, String user_name) {
        this.id = id;
        this.user_code = user_code;
        this.user_name = user_name;
    }

    @Override
    public String toString() {
        return "UserInfoMapper{" +
                "id=" + id +
                ", user_code='" + user_code + '\'' +
                ", user_name='" + user_name + '\'' +
                '}';
    }
}
