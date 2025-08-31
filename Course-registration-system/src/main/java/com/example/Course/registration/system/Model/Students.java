package com.example.Course.registration.system.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Students {

    @Id
    private String regNo;
    private String studentName;

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Students(String regNo, String studentName) {
        this.regNo = regNo;
        this.studentName = studentName;
    }

    public Students()
    {

    }
}
