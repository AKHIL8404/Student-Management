package com.base.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.base.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{
  
  boolean existsByEmail(String email);
  boolean existsByPhone(String phone);

}
