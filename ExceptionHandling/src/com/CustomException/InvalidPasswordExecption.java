package com.CustomException;
//if a class extends Exception-->CheckedException
//if a class extends RuntimeException-->UncheckedException

public class InvalidPasswordExecption extends RuntimeException {
	private String message;
	
	InvalidPasswordExecption(String message){
		this.message=message;
	}
	@Override
	public String getMessage() {
		return message;
	}
	

}

