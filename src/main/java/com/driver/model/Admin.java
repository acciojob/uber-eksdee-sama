package com.driver.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int adminId;
    private String username;
    private String password;

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String gettingUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String returnPassword() {
        return password;
    }

    public void settingPassword(String password) {
        this.password = password;
    }
}