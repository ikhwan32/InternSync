/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.internship.model;

import java.util.Date;

/**
 *
 * @author hp
 */
public class BLI04 extends BLI {
    private String email;
    private String name;
    private String matricNo;
    private String phoneNum;
    private String programme;
    private String academicAdvisor;
    private Date startDate;
    private Date endDate;
    private String compName;
    private String compAddress;
    private String svName;
    private String svPhone;
    private String image;
    
    public BLI04() {
    }

    public BLI04(int bliID,String status,String email,String name,String matricNo,String phoneNum,String programme,String academicAdvisor,Date startDate,Date endDate,String compName,String compAddress,String svName,String svPhone,String image){
        super(bliID,status);
    this.email = email;
    this.name = name;
    this.matricNo = matricNo;
    this.phoneNum = phoneNum;
    this.programme = programme;
    this.academicAdvisor = academicAdvisor;
    this.startDate = startDate;
    this.endDate = endDate;
    this.compName = compName;
    this.compAddress = compAddress;
    this.svName = svName;
    this.svPhone = svPhone;
    this.image = image;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the matricNo
     */
    public String getMatricNo() {
        return matricNo;
    }

    /**
     * @param matricNo the matricNo to set
     */
    public void setMatricNo(String matricNo) {
        this.matricNo = matricNo;
    }

    /**
     * @return the phoneNum
     */
    public String getPhoneNum() {
        return phoneNum;
    }

    /**
     * @param phoneNum the phoneNum to set
     */
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    /**
     * @return the programme
     */
    public String getProgramme() {
        return programme;
    }

    /**
     * @param programme the programme to set
     */
    public void setProgramme(String programme) {
        this.programme = programme;
    }

    /**
     * @return the academicAdvisor
     */
    public String getAcademicAdvisor() {
        return academicAdvisor;
    }

    /**
     * @param academicAdvisor the academicAdvisor to set
     */
    public void setAcademicAdvisor(String academicAdvisor) {
        this.academicAdvisor = academicAdvisor;
    }

    /**
     * @return the startDate
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the endDate
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * @return the compName
     */
    public String getCompName() {
        return compName;
    }

    /**
     * @param compName the compName to set
     */
    public void setCompName(String compName) {
        this.compName = compName;
    }

    /**
     * @return the compAddress
     */
    public String getCompAddress() {
        return compAddress;
    }

    /**
     * @param compAddress the compAddress to set
     */
    public void setCompAddress(String compAddress) {
        this.compAddress = compAddress;
    }

    /**
     * @return the svName
     */
    public String getSvName() {
        return svName;
    }

    /**
     * @param svName the svName to set
     */
    public void setSvName(String svName) {
        this.svName = svName;
    }

    /**
     * @return the svPhone
     */
    public String getSvPhone() {
        return svPhone;
    }

    /**
     * @param svPhone the svPhone to set
     */
    public void setSvPhone(String svPhone) {
        this.svPhone = svPhone;
    }

    /**
     * @return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(String image) {
        this.image = image;
    }
  
}
