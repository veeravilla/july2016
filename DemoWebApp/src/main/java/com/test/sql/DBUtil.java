package com.test.sql;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

public class DBUtil {
	
	private static Properties dbProperties = new Properties();
	
	private static BasicDataSource datasource  = new BasicDataSource();
	
	static{
		try{
			dbProperties.load(DBUtil.class.getResourceAsStream("database.properties"));
			datasource.setUrl(dbProperties.getProperty("db.url"));
			datasource.setUsername(dbProperties.getProperty("db.username"));
			datasource.setPassword(dbProperties.getProperty("db.password"));
			datasource.setDriverClassName(dbProperties.getProperty("db.driverclassName"));
			datasource.setInitialSize(10);
			System.out.println(" DB Properties "+ dbProperties );
		}catch(IOException ex){
			ex.printStackTrace();
			System.out.println("Failed !! loading DB properties");
		}
	}
	
	/*public static Connection getDBConnection() throws Exception{
		//Load Driver Class Name
		//Class.forName("com.mysql.jdbc.Driver");
		Class.forName(dbProperties.getProperty("db.driverclassName"));
		//Connection
		//Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jandb", "root", "root");
		Connection connection = DriverManager.getConnection(dbProperties.getProperty("db.url"),
				dbProperties.getProperty("db.username"), dbProperties.getProperty("db.password"));
		return connection;
	}*/
	
	public static Connection getDBConnection() throws Exception{
		return datasource.getConnection();
	}

}
