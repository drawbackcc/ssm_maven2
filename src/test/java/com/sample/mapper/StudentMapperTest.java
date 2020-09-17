package com.sample.mapper;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

public class StudentMapperTest {
	
//	@Test
//	public void testReadMapperConfiguration() throws IOException {
//		Reader reader = Resources.getResourceAsReader("application-mybatis.xml");
//		char bytes[] = new char[1024];
//		int readNum;
//		StringBuilder sb = new StringBuilder();
//		while ((readNum = reader.read(bytes)) != -1) {
//			sb.append(bytes, 0, readNum);
//			
//		}
//		System.out.println(sb.toString());
//		reader.close();
//	}
	
	@Test
	public void testGetStudent() throws IOException {
		
		SqlSession session = null;
		try(Reader reader = Resources.getResourceAsReader("application-mybatis.xml")){
			
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			System.out.println("-----------");
			session = sqlSessionFactory.openSession();
			StudentMapper studentMapper = session.getMapper(StudentMapper.class);
			System.out.println(studentMapper);
		    System.out.println(studentMapper.getStudents());
		}finally {
//			session.close();
		}
		
		
		
	}

}
