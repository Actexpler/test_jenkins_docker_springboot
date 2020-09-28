package com.example.demo.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @author wangzongcheng
 * @ClassName User.java
 * @Description TODO
 * @createTime 2020-09-28- 21:03:00
 */
public class User {
    private String userId;
    private String name;
    private String password;
    private String email;
    private int role;
    private String path;
    private double space;
    private double usedspace;
    private String realname;
    private int security;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.S", timezone = "Asia/Shanghai")
    private Date createtime;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public double getSpace() {
        return space;
    }

    public void setSpace(double space2) {
        this.space = space2;
    }

    public double getUsedspace() {
        return usedspace;
    }

    public void setUsedspace(double d) {
        this.usedspace = d;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public int getSecurity() {
        return security;
    }

    public void setSecurity(int security) {
        this.security = security;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

         User mainUser = (User) o;

        if (userId != null ? !userId.equals(mainUser.userId) : mainUser.userId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId != null ? userId.hashCode() : 0;
        return result;
    }
}
