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
public class BLI08 extends BLI {
    private String name;
    private String matricNum;
    private String programme;
    private String phoneNum;
    private int LiDuration;
    private Date startDate;
    private Date endDate;
    private String svName;
    private String compNameAddress;
    private String compPhone;
    private String lectName;
    private String lectPhone;
    private float totalMark;

    public BLI08() {
    }
    
    public BLI08(int bliID,String status,String name,String matricNum,String programme,String phoneNum,int LiDuration,Date startDate,Date endDate,String svName,String compNameAddress,String compPhone,String lectName,String lectPhone,float totalMark){
        super(bliID,status);
    this.name = name;
    this.matricNum = matricNum;
    this.programme = programme;
    this.phoneNum = phoneNum;
    this.LiDuration = LiDuration;
    this.startDate = startDate;
    this.endDate = endDate;
    this.svName = svName;
    this.compNameAddress = compNameAddress;
    this.compPhone = compPhone;
    this.lectName = lectName;
    this.lectPhone = lectPhone;
    this.totalMark = totalMark;
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
    public String getMatricNum() {
        return matricNum;
    }

    /**
     * @param matricNo the matricNo to set
     */
    public void setMatricNum(String matricNum) {
        this.matricNum = matricNum;
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
     * @return the LiDuration
     */
    public int getLiDuration() {
        return LiDuration;
    }

    /**
     * @param LiDuration the LiDuration to set
     */
    public void setLiDuration(int LiDuration) {
        this.LiDuration = LiDuration;
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
     * @return the compNameAddress
     */
    public String getCompNameAddress() {
        return compNameAddress;
    }

    /**
     * @param compNameAddress the compNameAddress to set
     */
    public void setCompNameAddress(String compNameAddress) {
        this.compNameAddress = compNameAddress;
    }

    /**
     * @return the compPhone
     */
    public String getCompPhone() {
        return compPhone;
    }

    /**
     * @param compPhone the compPhone to set
     */
    public void setCompPhone(String compPhone) {
        this.compPhone = compPhone;
    }

    /**
     * @return the lectName
     */
    public String getLectName() {
        return lectName;
    }

    /**
     * @param lectName the lectName to set
     */
    public void setLectName(String lectName) {
        this.lectName = lectName;
    }

    /**
     * @return the lectPhone
     */
    public String getLectPhone() {
        return lectPhone;
    }

    /**
     * @param lectPhone the lectPhone to set
     */
    public void setLectPhone(String lectPhone) {
        this.lectPhone = lectPhone;
    }

    /**
     * @return the totalMark
     */
    public float getTotalMark() {
        return totalMark;
    }

    /**
     * @param totalMark the totalMark to set
     */
    public void setTotalMark(float totalMark) {
        this.totalMark = totalMark;
    }
}
