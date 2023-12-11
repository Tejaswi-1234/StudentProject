package com.SpringbootProject.demo.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringbootProject.demo.Service.ServiceClass;

@RestController
public class ControllerClass {
	@Autowired
	private ServiceClass serviceClass;
	public ControllerClass(ServiceClass serviceClass) {
		this.serviceClass=serviceClass;
	}
	@GetMapping("/stu")
	public List<Map<String,Object>> getAllDetails(){
		return serviceClass.getAllDetails();
	}
	@PostMapping("/stu1")
	public String insertStu(@RequestBody Map<String,Object> student) {
		return serviceClass.insertStu(student);
	}
	@PutMapping("/stu2/{id}")
	public String updateStuById(@PathVariable("id") int id,@RequestBody Map<String,Object> student1) {
		return serviceClass.updateStuById(id,student1);
	}
	@DeleteMapping("/stu3/{id}")
	public String deleteStuById(@PathVariable("id") int id) {
		return serviceClass.deleteStuById(id);
	}
	

}
