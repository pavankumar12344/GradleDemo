package com.infy;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;


public class ConfigarationFile {

	public static void main(String[] args) {

	@SuppressWarnings("resource")
	
	ApplicationContext ac=new ClassPathXmlApplicationContext("NewFile.xml");
	JdbcTemplate temp =ac.getBean("jdbcTemplate",JdbcTemplate.class);
	
	String query="insert into book(id,title,authorName) values(?,?,?)";
	int result=temp.update(query,1,"k1","kartik");
	
	System.out.println("records"+result);
}
}
