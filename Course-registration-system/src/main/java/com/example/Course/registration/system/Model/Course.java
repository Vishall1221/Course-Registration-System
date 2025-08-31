package com.example.Course.registration.system.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
    @Id
    private String courseId;
    private String courseName;
    private String teacher;

    public Course(){}

    public Course(String courseId, String courseName, String teacher, int credits) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.teacher = teacher;
        this.credits = credits;
    }

    private int credits;

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
