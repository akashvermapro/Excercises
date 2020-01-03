import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet2")
public class SecondServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)
	{
		try{

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		Cookie ck[]=request.getCookies();
		for(int i=0;i<ck.length;i++)
		{
			String cname=ck[i].getName();
			out.println(cname+"<br>");
			if(cname.equals("uname"))
				out.println("<br><br><br>User Name is "+ck[i].getValue());
			
		}
		out.print("Hello "+ck[0].getValue());
	
		out.close();
	
	         }catch(Exception e){System.out.println(e);}
	}
	

}
