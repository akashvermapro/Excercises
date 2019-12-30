package lab5.prog4;
import java.util.Scanner;

public class Employee {
	private String firstName;
	private String lastName;
	
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void validate()
	{
		try
		{
			if(firstName.isEmpty()||lastName.isEmpty())
				throw new NameBlankException();
			else
				System.out.println("Program Terminated");
		} 
		catch (NameBlankException exp)
		{
			System.out.println(exp);
		}
	
	
	}
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name of employee:");
		String fn = sc.nextLine();
		System.out.println("Enter last name of employee");
		String ln = sc.nextLine();
		Employee e1= new Employee(fn,ln);
		e1.validate();	
	}
}
