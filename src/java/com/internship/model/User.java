/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.internship.model;
import java.io.Serializable;

/**
 *
 * @author myPC
 */
public class User implements Serializable {

    private int userID;
    private String username;
    private String password;
    private String email;
    private String phoneNumber;
    private String userType;

    public User() {

    }

    public User(int userID, String username, String password, String email, String phoneNumber, String userType) {
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.userType = userType;
    }

    public int getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String toString() {
        return "User{" + "username=" + username + ", password=" + password + ", email=" + email + ", phoneNumber=" + phoneNumber + ", userType=" + userType + '}';
    }

}
