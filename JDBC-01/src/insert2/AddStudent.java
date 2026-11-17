package insert2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class AddStudent {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Java App
		int id = 10;
		String name = "Kareena";
		double marks = 76.76;

		// Java <---> mysql
		// Step 1 : Driver Class Load
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Step 2 Get DB Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jap92", "root", "root");

		//String query = "insert into student values (" + id + ",'" + name + "'," + marks + " )";
		String query="insert into student (id,name,marks) values(?,?,?)";  // ? place holder

		// Create  PreparedStatement Object By Calling method from Connection
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setDouble(3, marks);

		// Excute Query

		int rowCount = ps.executeUpdate();

		if (rowCount > 0)
			System.out.println("Data Added SUCESS...");

	}

}
