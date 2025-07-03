package com.excelr.spring_3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.excelr.spring_3.controller.EmployeeController;
import com.excelr.spring_3.dao.EmployeeDao;
import com.excelr.spring_3.model.Employee;
import com.excelr.spring_3.service.EmployeeService;

@SpringBootApplication
public class Spring3Application {

	public static void main(String[] args) {
//    creating an advanced/ J2EE container		
	ApplicationContext ac=	SpringApplication.run(Spring3Application.class, args);
	Employee e=ac.getBean(Employee.class); //@CComponent
	System.out.println(e);
	EmployeeDao dao=ac.getBean(EmployeeDao.class); //Repository
	System.out.println(dao);
	EmployeeService service=ac.getBean(EmployeeService.class);//@Service
	System.out.println(service);
	EmployeeController controller=ac.getBean(EmployeeController.class);//@Comtroller
	System.out.println(controller);
	
	}

} 
