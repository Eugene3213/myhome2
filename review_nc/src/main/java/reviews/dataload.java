package reviews;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class dataload {
	private String idx;
	private String user;
	private String pro;
	private String num;
	//set Servlet에서 입력시키 위한 부분 (인스턴스)
	public void setidx(String idx) {
		this.idx = idx;
	}
	public void setuser(String user) {
		this.user = user;
	}
	public void setpro(String pro) {
		this.pro = pro;
	}
	public void setnum(String num) {
		this.num = num;
	}
	
	//get JSP로 출력하기 위해서 사용
	public String getidx() {
		return this.idx;
	}
	public String getuser() {
		return this.user;
	}
	public String getpro() {
		return this.pro;
	}
	public String getnum() {
		return this.num;
	}
	
	public ArrayList<dataload> all_lists(){	//배열자료형에 메소드 형태
		ArrayList<dataload> list = new ArrayList<dataload>();//배열자료형 생성
		
		try {
		dbconfig db = new dbconfig();
		Connection ct = db.dbcon2();
		String sql = "select idx,user,pro,num from pd_review";
		PreparedStatement ps = ct.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			dataload dl = new dataload();
			dl.setidx(rs.getString("idx"));
			dl.setuser(rs.getString("user"));
			dl.setpro(rs.getString("pro"));
			dl.setnum(rs.getString("num"));
			list.add(dl);	//최종 DB 값을 받아서 배열로 처리
		}
		}
		catch(Exception e) {
			
		}
		
		return list;	//최종 DB 배열값을 return JSP에게 전달하기 위해서 사용
	}
	
}
