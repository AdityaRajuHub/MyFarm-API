package com.naa.response;

public class ErrorResponse {
	 private int errorCode;
	    private String message;

	    public ErrorResponse(int code, String message){
	        this.errorCode=code;
	        this.message=message;
	    }

	  
	    public int getErrorCode() {
	        return errorCode;
	    }

	    public void setErrorCode(int errorCode) {
	        this.errorCode = errorCode;
	    }

	    public String getMessage() {
	        return message;
	    }

	    public void setMessage(String message) {
	        this.message = message;
	    }

	    @Override
	    public String toString() {
	        return "APIError [errorCode=" + errorCode + ", message=" + message + "]";
	    }
}
