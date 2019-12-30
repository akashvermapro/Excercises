package lab5.prog5;

public class AgeLessThan15Exception extends Exception{
	public String toString(){
		return "You must be 15 years old to access this application.";
	}
}
