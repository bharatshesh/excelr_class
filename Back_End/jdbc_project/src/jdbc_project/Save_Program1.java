package jdbc_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Save_Program1 {
	
	public static void main(String[] args) {
		try {
//        Load and Register --- required packages	
			DriverManager.registerDriver(new Driver());
//       establish the connection 	
			String url="jdbc:mysql://localhost:3306/db1 ";
			String userName="root";
			String pwd="Shesh@2004";
		    Connection con = DriverManager.getConnection(url , userName, pwd);
//       creating of Statement
		       Statement s= con.createStatement();
//       execution of statement 
		       s.execute
		  ("insert into table_1 values(4,'Alice','a@gmail.com',9475989244,'Banglore')");
//       close 
		       s.close();
		       con.close();
			   System.out.println("done,,,");
		} catch (SQLException e) {
	           System.err.println(e.getMessage());
		}
	}

}
