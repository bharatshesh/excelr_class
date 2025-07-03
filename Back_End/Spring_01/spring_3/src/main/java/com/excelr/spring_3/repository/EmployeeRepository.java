package com.excelr.spring_3.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.excelr.spring_3.model.Employee;

public interface  EmployeeRepository extends JpaRepository<Employee, Integer> {
	
//	@Query("select a from Employee a where email=?1 ")
     Optional<Employee> findByEmail(String email);	// custom method fetch based on email

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