package com.CustomException;
//RULES FOR WORKING ON CUSTOM EXCEPTION/USER-DEFINED EXCEPTION
/*1)CREATE THE CLASS WITH THE EXCEPTION NAME
 *2)TO CREATE CHECKED EXCEPTION,CLASS SHOULD EXTENDS EXCEPTION CLASS
 *3)TO CREATE UNCHEKED EXCEPTION,CLASS SHOULD EXTENDS RUNTIME EXCEPTION CLASS
 *4)OPTIONALLY,INITIALIZE THE MESSAGE AND OVERRIDE THE GETMESSAGE()METHOD
 *5)INVOKED THE EXCEPTION OBJECT USING THROW KEYWORD AND HANDLED IT BY USING SUITABLE TRY AND CATCH BLOCK
 * 
 * THROW-->THROW IS KEYWORD WHICH IS USED TO INVOKED AN OBJECT OF EXCEPTION TYPE
 * SYTAX-->throw objectOfExceptionType
 * OR    throw new ClassName 
 */
public class AgeInvalidException extends RuntimeException {
	private String message;
	public AgeInvalidException(String message) {
		this.message=message;
	}
	@Override
	public String getMessage()
	{
		return message;
	}

}
