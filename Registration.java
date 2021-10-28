

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


@WebServlet("/Register")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String n=request.getParameter("uemail");  
		String p=request.getParameter("uname");  
		String e=request.getParameter("upass");  
		          
		try{  
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-6T0A2ML\\SQLEXPRESS;database=AmitDB;user=Amit;password=amit1234");
		  
		PreparedStatement ps=con.prepareStatement("insert into registration values(?,?,?)");  
		  
		ps.setString(1,n);  
		ps.setString(2,p);  
		ps.setString(3,e);  
		          
		ps.executeUpdate();  
		      
		 
		}catch (Exception e2) 
		{
			System.out.println(e2);
			
		}  
		          
		 

	
	
	}

}
