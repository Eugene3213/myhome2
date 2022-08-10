package reviews;
import java.sql.PreparedStatement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.sql.*;

public class config {
	protected LocalDateTime now = null;
	protected String msg = null;
	public PreparedStatement ps2 = null;
	
	protected String nowtimer() {	//현재 서버 시간 관련 정보
		this.now = LocalDateTime.now();
		DateTimeFormatter fm = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String timer = this.now.format(fm);
		return timer;
	}
	protected String insert(ArrayList<String> data) {	//insert만 사용되는
		
		String table_name = data.get(0);
		int w = 1;
		String sql = "insert into " + table_name + " values('0',";
		while(w < data.size()) {
			if(w==data.size()-1) { sql += "?)";	}
			else { sql += "?,";	}
			w++;
		}
		try {
		dbconfig db = new dbconfig();
		Connection ct = db.dbcon2();
		this.ps2 = ct.prepareStatement(sql);
		this.ps2.setString(1, data.get(1));
		this.ps2.setString(2, data.get(2));
		this.ps2.setString(3, data.get(3));
		this.ps2.setString(4, data.get(4));
		this.ps2.setString(5, data.get(5));
		this.ps2.setString(6, data.get(6));
		this.ps2.setString(7, data.get(7));
		
		int n = 0;
		n = this.ps2.executeUpdate();
		
		if(n>0) {	this.msg = "ok";	}
		else {  throw new Exception("error"); }
		}
		catch (Exception e){
			this.msg = "no";
		}finally {
			//mysql-close			
		}
		return this.msg;
	}
}
