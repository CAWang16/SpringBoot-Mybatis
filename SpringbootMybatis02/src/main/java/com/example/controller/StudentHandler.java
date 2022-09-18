package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestController;

import com.example.repository.StudentRepository;
import com.example.entity.*;

@RestController
public class StudentHandler {
	
	@Autowired
	private StudentRepository studentrepository;
	
	@GetMapping("/findAll")
	public List<Student> findAll(){
		return studentrepository.findAll();
	}
	
	@GetMapping("/findAll2")
	public String test(){
		return "test";
	}
	@GetMapping ("findById/{id}")
	public Student findById(@PathVariable("id") Long id) {
		return studentrepository.findById(id);
	}
	
	@PostMapping("/save")
	public void save(@RequestBody Student student) {
		studentrepository.save(student);
		
	}
	
	
	@PutMapping("/update ")
	public void update(@RequestBody Student student) {
		studentrepository.update(student);
	}
	@DeleteMapping("/deleteById/{id}")
	public void deleteById(@PathVariable("id") Long id) {
		studentrepository.deleteById(id);
	}
}
