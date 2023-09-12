package com.example.demo.model;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class EmployeeDao {
	
	HibernateTemplate template;

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
	public void saveEmployee(Emp e){  
	    template.save(e);  
	}  
	
	
	
}
