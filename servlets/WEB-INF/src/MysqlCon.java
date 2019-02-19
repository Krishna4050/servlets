import java.sql.*;  
class MysqlCon{  
public static void main(String args[]){  
	try{  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/librarymgmt","root","");  
		//here sonoo is database name, root is username and password  
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select bname from books");  
		while(rs.next())  
		System.out.println(rs.getString(1));  
		con.close();  
	}catch(Exception e){ System.out.println(e);}  
	}  
}  