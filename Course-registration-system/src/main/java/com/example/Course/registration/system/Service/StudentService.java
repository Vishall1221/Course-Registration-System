package com.example.Course.registration.system.Service;

import com.example.Course.registration.system.Model.Course;
import com.example.Course.registration.system.Model.CourseRegistry;
import com.example.Course.registration.system.Model.Students;
import com.example.Course.registration.system.Repository.CourseRegistryRepo;
import com.example.Course.registration.system.Repository.CourseRepo;
import com.example.Course.registration.system.Repository.StudentsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    CourseRepo repo1;

    @Autowired
    CourseRegistryRepo repo2;

    @Autowired
    StudentsRepo repo3;

    public List<Course> GetAllCourses() {
        return repo1.findAll();
    }

    public List<CourseRegistry> GetAllCoursesRegistered() {
        return repo2.findAll();
    }

    public List<Students> GetAllStudents() {
        return repo3.findAll();
    }

    public String EnrollCourse(String regNo, String courseID) {

        if(!repo3.existsByregNo(regNo))
        {
            return " Invalid Registration Number";
        }

        if(!repo1.existsBycourseId(courseID))
        {
            return "Invalid Course";
        }

        CourseRegistry obj=new CourseRegistry(regNo,courseID);
        repo2.save(obj);
        return "Course Enrolled Successfully";

    }

    public String AddStudent(String regNo, String name) {

        if(repo3.existsByregNo(regNo))
        {
            return "Students with same reg no Already Exists";
        }

        Students std=new Students(regNo,name);
        repo3.save(std);
        return "Students Added to DataBase successfully !";
    }

    public String AddCourse(String cid, String cname, String teacher, int credits) {
        if(repo1.existsBycourseId(cid)) return "This Course Already Exists Cannot add !";

         Course c=new Course(cid,cname,teacher,credits);
         repo1.save(c);
         return "This Course successfully added to database";
    }
}
