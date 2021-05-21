package demo.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	public Statement smt;
	public LoginController() throws SQLException, ClassNotFoundException {
	
		  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/boating","root","");  
			//here sonoo is database name, root is username and password  
			 smt=con.createStatement();   
			//System.out.println("hellohellogeueueueu");
			//ResultSet rs=stmt.executeQuery("select * from boats");  
			//return stmt;
	}
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public boolean checkUser(@RequestBody LoginModel u) throws SQLException {
		//System.out.print(top+"  "+down);
		//@RequestParam("username") String email,@RequestParam("password") String pass
		System.out.println(u.email+" "+u.password);
		
		ResultSet rs=smt.executeQuery("select * from user");
		while(rs.next()) { 
			//System.out.println(rs.getString(1) rs.getString(1).equals(pass))
			if(rs.getString(1).equals(u.email) && rs.getString(2).equals(u.password))
				return true;
				//System.out.println(rs+" hi hi hi h");
		}
		return false;
			
	}
}
