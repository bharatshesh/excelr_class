package com.excelr.spring_3.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.excelr.spring_3.model.Employee;

public interface  EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	

}
// i--i --extends
// i--c --implements
// c--c --extends

/*
 **  CrudRepository ---i
 *           |
 *    ListCrudRepository--i
 *            |
 *            |
 *    JpaRepository--i
 *            |
 *            |
 *     EmployeeRepository-i       
 *            
*/