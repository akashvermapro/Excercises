package lab5.prog5;
import java.util.Scanner;

public class Person {
	private int age;
	
	public Person(int age) {
		this.age = age;
	}
	
	public void validate()
	{
		try
		{
			if(age<15)
				throw new AgeLessThan15Exception();
			else
				System.out.println("Program Terminated");
		} 
		catch (AgeLessThan15Exception e)
		{
			System.out.println(e);
		}
	
	
	}
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age of the person:");
		int age = sc.nextInt();
		Person p1 = new Person(age);
		p1.validate();	
	}
}

