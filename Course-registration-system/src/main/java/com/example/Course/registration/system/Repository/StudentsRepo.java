package com.example.Course.registration.system.Repository;

import com.example.Course.registration.system.Model.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentsRepo extends JpaRepository <Students,String> {
    boolean existsByregNo(String regNo);
}
