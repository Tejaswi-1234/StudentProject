package com.SpringbootProject.demo.Dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DaoClass {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public DaoClass(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}
	public List<Map<String,Object>> getAllDetails(){
		return jdbcTemplate.queryForList("select * from StuDetails");
	}
	public void insertStu(Map<String,Object> student) {
		jdbcTemplate.update("insert into stuDetails values(?,?,?,?)",student.get("id"),student.get("name"),student.get("branch"),student.get("PhnNo"));
	}
	public void updateStuById(int id,Map<String,Object> student1) {
		jdbcTemplate.update("update stuDetails set name=? where id=?",student1.get("name"),id);
	}
	public void deleteStuById(int id) {
		jdbcTemplate.update("delete from stuDetails where id=?",id);
	}
	
	

}
