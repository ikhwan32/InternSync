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
public class BLI06 extends BLI {
    private String name;
    private String programme;
    private String matricNum;
    private String phoneNum;
    private Date startDate;
    private Date endDate;
    private String svName;
    private String compNameAddress;
    private String lectName;
    private String penyelaras;
    private Date date;
    private float totalMark;
    private String comment;
    
    public BLI06() {
    }


    public BLI06(int bliID,String status,String name,String programme,String matricNum,String phoneNum,Date startDate,Date endDate,String svName,String compNameAddress,String lectName,String penyelaras,Date date,float totalMark,String comment){
        super(bliID,status);
    this.name = name;
    this.programme = programme;
    this.matricNum = matricNum;
    this.phoneNum = phoneNum;
    this.startDate = startDate;
    this.endDate = endDate;
    this.svName = svName;
    this.compNameAddress = compNameAddress;
    this.lectName = lectName;
    this.penyelaras = penyelaras;
    this.lectName = lectName;
    this.penyelaras = penyelaras;
    this.date = date;
    this.totalMark = totalMark;
    this.comment = comment;
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
     * @return the penyelaras
     */
    public String getPenyelaras() {
        return penyelaras;
    }

    /**
     * @param penyelaras the penyelaras to set
     */
    public void setPenyelaras(String penyelaras) {
        this.penyelaras = penyelaras;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
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

    /**
     * @return the comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * @param comment the comment to set
     */
    public void setComment(String comment) {
        this.comment = comment;
    }
}