package reviews;
import java.sql.SQLException;
import java.sql.*;


public class filedb {
	dbconfig db = null;
	java.sql.Connection con = null;
	public filedb() {
		try {
		this.db = new dbconfig();
		this.con = this.db.dbcon2();
		} catch (Exception e) {
			
		}
	}
	public void fileinsert(String fnm) throws ClassNotFoundException,SQLException {
			String sql = "insert into imgs (imdx,imurl) values ('0','"+fnm+"')";
			PreparedStatement ps = this.con.prepareStatement(sql);
			int n = 0;
			n = ps.executeUpdate();
	}
}
