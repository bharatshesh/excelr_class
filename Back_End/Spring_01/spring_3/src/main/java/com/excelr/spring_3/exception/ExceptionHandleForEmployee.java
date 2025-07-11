package com.excelr.spring_3.exception;

import java.sql.SQLIntegrityConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.excelr.spring_3.dto.ResponseData;

@RestControllerAdvice// to handle exceptions
public class ExceptionHandleForEmployee {
    //will handle db issues
	@ExceptionHandler(SQLIntegrityConstraintViolationException.class)
	public ResponseEntity<ResponseData<String>>sqlExceptionHandler(SQLIntegrityConstraintViolationException e){
		ResponseData<String>s=new ResponseData<String>();
		s.setStatus(HttpStatus.BAD_REQUEST.value());
		s.setMessage("you can't perform this operation");
		s.setData(e.getMessage());
		return new ResponseEntity<ResponseData<String>>(s,HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<ResponseData<String>>notFound(EmployeeNotFoundException e){
		ResponseData<String>s=new ResponseData<String>();
		s.setStatus(HttpStatus.NOT_FOUND.value());
		s.setMessage("you can't perform this operation");
		s.setData(e.getMessage());
		return new ResponseEntity<ResponseData<String>>(s,HttpStatus.NOT_FOUND);
		
	}
} 

	

