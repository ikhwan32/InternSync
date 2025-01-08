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
public class BLI07 extends BLI {
    private String name;
    private String matricNo;
    private String programme;
    private String ic;
    private String phoneNum;
    private int LiDuration;
    private Date startDate;
    private Date endDate;
    private String svNamePosition;
    private String compNameAddress;
    private float allowance;
    private float totalMark;
    private String feedback;
    private String problem;
    private String comment;

    public BLI07() {
    }
    
    public BLI07(int bliID,String status,String name,String matricNo,String programme,String ic,String phoneNum,int LiDuration,Date startDate,Date endDate,String svNamePosition,String compNameAddress,float allowance,float totalMark,String feedback,String problem,String comment){
        super(bliID,status);
    this.name = name;
    this.matricNo = matricNo;
    this.programme = programme;
    this.ic = ic;
    this.phoneNum = phoneNum;
    this.LiDuration = LiDuration;
    this.startDate = startDate;
    this.endDate = endDate;
    this.svNamePosition = svNamePosition;
    this.compNameAddress = compNameAddress;
    this.allowance = allowance;
    this.totalMark = totalMark;
    this.feedback = feedback;
    this.problem = problem;
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
     * @return the ic
     */
    public String getIc() {
        return ic;
    }

    /**
     * @param ic the ic to set
     */
    public void setIc(String ic) {
        this.ic = ic;
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
     * @return the svNamePosition
     */
    public String getSvNamePosition() {
        return svNamePosition;
    }

    /**
     * @param svNamePosition the svNamePosition to set
     */
    public void setSvNamePosition(String svNamePosition) {
        this.svNamePosition = svNamePosition;
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
     * @return the allowance
     */
    public float getAllowance() {
        return allowance;
    }

    /**
     * @param allowance the allowance to set
     */
    public void setAllowance(float allowance) {
        this.allowance = allowance;
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
     * @return the feedback
     */
    public String getFeedback() {
        return feedback;
    }

    /**
     * @param feedback the feedback to set
     */
    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    /**
     * @return the problem
     */
    public String getProblem() {
        return problem;
    }

    /**
     * @param problem the problem to set
     */
    public void setProblem(String problem) {
        this.problem = problem;
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