package com.kiran.Entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String fullname;
	private Date date;
	private String gender;
	private String emailaddress;
	private long mobilenumber;
	private long accountnumber;
	private String accountype;
	private String branchname;
	private String username;
	private String password;
	private String confirmpassword;
	private String userid;
	private String pin;
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Customer(String fullname, Date date, String gender, String emailaddress, long mobilenumber,
			String accountype, String branchname, String username, String password, String confirmpassword) {
		super();
		this.fullname = fullname;
		this.date = date;
		this.gender = gender;
		this.emailaddress = emailaddress;
		this.mobilenumber = mobilenumber;
		this.accountype = accountype;
		this.branchname = branchname;
		this.username = username;
		this.password = password;
		this.confirmpassword = confirmpassword;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFullname() {
		return fullname;
	}


	public void setFullname(String fullname) {
		this.fullname = fullname;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getEmailaddress() {
		return emailaddress;
	}


	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}


	public long getMobilenumber() {
		return mobilenumber;
	}


	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}


	public long getAccountnumber() {
		return accountnumber;
	}


	public void setAccountnumber(long accountnumber) {
		this.accountnumber = accountnumber;
	}


	public String getAccountype() {
		return accountype;
	}


	public void setAccountype(String accountype) {
		this.accountype = accountype;
	}


	public String getBranchname() {
		return branchname;
	}


	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getConfirmpassword() {
		return confirmpassword;
	}


	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}


	public String getUserid() {
		return userid;
	}


	public void setUserid(String userid) {
		this.userid = userid;
	}


	public String getPin() {
		return pin;
	}


	public void setPin(String pin) {
		this.pin = pin;
	}
	
	
	

}
