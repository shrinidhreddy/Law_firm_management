package demo.signup;
import java.sql.Statement;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
@RestController
class SignupController {
	public Statement smt;
	public SignupController() throws SQLException, ClassNotFoundException {
	
		  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/boating","root","");  
			//here sonoo is database name, root is username and password  
			 smt=con.createStatement();   
			//System.out.println("hellohellogeueueueu");
			//ResultSet rs=stmt.executeQuery("select * from boats");  
			//return stmt;
	}


	@RequestMapping(value="/signup",method=RequestMethod.POST)
	public boolean saveUser(@RequestBody UserModel u) {
		//@RequestParam("email") String emai,@RequestParam("username") String usernam,@RequestParam("mobilenumber") String mbn,@RequestParam("password") String passwor,@RequestParam("confirmpasword") String confirm_pass
		
		try {
			System.out.println("entered");
		//String rs1="insert into user values('"+emai+"','"+passwor+"','"+usernam+"','"+mbn+","+"'false',"+"'user')";
		//String rs2="insert into user values('"+emai+"','"+passwor+"','"+usernam+"','"+mbn+"','false','user')";
	//	System.out.println(rs2);
			if(!u.role.equals("user"))
					return false;
			if(u.active==false) 
				smt.execute("insert into user values('"+u.email+"','"+u.password+"','"+u.username+"','"+u.mobilenumber+"','0','user')");
			else
				smt.execute("insert into user values('"+u.email+"','"+u.password+"','"+u.username+"','"+u.mobilenumber+"','1','user')");	
		return true;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
}
}
