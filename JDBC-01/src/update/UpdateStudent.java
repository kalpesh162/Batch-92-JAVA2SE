package update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateStudent {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Java App
		int id = 11;
		String name = "Kareena";
		double marks = 76.76;

		// Java <---> mysql
		// Step 1 : Driver Class Load
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Step 2 Get DB Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jap92", "root", "root");
									//      1         2             3
		String query = "UPDATE STUDENT SET name=? , marks=?  WHERE id=?";

		// Create PreparedStatement Object By Calling method from Connection
		PreparedStatement ps = con.prepareStatement(query);

		ps.setString(1, name);
		ps.setDouble(2, marks);
		ps.setInt(3, id);

		// Excute Query

		int rowCount = ps.executeUpdate();

		if (rowCount > 0)
			System.out.println("Data UPDATE SUCESS...");

	}

}
