package com.excelr.spring_3.controller;
// used to handle a request 

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.excelr.spring_3.model.Employee;

//@Component
//@Controller // --req and res
@RestController // for rest apis
public class EmployeeController {

// http://localhost:8080/m1    
   @RequestMapping("/m1")
	public void m1() {
	  System.out.print("m1 req  is hitted");
	}
// http://localhost:8080/m2   
   @RequestMapping("/m2")
   public String m2() {
	   return "hello welcome to string sessions";
   } 
//  http://localhost:8080/m3
   @RequestMapping("/m3")
   public void m3(String msg) {
	   System.out.println(msg);
   }
//  http://localhost:8080/m4   
   @RequestMapping("/m4")
   public void m4(@RequestBody Employee employee) {
	   System.out.println(employee);
   }
}
        