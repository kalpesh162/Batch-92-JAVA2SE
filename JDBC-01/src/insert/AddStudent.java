package insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AddStudent {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Java App
		int id = 11;
		String name = "Kalpesh";
		double marks = 66.66;

		// Java <---> mysql
		// Step 1 : Driver Class Load
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Step 2 Get DB Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jap92", "root", "root");

		String query = "insert into student values (" + id + ",'" + name + "'," + marks + " )";

		// Create Statemt Object By Calling method from Connection
		Statement stmt = con.createStatement();

		// Excute Query

		int rowCount = stmt.executeUpdate(query); // executeUpadte insert update delete

		if (rowCount > 0)
			System.out.println("Data Added SUCESS...");

	}

}
