package com.example.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.example.demo.model.Emp;
import com.example.demo.model.EmployeeDao;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		 Resource r=new ClassPathResource("applicationContext.xml");  
		    BeanFactory factory=new XmlBeanFactory(r);  
		      
		    EmployeeDao dao=(EmployeeDao)factory.getBean("d");  
		      
		    Emp e=new Emp();  
		    e.setId(114);  
		    e.setName("varun");  
		    e.setSalary(50000);  
		      
		    dao.saveEmployee(e);  
	}

}
