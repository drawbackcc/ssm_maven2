package test;

import java.util.ArrayList;
import java.util.List;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.sample.bean.Student;
import com.sample.mapper.StudentMapper;
@WebAppConfiguration//不加这个只加下面两个他妈会报错？
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class Test {
	
	@Autowired
	private StudentMapper studentMapper;
	
	@org.junit.Test
	public void test() {
		System.out.println("12345");
//		WebApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(sc)
//		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
		System.out.println(studentMapper.getStudentNames());
	}
	
	@org.junit.Test
	public void test2() {
		System.out.println(studentMapper.getStudents());
	}
	
	@org.junit.Test
	public void testbatchinsert() {
		Student student = new Student();
		student.setAge(44);
		student.setName("tommy");
		List<Student> list = new ArrayList<>();
		list.add(student);
		list.add(student);
		list.add(student);
		list.add(student);
		System.out.print(studentMapper.insertStudentBatch(list));
	}

}
