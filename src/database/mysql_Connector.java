package database;
import java.sql.*;  
public class mysql_Connector{ 
	
	public void mysql_connector() {
	try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con = DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/javaTables","root","gUrUjI.1");  
		//here sonoo is database name, root is username and password  
		Statement stmt=con.createStatement();  
	}
	catch(Exception e){
					System.out.println(e);
					}  
	}
public static void main(String args[]){  
	mysql_Connector ms = new mysql_Connector();
	ms.mysql_connector();
}  
}
