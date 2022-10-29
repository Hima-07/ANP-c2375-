package pack;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class EmpOpt {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void createTable() {
		
		try {
			Connection con = getConnection();
			PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS Employee"
					+ "(id int,name varchar(25),phone numeric(10),address varchar(255),email varchar(20),dept varchar(5))");
			create.executeUpdate();
		}catch(Exception e) {
			System.out.println(e);
		}
		finally{
			System.out.println("Table Created");
		}
	}
	
	public static void insertInto() {
		
		try {
			Connection con = getConnection();
			System.out.println("Insert the valuse to the table"+
			"\nonly allowed Syntax : (id,'Name',phoneNo,'Address','Email','Department')");
			String inst = sc.nextLine();
			//PreparedStatement insert = con.prepareStatement("INSERT INTO Employee values (1,'Hima',12345,'chandrapur','hima@134','CSE')");
			
			PreparedStatement insert = con.prepareStatement("INSERT INTO Employee values "+inst);

			insert.execute();
			System.out.println("Inserted Successfully");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//connection object creation
			Connection cont = DriverManager.getConnection(
					"jdbc:mysql://localhost/world","root","Hima_0706");
			System.out.println("Connection Established");
			return cont;
		}catch(Exception e) {
			e.printStackTrace();
		}	
		return null;
	}
	

}
