/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.internship.model;

/**
 *
 * @author myPC
 */
public class UniversitySupervisor extends User{
    
    private String usName;

    public UniversitySupervisor(String usName) {
        this.usName = usName;
    }

    public UniversitySupervisor(String usName, int userID, String username, String password, String email, String phoneNumber, String userType) {
        super(userID, username, password, email, phoneNumber, userType);
        this.usName = usName;
    }

    /**
     * @return the usName
     */
    public String getUsName() {
        return usName;
    }

    /**
     * @param usName the usName to set
     */
    public void setUsName(String usName) {
        this.usName = usName;
    }

    
}
