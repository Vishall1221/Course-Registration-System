package com.example.Course.registration.system.Controller;

import com.example.Course.registration.system.Model.Course;
import com.example.Course.registration.system.Model.CourseRegistry;
import com.example.Course.registration.system.Model.Students;
import com.example.Course.registration.system.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
public class CourseController
{
    @Autowired
    StudentService service;

    @GetMapping("/courses")
    public List<Course> GetAllCourses()
    {
        return service.GetAllCourses();
    }

    @GetMapping("/courses/enrolled")
    public List<CourseRegistry> GetAllCoursesRegistered()
    {
        return service.GetAllCoursesRegistered();
    }

    @GetMapping("/students")
    public List<Students> GetAllStudents()
    {
        return service.GetAllStudents();
    }

    @PostMapping("/courses/register")
    public String EnrollCourse(@RequestParam("regNo") String regNo,
                               @RequestParam("courseId") String courseId)
    {
        return service.EnrollCourse(regNo,courseId);
    }

    @PostMapping("/students/register")
    public String AddStudent(@RequestParam("regNo") String regNo,
                               @RequestParam("studentName") String name)
    {
        return service.AddStudent(regNo,name);
    }

    @PostMapping("/courses/add")
    public String AddCourse(@RequestParam("courseId") String cid,
                             @RequestParam("courseName") String cname,
                             @RequestParam("teacher") String teacher,
                             @RequestParam("credits") int credits)
    {
        return service.AddCourse(cid,cname,teacher,credits);
    }






}
