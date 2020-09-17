package com.sample.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sample.mapper.StudentMapper;

@Service
@Transactional//在需要加事务管理的Service中添加@Transactional注解，我们就会在日志中看到如下效果

public class StudentService {
	
	   @Autowired private StudentMapper mapper;

	    public Map<String, Object> studentService(){
	        System.out.println("into student service");
	        Map<String, Object> map = new HashMap<>();
	        map.put("students", mapper.getStudentNames());
	        map.put("num", mapper.getStudentNum());
	        return map;
	    }

	    public Map<String, Object> studentService2(){
	        System.out.println("into student service2");
	        Map<String, Object> map = new HashMap<>();
	        map.put("students", mapper.getStudents());
	        map.put("num", mapper.getStudentNum());
	        return map;
	    }
	    
	    

}
