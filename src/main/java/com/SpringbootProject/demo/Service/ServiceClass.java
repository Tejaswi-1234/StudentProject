package com.SpringbootProject.demo.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringbootProject.demo.Dao.DaoClass;

@Service //Acts as mediator between presentation and data access layer
public class ServiceClass {
	@Autowired
	private DaoClass daoClass;
	 public ServiceClass(DaoClass daoClass) {
		 this.daoClass=daoClass;
	 }
	 public List<Map<String,Object>> getAllDetails(){
		 return daoClass.getAllDetails();
	 }
	 public String insertStu(Map<String,Object> student) {
		 daoClass.insertStu(student);
		 return "Successfully inserted the data";
	 }
	 public String updateStuById(int id,Map<String,Object> student1) {
		 daoClass.updateStuById(id,student1);
		 return "Successfully updated the data";
	 }
	 public String deleteStuById(int id) {
		 daoClass.deleteStuById(id);
		 return "Successfully deleted";
	 }

}
