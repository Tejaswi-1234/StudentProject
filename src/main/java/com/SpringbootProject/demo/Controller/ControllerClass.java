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

@RestController //@Controller+@RequestBody
public class ControllerClass {
	@Autowired  //Automatic dependency injection
	private ServiceClass serviceClass;
	public ControllerClass(ServiceClass serviceClass) {
		this.serviceClass=serviceClass;
	}
	@GetMapping("/stu") //handles get request(same like read operation in database)
	public List<Map<String,Object>> getAllDetails(){
		return serviceClass.getAllDetails();
	}
	@PostMapping("/stu1") //used to insert the data into server
	public String insertStu(@RequestBody Map<String,Object> student) {
		return serviceClass.insertStu(student);
	}
	@PutMapping("/stu2/{id}") //used to update or insert data
	public String updateStuById(@PathVariable("id") int id,@RequestBody Map<String,Object> student1) {
		return serviceClass.updateStuById(id,student1);
	}
	@DeleteMapping("/stu3/{id}") //used to delete the data
	public String deleteStuById(@PathVariable("id") int id) {
		return serviceClass.deleteStuById(id);
	}
	

}
