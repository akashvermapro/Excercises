package com.exception;

public class BankApplication {
	private String name;
	private int age;
	
	public BankApplication(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void verifyApplication() throws BankAgeException{
		if(age<18)
			throw new BankAgeException(name+"'s age has to be 18 or above");
		else
			System.out.println("Application registered successfully");
	}
	
	public static void main(String[] args) {
		BankApplication b1 = new BankApplication("Akash",21);
		BankApplication b2 = new BankApplication("Vineet",17);
		try{
			b1.verifyApplication();
			b2.verifyApplication();
		}
		catch(BankAgeException e){
			System.out.println(e);
		}
	}

}
