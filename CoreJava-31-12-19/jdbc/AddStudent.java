package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class AddStudent {

	Connection con;
	PreparedStatement pre;
	Statement stat;
	ResultSet res;
	int rollno;
	String name;
	Scanner sc;
	
	
	public AddStudent()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","seed1234");
			System.out.println("Database Connected....");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void insert()


	{
		try
		{
			sc=new Scanner(System.in);
			System.out.println("Enter Student RollNo.");
			rollno=sc.nextInt();
			System.out.println("Enter Student Name.");
			name=sc.next();
			
			pre=con.prepareStatement("insert into student1 values(?,?)");
			pre.setInt(1, rollno);
			pre.setString(2,name);
			
			int ra=pre.executeUpdate();
			if(ra>0)
				System.out.println("Student Details Committed..");
			else
				System.out.println("Student Details are Not Committed..");
			pre.close();
				
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{
			sc.close();
		}
	}
	public void printStudentDetails()

	{
		try
		{
			stat=con.createStatement();
			res=stat.executeQuery("select * from student1");
			while(res.next())
			{
				System.out.println("Rollno : "+res.getInt("rollno"));
				System.out.println("Name : "+res.getString("name"));
				System.out.println("");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void updateStudentDetails(int rno,String name)


	{
		try
		{
			pre=con.prepareStatement("update student1 set name=? where rollno=?");
			pre.setString(1, name);
			pre.setInt(2,rno);
			int ra=pre.executeUpdate();
			if(ra>0)
				System.out.println("Name updated for rollno "+ rno);
			else
				System.out.println("Name is not updated..");
			pre.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void deleteStudentDetails(int rno)

	{
		try
		{
			pre=con.prepareStatement("delete from student1 where rollno=?");
			pre.setInt(1,rno);
			
			int ra=pre.executeUpdate();
			if(ra>0)
				System.out.println("Record Deleted...");
			else
				System.out.println("Record has not Deleted...");
				
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		AddStudent s=new AddStudent();
		s.insert();
		s.printStudentDetails();
		System.out.println("=======================================================");
		//s.updateStudentDetails(111,"Vijay");
		s.printStudentDetails();
		s.deleteStudentDetails(111);
		s.printStudentDetails();
	}

}
