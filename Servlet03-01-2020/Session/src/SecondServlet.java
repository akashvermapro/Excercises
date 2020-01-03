import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet("/servlet2")
public class SecondServlet extends HttpServlet {

public void doGet(HttpServletRequest request, HttpServletResponse response){
		try{

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		HttpSession session=request.getSession(false);
		String sid=session.getId();
		String n=(String)session.getAttribute("uname");
		out.print("Hello "+n);
		out.println("<br> Session Id is : "+sid);

		out.close();

      }catch(Exception e){System.out.println(e);}
	}
	

}
