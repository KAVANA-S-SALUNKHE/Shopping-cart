package com.cognizant.authorization.service.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@NoArgsConstructor
//@AllArgsConstructor
@Getter
@Setter
public class BaseResponse {
	 public BaseResponse()  {
			super();
		}
	 
	public BaseResponse(String uname,String errorMsg, int errorCode, boolean status,String authToken ) {
		super();
		this.uname=uname;
		this.errorMsg = errorMsg;
		this.errorCode = errorCode;
		this.status = status;
		this.authtoken=authToken;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getAuthtoken() {
		return authtoken;
	}

	public void setAuthtoken(String authtoken) {
		this.authtoken = authtoken;
	}

	private String uname;
	private String errorMsg;
	 private int errorCode;
	 private boolean status; 
	 private String authtoken;
	
}
