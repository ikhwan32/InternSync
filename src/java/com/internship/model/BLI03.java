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
public class BLI03 extends BLI {
    private String email;
    private String name;
    private String matricNo;
    private String programme;
    private String phoneNum;
    private String Address;
    private Date stratDate;
    private Date endDate;
    private String compName;
    private String compAddress;
    private String compPhone;
    private String compFax;
    private String compSupervisor;
    private String svPhone;
    private String svEmail;
    private String BLI02;
    private String offerLetter;
    
    public BLI03() {
    }

    public BLI03(int bliID,String status,String email,String name,String matricNo,String programme,String phoneNum,String Address,Date stratDate,Date endDate,String compName,String compAddress,String compPhone,String compFax,String compSupervisor,String svPhone,String svEmail,String BLI02,String offerLetter){
        super(bliID,status);
    this.email = email;
    this.name = name;
    this.matricNo = matricNo;
    this.programme = programme;
    this.programme = programme;
    this.phoneNum = phoneNum;
    this.Address = Address;
    this.stratDate = stratDate;
    this.endDate = endDate;
    this.compName = compName;
    this.compAddress = compAddress;
    this.compPhone = compPhone;
    this.compFax = compFax;
    this.compSupervisor = compSupervisor;
    this.svPhone = svPhone;
    this.svEmail = svEmail;
    this.BLI02 = BLI02;
    this.offerLetter = offerLetter;
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
     * @return the Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     * @param Address the Address to set
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * @return the stratDate
     */
    public Date getStratDate() {
        return stratDate;
    }

    /**
     * @param stratDate the stratDate to set
     */
    public void setStratDate(Date stratDate) {
        this.stratDate = stratDate;
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
     * @return the compFax
     */
    public String getCompFax() {
        return compFax;
    }

    /**
     * @param compFax the compFax to set
     */
    public void setCompFax(String compFax) {
        this.compFax = compFax;
    }

    /**
     * @return the compSupervisor
     */
    public String getCompSupervisor() {
        return compSupervisor;
    }

    /**
     * @param compSupervisor the compSupervisor to set
     */
    public void setCompSupervisor(String compSupervisor) {
        this.compSupervisor = compSupervisor;
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
     * @return the svEmail
     */
    public String getSvEmail() {
        return svEmail;
    }

    /**
     * @param svEmail the svEmail to set
     */
    public void setSvEmail(String svEmail) {
        this.svEmail = svEmail;
    }

    /**
     * @return the BLI02
     */
    public String getBLI02() {
        return BLI02;
    }

    /**
     * @param BLI02 the BLI02 to set
     */
    public void setBLI02(String BLI02) {
        this.BLI02 = BLI02;
    }

    /**
     * @return the offerLetter
     */
    public String getOfferLetter() {
        return offerLetter;
    }

    /**
     * @param offerLetter the offerLetter to set
     */
    public void setOfferLetter(String offerLetter) {
        this.offerLetter = offerLetter;
    }
}
