package com.ifox.entity;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in15:24 2018/4/14
 * @Modified By:
 */

public class User {
    private Integer id;
    private String userName;
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
