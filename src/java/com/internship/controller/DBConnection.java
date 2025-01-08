/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.internship.controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author myPC
 */
public class DBConnection {
    public static Connection dbConnect() throws ClassNotFoundException, SQLException{
        
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/internship";
        String username = "root";
        String password = "";


        Class.forName(driver);
        return DriverManager.getConnection(url, username, password);
    }


}
