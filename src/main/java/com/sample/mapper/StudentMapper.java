package com.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.sample.bean.Student;

@Mapper
public interface StudentMapper {
	
	List<String> getStudentNames();

    List<Student> getStudents();

    int getStudentNum();
    
    int insertStudentBatch(@Param("students")List<Student> students);

}
