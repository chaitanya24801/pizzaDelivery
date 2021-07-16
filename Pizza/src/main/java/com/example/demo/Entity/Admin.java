package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Admin")

public class Admin {
	@Id
	
	private int adminid;
	private String adminUserName;
	
	public int getAdminid() {
		return adminid;
	}
	public void setAdminid(int adminid) {
		this.adminid = adminid;
	}
	public String getAdminUserName() {
		return adminUserName;
	}
	public void setAdminUserName(String adminUserName) {
		this.adminUserName = adminUserName;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	private String adminPassword;
	
	public Admin(int adminid, String adminUserName, String adminPassword) {
		super();
		this.adminid = adminid;
		this.adminUserName = adminUserName;
		this.adminPassword = adminPassword;
	}
	public Admin() {
		super();
	}
	
	
	
}
