import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;
public class showdata extends HttpServlet{
	public void doGet(HttpServletRequest rq,HttpServletResponse rs) throws ServletException,IOException{
		String id = rq.getParameter("id");
		rs.setContentType("text/html");
		PrintWriter pw = rs.getWriter();
		pw.println("Hello : "+id);
		pw.println("Your are Sharmileeeeeee!");
		pw.println("<b>Bold is bold</b>");
		pw.println("<a href='givedata.html'>Provide another id</a>");
		try{
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost/","root",)
		}catch(SQLException ser){

		}
	}
}
