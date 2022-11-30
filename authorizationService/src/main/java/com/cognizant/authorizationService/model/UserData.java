package com.cognizant.authorizationService.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.cognizant.authorization.service.response.BaseResponse;

import lombok.AllArgsConstructor;
//import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


//@NoArgsConstructor
//@AllArgsConstructor
@Getter
@Setter
@Component
@Entity
@Table(name = "userdata")
public class UserData {

 public UserData() {
		super();
	}

	public UserData(String userid, String upassword, String uname,String message, String authToken) {
		super();
		this.userid = userid;
		this.upassword = upassword;
		this.uname = uname;
		this.message = message;
		this.authToken = authToken;
	
		
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public  String getUpassword() {
		return upassword;
	}

	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getmessage() {
		return message;
	}

	public void setmessage(String message) {
		this.message = message;
	}

	public String getAuthToken() {
		return authToken;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

	
	
    
	@Column(name = "userId",unique=true)
	private String userid;

	@Column(name = "userPassword")
	private String upassword;
	@Id
	@Column(name = "userName")
	private String uname;
	
	
	private String message;
	
	private String authToken;

	

	
	

	
}
