// Import required java libraries
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class HelloWorld extends HttpServlet { 
   private String message;
   public void init() throws ServletException {
      message = "This is my Servlet! Yahoo";
   }
   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {  
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      out.println("<html><body><div style='border-bottom:1px solid red;'>This is my Servlet</div>");
      out.println("<div id='body' style='padding:30px; background-color:yellow;color:blue;'> ");
      out.println("<h1>" + message + "</h1>");
      out.println("<h3 style='color:red;'>Tomcat is not a cat</h3>");
      out.println("<table><tr><td>Name</td><td>Age</td><td>Address</td></tr>");
      out.println("<tr><td>Ramesh</td><td>33</td><td>Naxal</td></tr></table>");
      out.println("</div>");
   }
   public void destroy() {
   }
}