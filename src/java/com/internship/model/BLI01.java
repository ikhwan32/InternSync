/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.internship.model;

/**
 *
 * @author hp
 */
public class BLI01 extends BLI {
    String name;
    String icNo;
    String matricNo;
    String programme;
    String academicSupervisor;
    int semester;
    float cgpa;
    String phoneNum;
    String letterAddress;
    String uitmEmail;
    String guardianName;
    String guardianRelation;
    String guardianPhone;
    String guardianAddress;
    String compNameFirst;
    String compAddressFirst;
    String compNameSecond;
    String compAddressSecond;
    
    public BLI01() {
    }

    public BLI01(int bliID,String status,String name,String icNo,String matricNo,String programme,String academicSupervisor,int semester,float cgpa,String phoneNum,String letterAddress,String uitmEmail,String guardianName,String guardianRelation,String guardianPhone,String guardianAddress,String compNameFirst,String compAddressFirst,String compNameSecond,String compAddressSecond){
        super(bliID,status);
    this.name = name;
    this.icNo = icNo;
    this.matricNo = matricNo;
    this.programme = programme;
    this.academicSupervisor = academicSupervisor;
    this.semester = semester;
    this.cgpa = cgpa;
    this.phoneNum = phoneNum;
    this.letterAddress = letterAddress;
    this.uitmEmail = uitmEmail;
    this.guardianName = guardianName;
    this.guardianRelation = guardianRelation;
    this.guardianPhone = guardianPhone;
    this.guardianAddress = guardianAddress;
    this.compNameFirst = compNameFirst;
    this.compAddressFirst = compAddressFirst;
    this.compNameSecond = compNameSecond;
    this.compAddressSecond = compAddressSecond;
    }

    public BLI01(String name, String icNo, String matricNo, String programme, String academicSupervisor, int semester, float cgpa, String phoneNum, String letterAddress, String uitmEmail, String guardianName, String guardianRelation, String guardianPhone, String guardianAddress, String compNameFirst, String compAddressFirst, String compNameSecond, String compAddressSecond) {

        this.name = name;

        this.icNo = icNo;

        this.matricNo = matricNo;

        this.programme = programme;

        this.academicSupervisor = academicSupervisor;

        this.semester = semester;

        this.cgpa = cgpa;

        this.phoneNum = phoneNum;

        this.letterAddress = letterAddress;

        this.uitmEmail = uitmEmail;

        this.guardianName = guardianName;

        this.guardianRelation = guardianRelation;

        this.guardianPhone = guardianPhone;

        this.guardianAddress = guardianAddress;

        this.compNameFirst = compNameFirst;

        this.compAddressFirst = compAddressFirst;

        this.compNameSecond = compNameSecond;

        this.compAddressSecond = compAddressSecond;

    }

    /**
     * @return the bliID
     */
    public int getBliID() {
        return getBliID();
    }

    /**
     * @param bliID the bliID to set
     */
    public void setBliID(int bliID) {
        this.setBliID(bliID);
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
     * @return the icNo
     */
    public String getIcNo() {
        return icNo;
    }

    /**
     * @param icNo the icNo to set
     */
    public void setIcNo(String icNo) {
        this.icNo = icNo;
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
     * @return the academicSupervisor
     */
    public String getAcademicSupervisor() {
        return academicSupervisor;
    }

    /**
     * @param academicSupervisor the academicSupervisor to set
     */
    public void setAcademicSupervisor(String academicSupervisor) {
        this.academicSupervisor = academicSupervisor;
    }

    /**
     * @return the semester
     */
    public int getSemester() {
        return semester;
    }

    /**
     * @param semester the semester to set
     */
    public void setSemester(int semester) {
        this.semester = semester;
    }

    /**
     * @return the cgpa
     */
    public float getCgpa() {
        return cgpa;
    }

    /**
     * @param cgpa the cgpa to set
     */
    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
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
     * @return the letterAddress
     */
    public String getLetterAddress() {
        return letterAddress;
    }

    /**
     * @param letterAddress the letterAddress to set
     */
    public void setLetterAddress(String letterAddress) {
        this.letterAddress = letterAddress;
    }

    /**
     * @return the uitmEmail
     */
    public String getUitmEmail() {
        return uitmEmail;
    }

    /**
     * @param uitmEmail the uitmEmail to set
     */
    public void setUitmEmail(String uitmEmail) {
        this.uitmEmail = uitmEmail;
    }

    /**
     * @return the guardianName
     */
    public String getGuardianName() {
        return guardianName;
    }

    /**
     * @param guardianName the guardianName to set
     */
    public void setGuardianName(String guardianName) {
        this.guardianName = guardianName;
    }

    /**
     * @return the guardianRelation
     */
    public String getGuardianRelation() {
        return guardianRelation;
    }

    /**
     * @param guardianRelation the guardianRelation to set
     */
    public void setGuardianRelation(String guardianRelation) {
        this.guardianRelation = guardianRelation;
    }

    /**
     * @return the guardianPhone
     */
    public String getGuardianPhone() {
        return guardianPhone;
    }

    /**
     * @param guardianPhone the guardianPhone to set
     */
    public void setGuardianPhone(String guardianPhone) {
        this.guardianPhone = guardianPhone;
    }

    /**
     * @return the guardianAddress
     */
    public String getGuardianAddress() {
        return guardianAddress;
    }

    /**
     * @param guardianAddress the guardianAddress to set
     */
    public void setGuardianAddress(String guardianAddress) {
        this.guardianAddress = guardianAddress;
    }

    /**
     * @return the compNameFirst
     */
    public String getCompNameFirst() {
        return compNameFirst;
    }

    /**
     * @param compNameFirst the compNameFirst to set
     */
    public void setCompNameFirst(String compNameFirst) {
        this.compNameFirst = compNameFirst;
    }

    /**
     * @return the compAddressFirst
     */
    public String getCompAddressFirst() {
        return compAddressFirst;
    }

    /**
     * @param compAddressFirst the compAddressFirst to set
     */
    public void setCompAddressFirst(String compAddressFirst) {
        this.compAddressFirst = compAddressFirst;
    }

    /**
     * @return the compNameSecond
     */
    public String getCompNameSecond() {
        return compNameSecond;
    }

    /**
     * @param compNameSecond the compNameSecond to set
     */
    public void setCompNameSecond(String compNameSecond) {
        this.compNameSecond = compNameSecond;
    }

    /**
     * @return the compAddressSecond
     */
    public String getCompAddressSecond() {
        return compAddressSecond;
    }

    /**
     * @param compAddressSecond the compAddressSecond to set
     */
    public void setCompAddressSecond(String compAddressSecond) {
        this.compAddressSecond = compAddressSecond;
    }
    
}
