package com.webapps.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class JDBCOperations {

	public static void main(String[] args) {
		Connection conn = null;
		Statement statement = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Persons", "aravind", "sai");
			
			statement = conn.createStatement();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 1:Create 2:Insert 3:Update 4:Read 5:Delete");
			String sql = null;
			int i=0;
			switch(i=sc.nextInt())
			{
			case 1: sql = "create table student(SID int,FNAME varchar(255),LNAME varchar(255),EMAIL varchar(255),ADDRESS varchar(255));";
					break;
			case 2: sql = "insert into student values (1,'Sai','Tallapaneni','sai@gmail.com','Peoria');";
					break;
			case 3: sql = "update student set ADDRESS='Plainsboro' where SID=1;";
					break;
			case 4: sql = "select * from student";
					break;
			case 5: sql = "delete from student;";
					break;
			}
			if(i==4)
			{
				rs = statement.executeQuery(sql);
				while(rs.next())
				{
					System.out.println("SID:"+rs.getInt("SID"));
					System.out.println("FNAME:"+rs.getString("FNAME"));
					System.out.println("LNAME:"+rs.getString("LNAME"));
					System.out.println("EMAIL:"+rs.getString("EMAIL"));
					System.out.println("ADDRESS:"+rs.getString("ADDRESS"));

					
				}
			}
			else{
			statement.execute(sql);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
			try {
				conn.close();
				statement.close();
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		

	}

}
