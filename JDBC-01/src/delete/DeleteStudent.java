package delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteStudent {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Java App
		int id = 10;

		// Java <---> mysql
		// Step 1 : Driver Class Load
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Step 2 Get DB Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jap92", "root", "root");

		String query = "DELETE FROM STUDENT WHERE id=?";

		// Create PreparedStatement Object By Calling method from Connection
		PreparedStatement ps = con.prepareStatement(query);

		ps.setInt(1, id);

		// Excute Query

		int rowCount = ps.executeUpdate();

		if (rowCount > 0)
			System.out.println("Data DELETE SUCESS...");

	}

}
