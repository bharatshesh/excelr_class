package com.excelr.spring_3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.excelr.spring_3.dao.EmployeeDao;
import com.excelr.spring_3.exception.EmployeeNotFoundException;
import com.excelr.spring_3.model.Employee;
import com.excelr.spring_3.repository.EmployeeRepository;

@CrossOrigin(origins ="*", methods = {RequestMethod.POST , RequestMethod.PUT , RequestMethod.DELETE , RequestMethod.GET })
@RestController 
@RequestMapping("/employee")
public class EmployeeCrudController {
	@Autowired
	EmployeeDao dao;
	
	
//  http://loclhost:8080/employee/save	
	@PostMapping("/save")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
		return  new ResponseEntity<Employee>(dao.saveEmployee(employee),HttpStatus.CREATED);
	}
	
//  http://localhost:8080/employee/login	
	@PostMapping("/login")
   public ResponseEntity<Employee> loginEmployee(@RequestBody Employee employee) {
	  Employee db =dao.fetchByEmail(employee.getEmail());
	  if(db!=null) {
		  if(db.getPwd().equals(employee.getPwd())){
			  return new ResponseEntity<Employee>(db,HttpStatus.FOUND);
		  }else { 
			  throw  new EmployeeNotFoundException( "pwd is mishmatch");
		  }
			 
	  }
	  else {
		  throw  new EmployeeNotFoundException( "email is not found");
	 }
		 
   }
	
// http://localhost:8080/employee/update	
   @PutMapping("/update")
   public Employee updateEmployee(@RequestBody Employee employee) {
	   return dao.updateEmployee(employee); 
   }
   
 // http://localhost:8080/employee/detete/101  
   @DeleteMapping("/detete/{id}")
   public Employee deteteEmployee( @PathVariable int id) {
	   return dao.deteteEmployee(id);
	     
   }
   
 // http://localhost:8080/employee/fetcById?id=101
   @GetMapping("/fetchById")
   public ResponseEntity<Employee> fetchEmployeeById(@RequestParam int id) {
	   Employee em = dao.fetchId(id);
	   if(em != null)
		   return new ResponseEntity<Employee>(em,HttpStatus.FOUND);
	   else
		   return null;
	   
	   
   } 
   
// http://localhost:8080/employee/fetchByEmail/tejas@123
   @GetMapping("/fetchByEmail/{email}")
   public ResponseEntity<Employee> fetchEmployeeByEmail( @PathVariable String email) {
	   Employee em = dao.fetchByEmail(email);
	   if(em != null)
		   return new ResponseEntity<Employee>(em,HttpStatus.FOUND);
	   else
	   return null;
	   
   }
// http://localhost:8080/employee/fetchAll    
   @GetMapping("/fetchAll")
   public ResponseEntity<List<Employee>> fetchAllEmployee(){
	   List<Employee> res = dao.fetchAllEmployee();
	   if(!res.isEmpty())
		   return new ResponseEntity<List<Employee>>(res,HttpStatus.FOUND);
	   else
	   return null;
   }
   
}
