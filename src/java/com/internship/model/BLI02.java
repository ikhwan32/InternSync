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
public class BLI02 extends BLI {
    private String name;
    private String icNo;
    private String matricNo;
    private String relatedTask;
    private String compName;
    private String compAddress;
    private String compPhone;
    private String compFax;
    private String compSupervisor;
    private String compEmail;
    private float allowance;
    private Boolean hostel;

    public BLI02() {
    }

    public BLI02(int bliID, String status, String name, String icNo, String matricNo, String relatedTask, String compName, String compAddress, String compPhone, String compFax, String compSupervisor, String compEmail, float allowance, Boolean hostel) {
        super(bliID, status);
        this.name = name;
        this.icNo = icNo;
        this.matricNo = matricNo;
        this.relatedTask = relatedTask;
        this.compName = compName;
        this.compAddress = compAddress;
        this.compPhone = compPhone;
        this.compFax = compFax;
        this.compSupervisor = compSupervisor;
        this.compEmail = compEmail;
        this.allowance = allowance;
        this.hostel = hostel;
    }

    public int getBliID() {
        return getBliID();
    }

    public String getName() {
        return name;
    }

    public String getIcNo() {
        return icNo;
    }

    public String getMatricNo() {
        return matricNo;
    }

    public String getRelatedTask() {
        return relatedTask;
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

    public String getCompFax() {
        return compFax;
    }

    public String getCompSupervisor() {
        return compSupervisor;
    }

    public String getCompEmail() {
        return compEmail;
    }

    public float getAllowance() {
        return allowance;
    }

    public Boolean getHostel() {
        return hostel;
    }

    public void setBliID(int bliID) {
        this.setBliID(bliID);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIcNo(String icNo) {
        this.icNo = icNo;
    }

    public void setMatricNo(String matricNo) {
        this.matricNo = matricNo;
    }

    public void setRelatedTask(String relatedTask) {
        this.relatedTask = relatedTask;
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

    public void setCompFax(String compFax) {
        this.compFax = compFax;
    }

    public void setCompSupervisor(String compSupervisor) {
        this.compSupervisor = compSupervisor;
    }

    public void setCompEmail(String compEmail) {
        this.compEmail = compEmail;
    }

    public void setAllowance(float allowance) {
        this.allowance = allowance;
    }

    public void setHostel(Boolean hostel) {
        this.hostel = hostel;
    }
    
    public void submitBLI() {
        
    }
    
    public void generatePDF() {
        
    }

    public void setPhoneNum(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    /**
     * @return the phoneNum
     */

