	package reviews;

	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.util.ArrayList;

	public class listmb {
		private String idx;
		private String user;
		private String pro;

		public void setidx(String idx) {
			this.idx = idx;
		}
		public void setuser(String user) {
			this.user = user;
		}
		public void setpro(String pro) {
			this.pro = pro;
		}
		
		public String getidx() {
			return this.idx;
		}
		public String getuser() {
			return this.user;
		}
		public String getpro() {
			return this.pro;
		}
		
		public ArrayList<listmb> all_lists(){
			ArrayList<listmb> list2 = new ArrayList<listmb>();
			
			try {
			dbconfig db = new dbconfig();
			Connection ct = db.dbcon2();
			String sql = "select idx,user,pro from pd_review";
			PreparedStatement ps = ct.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				listmb dl = new listmb();
				dl.setidx(rs.getString("idx"));
				dl.setuser(rs.getString("user"));
				dl.setpro(rs.getString("pro"));
				list2.add(dl);
			}
			}
			catch(Exception e) {
				
			}
			
			return list2;
		}
		
	}
