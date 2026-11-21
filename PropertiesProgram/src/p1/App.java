package p1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class App {

	public static void main(String[] args) throws IOException {

		// How To get File

		FileInputStream fileInputStream = new FileInputStream("db.properties");

		Properties props = new Properties();

		props.load(fileInputStream);

		String url = props.getProperty("db.url");
		String driver = props.getProperty("db.driver_class");
		String username = props.getProperty("db.username");
		String password = props.getProperty("db.password");

		System.out.println(url);
		System.out.println(driver);
		System.out.println(username);
		System.out.println(password);

	}

}
