import java.sql.*;  
import javax.servlet.http.*;  
import javax.servlet.*;  
import java.io.*;
public class store extends HttpServlet{  
public void doGet(HttpServletRequest rq,HttpServletResponse rs) throws ServletException{
	try{  
		String bname = rq.getParameter("bname");
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/librarymgmt","root","");  
		//here sonoo is database name, root is username and password  
		Statement stmt=con.createStatement(); 
		stmt.execute("insert into books(bid,bname) values(5,'"+bname+"')"); 
		PrintWriter pw = rs.getWriter();
		rs.setContentType("text/html");
		pw.println("inserted");
		con.close();  
	}catch(Exception e){ System.out.println(e);}  
	}  
}  