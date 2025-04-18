package com.base.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.base.sms.entity.Student;
import com.base.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagement1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagement1Application.class, args);
	}
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
//		Student s1 = new Student(1001,"Kroos","kroos17@gmail.com","9868537838");
//		studentRepository.save(s1);
//		Student s2 = new Student(1002,"Ramos","ramos1317@gmail.com","8561245614");
//		studentRepository.save(s2);
//		Student s3 = new Student(1003,"Arnold","arnold917@gmail.com","9861254687");
//		studentRepository.save(s3);
//		Student s4 = new Student(1004,"Kane","kane89@gmail.com","9875128986");
//		studentRepository.save(s4);
	}
	

}
