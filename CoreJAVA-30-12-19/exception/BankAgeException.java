package com.exception;

@SuppressWarnings("serial")
public class BankAgeException extends Exception {
	private String msg;
	public BankAgeException(){
		
	}
	public BankAgeException(String msg){
		this.msg=msg;
	}
	public String toString(){
		if(msg==null)
			return "Age must be above 18 to accept any Individual Account request...";
		else
			return msg;
	}

}
