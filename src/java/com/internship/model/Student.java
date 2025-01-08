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
public class Student extends User{

    private String studentName;
    private String studentIC;
    private String studentMatric;
    private String studentAddress;
    private String studentProgramme;
    private String academicAdvisor;
    private String studentSemester;
    private float studentCGPA;
    private String studentEmail;
    private String letterAddress;
    private String guardianName;
    private String guardianRelation;
    private String guardianPhone;
    private String guardianAddress;
    private String endDate;
    private String studentPhone;
    
    public Student() {
    }

    //default constructor including all attributes
    public Student(int userID, String username, String password, String email, String phoneNumber, String userType, 
            String studentName, String studentIC, String studentMatric, String studentAddress, String studentProgramme,
            String academicAdvisor, String studentSemester, float studentCGPA, String studentEmail, String letterAddress,
            String guardianName, String guardianRelation, String guardianPhone, String guardianAddress, String endDate, String studentPhone) {
        super(userID, username, password, email, phoneNumber, userType);
        this.studentName = studentName;
        this.studentIC = studentIC;
        this.studentMatric = studentMatric;
        this.studentAddress = studentAddress;
        this.studentProgramme = studentProgramme;
        this.academicAdvisor = academicAdvisor;
        this.studentSemester = studentSemester;
        this.studentCGPA = studentCGPA;
        this.studentEmail = studentEmail;
        this.letterAddress = letterAddress;
        this.guardianName = guardianName;
        this.guardianRelation = guardianRelation;
        this.guardianPhone = guardianPhone;
        this.guardianAddress = guardianAddress;
        this.endDate = endDate;
        this.studentPhone = studentPhone;
    }

    public Student(int userID, String username, String password, String email, String phoneNumber, String userType, String fullName, String ic, String matric, String address, String course, String advisor, String semester, Float cgpa, String studentEmail, String letterAddress, String guardianName, String guardianRelation, String guardianPhone, String guardianAddress) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getEndDate() {
        return endDate;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

    
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentIC() {
        return studentIC;
    }

    public void setStudentIC(String studentIC) {        
        this.studentIC = studentIC;
    }

    public String getStudentMatric() {
        return studentMatric;
    }

    public void setStudentMatric(String studentMatric) {
        this.studentMatric = studentMatric;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getStudentProgramme() {
        return studentProgramme;
    }

    public void setStudentProgramme(String studentProgramme) {      
        this.studentProgramme = studentProgramme;
    }

    public String getAcademicAdvisor() {
        return academicAdvisor;
    }

    public void setAcademicAdvisor(String academicAdvisor) {
        this.academicAdvisor = academicAdvisor;
    }

    public String getStudentSemester() {
        return studentSemester;
    }

    public void setStudentSemester(String studentSemester) {
        this.studentSemester = studentSemester;
    }

    public float getStudentCGPA() {
        return studentCGPA;
    }

    public void setStudentCGPA(float studentCGPA) {
        this.studentCGPA = studentCGPA;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getLetterAddress() {
        return letterAddress;
    }

    public void setLetterAddress(String letterAddress) {
        this.letterAddress = letterAddress;
    }

    public String getGuardianName() {
        return guardianName;
    }

    public void setGuardianName(String guardianName) {
        this.guardianName = guardianName;
    }

    public String getGuardianRelation() {
        return guardianRelation;
    }

    public void setGuardianRelation(String guardianRelation) {
        this.guardianRelation = guardianRelation;
    }

    public String getGuardianPhone() {
        return guardianPhone;
    }

    public void setGuardianPhone(String guardianPhone) {
        this.guardianPhone = guardianPhone;
    }

    public String getGuardianAddress() {
        return guardianAddress;
    }

    public void setGuardianAddress(String guardianAddress) {
        this.guardianAddress = guardianAddress;
    }



    public String toString() {
        return "Student{" + "studentName=" + studentName + ", studentIC=" + studentIC + ", studentMatric=" + studentMatric + ", studentProgramme=" + studentProgramme + ", studentSemester=" + studentSemester + ", studentCGPA=" + studentCGPA + ", studentEmail=" + studentEmail + ", letterAddress=" + letterAddress + ", guardianName=" + guardianName + ", academicAdvisor=" + academicAdvisor + '}';
    }
}
