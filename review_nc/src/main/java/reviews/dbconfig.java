package reviews;
import java.sql.*;
public class dbconfig {	//SQL 환경설정
	
	protected Connection dbcon2() throws ClassNotFoundException, SQLException{
		String dbdriver = "com.mysql.jdbc.Driver";
		/*
		String dburl = "jdbc:mysql://localhost:3306/webmail";
		String dbuser = "";
		String dbpass = "";
		*/
		String dburl = "";
		String dbuser = "";
		String dbpass = "";
		Class.forName(dbdriver);	//JDBC 클래스 로드명
		Connection con = DriverManager.getConnection(dburl,dbuser,dbpass);
		return con;
	}

}
