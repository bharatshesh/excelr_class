package com.excelr.spring_3.model;
import org.springframework.beans.factory.annotation.Value;
//blue prints and model class
import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // used to create table 
@Component
public class Employee {
	@Id // for primary key -- won't accepts null and duplicates
	@GeneratedValue(strategy = GenerationType.IDENTITY) // autogenerarting of id's
	
//	@Value("Tejas")
	
	private int id;
	private String name;
	@Column(unique = true) 
	private String email;
	@Column(unique = true )// it will make a column as unique
	private long phone;
	private String pwd;
	
	 public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}
	 
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public long getPhone() {
		return phone;
	}


	public void setPhone(long phone) {
		this.phone = phone;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", email=" + email + ", phone=" + phone + ", pwd=" + pwd + "]";
	}
	
	
	
}
