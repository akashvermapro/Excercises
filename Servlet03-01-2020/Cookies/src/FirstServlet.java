import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/servlet1")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try{

			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
				
			String n=request.getParameter("userName");
			out.print("Welcome "+n);

			Cookie ck=new Cookie("uname",n);//creating cookie object
			response.addCookie(ck);//adding cookie in the response

			//creating submit button
			out.print("<form action='servlet2' method='post'>");
			out.print("<input type='submit' value='go'>");
			out.print("</form>");
				
			out.close();

		    }
		catch(Exception e)
		{
			System.out.println(e);
			}
	}
}
