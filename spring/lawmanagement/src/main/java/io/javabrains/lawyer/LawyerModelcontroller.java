package demo.lawyer;
import java.sql.Connection;
import java.util.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
class LawyerModelController{
public Statement smt;

public LawyerModelController() throws SQLException, ClassNotFoundException {

	  System.out.println("lawyer model controlloer constructor");
	  Class.forName("com.mysql.jdbc.Driver");
	  Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/boating","root","");  
		//here sonoo is database name, root is username and password  
		 smt=con.createStatement();   
		//System.out.println("hellohellogeueueueu");
		//ResultSet rs=stmt.executeQuery("select * from boats");  
		//return stmt;
}
@RequestMapping("/getalllawyers")
public List<LawyerModel> GetAllLawyer() throws SQLException{
	System.out.print("hi");
	ResultSet rs=smt.executeQuery("select * from lawyers");
	List<LawyerModel> l= new ArrayList<LawyerModel>();
	while(( rs).next()) { 
		LawyerModel law=new LawyerModel(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6));
		l.add(law);
		System.out.println(rs+"   "+rs.getInt(1));
		//l.add((LawyerModel) rs2);
		//System.out.println(rs.getString(1) rs.getString(1).equals(pass))	
			//System.out.println(rs+" hi hi hi h");
	}
	return l;
}

}


