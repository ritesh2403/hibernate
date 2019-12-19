package jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/student_tracker?useSSl=false";
		String user = "sqluser";
		String password = "sqluserpw";
		try {
			System.out.println("connecting to mysql"+url);
			Connection mycon=DriverManager.getConnection(url,user,password);
			System.out.println("connection successful");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
