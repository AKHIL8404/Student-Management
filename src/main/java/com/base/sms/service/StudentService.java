package com.base.sms.service;

import java.util.List;

import com.base.sms.entity.Student;

public interface StudentService {
    
    List<Student> getAllStudents();
    
    Student saveStudent(Student student);
    
    Student getStudentById(Integer id);
    
    boolean existsById(Integer id);
    
    boolean existsByEmail(String email);
    
    boolean existsByPhone(String phone);
    
    Student updateStudent(Student student);
    
    void deleteStudentById(Integer id);
}
