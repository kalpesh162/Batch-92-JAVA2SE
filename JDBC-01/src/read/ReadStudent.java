package read;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReadStudent {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jap92", "root", "root");

		String SQL = "SELECT ID,NAME,MARKS FROM STUDENT";
		PreparedStatement ps = con.prepareStatement(SQL);

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {

			System.out.print(rs.getInt(1) + "  ");
			System.out.print(rs.getString(2) + "  ");
			System.out.print(rs.getDouble(3) + "  ");
			System.out.println();

		}

		System.out.println("----------------------");

		ResultSet rs1 = ps.executeQuery();

		while (rs1.next()) {

			System.out.print(rs1.getInt("id") + "  ");
			System.out.print(rs1.getString("name") + "  ");
			System.out.print(rs1.getDouble("marks") + "  ");
			System.out.println();

		}

		System.out.println("==============================");

	}

}
