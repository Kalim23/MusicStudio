
package studio;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;


public class jdbc {
	

	
	public static void main(String[] args) throws SQLException {
		Connection Conn = null;
		Statement Stmt = null;
		ResultSet Rs = null;
	
		
		try {
			Conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studio", "root","");
			
			Stmt = Conn.createStatement();
			
			Rs = Stmt.executeQuery("select * from dane");
			
			
		
			//while (Rs.next()) 
		//	{
				//System.out.println(Rs.getString("username") +  ", " + Rs.getString("passwd"));
				
				
			//}
		
		}
		catch (SQLException ex) {
			System.out.println("Blad polaczenia z baza");
		}
	
		
		}

	public static Connection getConnection() {
		// TODO Auto-generated method stub
		return null;
	}

	
	}

	
	


  