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
public class Company {

    private int companyID;
    private String companyName;
    private String companyAddress;
    private String jobScope;

    public Company() {
    }

    public Company(int id, String companyName, String companyAddress, String jobScope) {
        this.companyID = id;
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.jobScope = jobScope;
    }

    /**
     * @return the id
     */
    public int getCompanyID() {
        return companyID;
    }

    /**
     * @param id the id to set
     */
    public void setCompanyID(int id) {
        this.companyID = id;
    }

    /**
     * @return the companyName
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * @param companyName the companyName to set
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * @return the companyAddress
     */
    public String getCompanyAddress() {
        return companyAddress;
    }

    /**
     * @param companyAddress the companyAddress to set
     */
    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    /**
     * @return the jobScope
     */
    public String getJobScope() {
        return jobScope;
    }

    /**
     * @param jobScope the jobScope to set
     */
    public void setJobScope(String jobScope) {
        this.jobScope = jobScope;
    }

}
