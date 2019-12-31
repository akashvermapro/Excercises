package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ScrollResultSet 
{
	
	    public static void main(String[] args) throws Exception {
	        Class.forName("oracle.jdbc.driver.OracleDriver");
	        Connection con = DriverManager.getConnection(
	        		"jdbc:oracle:thin:@localhost:1521:orcl", "system","seed1234");
	        Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
	                ResultSet.CONCUR_READ_ONLY);
	        
	        ResultSet rs = st.executeQuery("select * from student1");
	        System.out.println("RECORDS IN THE TABLE...");
	        
	        while (rs.next()) {
	            System.out.println(rs.getInt(1) + " -> " + rs.getString(2));
	        }
	        
	        System.out.println("=================================================");
	        
	        rs.first();
	        System.out.println("FIRST RECORD...");
	        System.out.println(rs.getInt(1) + " -> " + rs.getString(2));
	        
	        System.out.println("=================================================");
	        rs.absolute(3);
	        System.out.println("THIRD RECORD...");
	        System.out.println(rs.getInt(1) + " -> " + rs.getString(2));
	        
	        System.out.println("=================================================");
	       
	        rs.last();
	        System.out.println("LAST RECORD...");
	        System.out.println(rs.getInt(1) + " -> " + rs.getString(2));
	        
	        System.out.println("=================================================");
	        
	        rs.previous();
	        System.out.println("PREVIOUS RECORD...");
	        System.out.println(rs.getInt(1) + " -> " + rs.getString(2));
	        
	        System.out.println("=================================================");
	        
	        rs.relative(1);
	        System.out.println("RELATIVE RECORD -1...");
	        System.out.println(rs.getInt(1) + " -> " + rs.getString(2));
	        con.close();
	    }

	}
