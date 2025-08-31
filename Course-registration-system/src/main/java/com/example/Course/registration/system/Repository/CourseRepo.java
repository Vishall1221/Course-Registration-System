package com.example.Course.registration.system.Repository;

import com.example.Course.registration.system.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course,String> {
    boolean existsBycourseId(String courseId);
}
