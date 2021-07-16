package com.example.demo.Entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "User")


public class User {
	@Id
	@GeneratedValue
	private int Userid;
	private String UserName;
	public int getUserid() {
		return Userid;
	}
	public void setUserid(int userid) {
		Userid = userid;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	private String Password;
	public User(int userid, String userName, String password) {
		super();
		Userid = userid;
		UserName = userName;
		Password = password;
	}
	public User() {
		super();
	}
	
	
	
}
