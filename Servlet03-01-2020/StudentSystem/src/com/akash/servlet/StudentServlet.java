package com.akash.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Student")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;
	PreparedStatement pre;
	
    public StudentServlet() {
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

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
			PrintWriter out=response.getWriter();
			pre=con.prepareStatement("insert into student values(?,?,?,?,?)");
			
			int sid=Integer.parseInt(request.getParameter("sid"));
			String name=request.getParameter("name");
			String mobile=request.getParameter("mobile");
			String address=request.getParameter("address");
			String stream=request.getParameter("stream");
			
			pre.setInt(1, sid);
			pre.setString(2,name);
			pre.setString(3,mobile);
			pre.setString(4,address);
			pre.setString(5,stream);
			
			int ra=pre.executeUpdate();
			if(ra>0)
				out.println("<font color=green>Student Details Inserted Succcessfully.</font>");
			else
				out.println("<font color=red>Student Details are not inserted.</font>");
			out.println("To Go Back To The Form <a href='input.html'>Click Here</a>");	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
