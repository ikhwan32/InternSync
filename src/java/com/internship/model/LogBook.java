/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.internship.model;

import java.util.Date;

/**
 *
 * @author myPC
 */
public class LogBook {
    private int logBookID;
    private boolean attendance;
    private String attendFile;
    private String description;
    private String descFile;
    private Date date;
    private int internID;

    public LogBook() {
    }

    public LogBook(int logBookID, boolean attendance, String attendFile, String description, String descFile, Date date, int internID) {
        this.logBookID = logBookID;
        this.attendance = attendance;
        this.attendFile = attendFile;
        this.description = description;
        this.descFile = descFile;
        this.date = date;
        this.internID = internID;
    }

    /**
     * @return the logBookID
     */
    public int getLogBookID() {
        return logBookID;
    }

    /**
     * @param logBookID the logBookID to set
     */
    public void setLogBookID(int logBookID) {
        this.logBookID = logBookID;
    }

    /**
     * @return the attendance
     */
    public boolean isAttendance() {
        return attendance;
    }

    /**
     * @param attendance the attendance to set
     */
    public void setAttendance(boolean attendance) {
        this.attendance = attendance;
    }

    /**
     * @return the attendFile
     */
    public String getAttendFile() {
        return attendFile;
    }

    /**
     * @param attendFile the attendFile to set
     */
    public void setAttendFile(String attendFile) {
        this.attendFile = attendFile;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the descFile
     */
    public String getDescFile() {
        return descFile;
    }

    /**
     * @param descFile the descFile to set
     */
    public void setDescFile(String descFile) {
        this.descFile = descFile;
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
     * @return the internID
     */
    public int getInternID() {
        return internID;
    }

    /**
     * @param internID the internID to set
     */
    public void setInternID(int internID) {
        this.internID = internID;
    }
    
    
}
