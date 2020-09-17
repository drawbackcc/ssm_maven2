package com.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sample.service.StudentService;

@Controller
public class StudentController {
	
	  @Autowired private StudentService service;

	    @RequestMapping("/student")
	    public String student(String name, Model model){
	        System.out.println("into student controller " + name);
	        model.addAttribute("name", name);
	        model.addAllAttributes(service.studentService());
	        return "success";
	    }

	    @RequestMapping("/student2")
	    public String student2(String name, Model model){
	        System.out.println("into student2 controller " + name);
	        model.addAttribute("name", name);
	        model.addAllAttributes(service.studentService2());
	        return "success";
	    }

}
