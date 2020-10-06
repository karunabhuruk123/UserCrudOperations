import java.sql.*;

import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.xdevapi.Statement;


public class DB_Connection {
	
	public java.sql.Connection get_connection(){
		Connection con=null;

		String url="jdbc:mysql://"+"localhost"+":"+"3306"+"/crud";
	try {
		con=DriverManager.getConnection(url, "root", "Root@123");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	
	return con;
	
	}
	
	
	

	public static void main(String[] args) throws SQLException {
		
		
		
		 DB_Connection obj_DB_Connection=new DB_Connection();
		  System.out.println(obj_DB_Connection.get_connection());
		

	}

}
