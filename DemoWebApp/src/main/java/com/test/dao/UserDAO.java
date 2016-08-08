package com.test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.test.sql.DBUtil;

public class UserDAO {
	
	public boolean isValidUser(String username,String password){
		Connection connection = null;
		try{
			connection = DBUtil.getDBConnection();
			PreparedStatement pstmt = connection.prepareStatement("Select * from Users where username =? and password = ?");
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()){
				return true;
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			try{
				connection.close();
			}catch(SQLException ex){
				ex.printStackTrace();
			}
		}
		return false; //Not Found
	}

}
