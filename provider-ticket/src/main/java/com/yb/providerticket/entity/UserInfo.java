package com.yb.providerticket.entity;

public class UserInfo {

    private int id;

    private String user_code;

    private String user_came;

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

    public String getUser_came() {
        return user_came;
    }

    public void setUser_came(String user_came) {
        this.user_came = user_came;
    }

    public UserInfo() {
    }

    public UserInfo(int id, String user_code, String user_came) {
        this.id = id;
        this.user_code = user_code;
        this.user_came = user_came;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", user_code='" + user_code + '\'' +
                ", user_came='" + user_came + '\'' +
                '}';
    }
}
