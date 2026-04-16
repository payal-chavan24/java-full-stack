package com.tka;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Student {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch_426", "root", "Payal24May");
		Statement s = c.createStatement();
		int checked = s.executeUpdate("insert into Student(id,name)values(2,'shital'),(3,'Neha')");

		if (checked > 0) {
			System.out.println("Data is inserted");

		} else {
			System.out.println("Data is not  inserted");
		}
		// close all connection
		c.close();
	}
}
