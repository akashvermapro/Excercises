package com.deloitte.pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		
		String lid=request.getParameter("lid");
		String pwd=request.getParameter("pwd");
		
		if(lid.equals("123") && pwd.equals("abc"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("SecondServlet");
			rd.forward(request,response);
		}
		else
		{
			pw.println("<font color=red>LOGIN / PASSWORD IS INCORRECT...</FONT>");
			RequestDispatcher rd=request.getRequestDispatcher("login.html");
			rd.include(request,response);
		}
	}

}
