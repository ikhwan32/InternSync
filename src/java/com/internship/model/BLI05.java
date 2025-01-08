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
public class BLI05 extends BLI {
    private String email;
    private String name;
    private String matricNo;
    private String programme;
    private float allowance;
    private int LIDuration;
    private String svName;
    private String compName;
    private String compAddress;
    private String compPhone;
    private String lectName;
    private String penyelaras;
    private float totalMark;
    private String comment;
    private String phoneNum;
    
    public BLI05(){}

    public BLI05(int bliID, String status, String email, String name, String matricNo, String programme, 
                 float allowance, int LIDuration, String svName, String compName, String compAddress, 
                 String compPhone, String lectName, String penyelaras, float totalMark, String comment, String phoneNum) {
        super(bliID, status);
        this.email = email;
        this.name = name;
        this.matricNo = matricNo;
        this.programme = programme;
        this.allowance = allowance;
        this.LIDuration = LIDuration;
        this.svName = svName;
        this.compName = compName;
        this.compAddress = compAddress;
        this.compPhone = compPhone;
        this.lectName = lectName;
        this.penyelaras = penyelaras;
        this.totalMark = totalMark;
        this.comment = comment;
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getMatricNo() {
        return matricNo;
    }

    public String getProgramme() {
        return programme;
    }

    public float getAllowance() {
        return allowance;
    }

    public int getLIDuration() {
        return LIDuration;
    }

    public String getSvName() {
        return svName;
    }

    public String getCompName() {
        return compName;
    }

    public String getCompAddress() {
        return compAddress;
    }

    public String getCompPhone() {
        return compPhone;
    }

    public String getLectName() {
        return lectName;
    }

    public String getPenyelaras() {
        return penyelaras;
    }

    public float getTotalMark() {
        return totalMark;
    }

    public String getComment() {
        return comment;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMatricNo(String matricNo) {
        this.matricNo = matricNo;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }

    public void setAllowance(float allowance) {
        this.allowance = allowance;
    }

    public void setLIDuration(int LIDuration) {
        this.LIDuration = LIDuration;
    }

    public void setSvName(String svName) {
        this.svName = svName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public void setCompAddress(String compAddress) {
        this.compAddress = compAddress;
    }

    public void setCompPhone(String compPhone) {
        this.compPhone = compPhone;
    }

    public void setLectName(String lectName) {
        this.lectName = lectName;
    }

    public void setPenyelaras(String penyelaras) {
        this.penyelaras = penyelaras;
    }

    public void setTotalMark(float totalMark) {
        this.totalMark = totalMark;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    
    
    
    @Override
    public void generateBLI() {

    }
    
    public int calcTotalMark() {
        return 0;
    }
    
    public void submitBLI() {
        
    }
    
    public void generatePDF() {
        
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
    
}