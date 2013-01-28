package org.albatrosary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcSample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rset = null;
		
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");

			conn = DriverManager.getConnection("jdbc:derby: D:/MASTER1", "", "");
			stmt = conn.prepareCall("select SEI_NK from HOGETBL where SEI_NM = ?");
			stmt.setString(1, "тоюч");
			rset = stmt.executeQuery();
			while ( rset.next() ) {
			   System.out.println(rset.getString(1));
			} 
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try { if(rset!=null) rset.close();} catch (SQLException e) {} 
			try { if(stmt!=null) stmt.close();} catch (SQLException e) {}
			try { if(conn!=null) conn.close();} catch (SQLException e) {}
		}
	}
}
