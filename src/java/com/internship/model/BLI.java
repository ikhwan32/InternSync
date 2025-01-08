/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.internship.model;

/**
 *
 * @author Itqnazs
 */
public class BLI {
    private int bliID;
    private String status;

    public BLI() {
    }
    
    public BLI(int bliID, String status) {
        this.bliID = bliID;
        this.status = status;
    }


    
    public void generateBLI() {
        
    }

    /**
     * @return the bliID
     */
    public int getBliID() {
        return bliID;
    }

    /**
     * @param bliID the bliID to set
     */
    public void setBliID(int bliID) {
        this.bliID = bliID;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
}
