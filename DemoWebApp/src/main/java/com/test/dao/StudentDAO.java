package com.test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.test.sql.DBUtil;

public class StudentDAO {
	
	public boolean saveUsingStmt(StudentDTO studentDTO) throws DBException{
		Connection connection = null;
		try{
			connection = DBUtil.getDBConnection();
			Statement stmt = connection.createStatement();
			
			// INSERT INTO STUDENT VALUES (101,'RAMA',3400,'MS');
			String sqlStmt = "INSERT INTO Student VALUES (" +
					studentDTO.getSno()+" , ' "+
					studentDTO.getSname() +" ' ,"+
					studentDTO.getAge()+", ' "+
					studentDTO.getCourse() +" ' );" ;
			System.out.println(sqlStmt);
			int result = stmt.executeUpdate(sqlStmt);
			if( result == 1)
				return true;
		}catch(Exception ex){
			ex.printStackTrace();
			DBException dbException  = new DBException("DBErr", ex.getMessage());
			throw dbException;
		}finally{
			try{
				connection.close();
			}catch(SQLException ex){
				ex.printStackTrace();
				DBException dbException  = new DBException("DBErr", ex.getMessage());
				throw dbException;
			}
		}
		return false;
	}
	
	public boolean save(StudentDTO studentDTO) throws DBException{
		Connection connection = null;
		try{
			connection = DBUtil.getDBConnection();
			PreparedStatement pstmt = connection.prepareStatement("INSERT INTO Student VALUES (?,?,?,?)");
			pstmt.setInt(1, studentDTO.getSno());
			pstmt.setString(2, studentDTO.getSname() );
			pstmt.setInt(3, studentDTO.getAge());
			pstmt.setString(4, studentDTO.getCourse() );
			int result = pstmt.executeUpdate();
			if( result == 1)
				return true;
		}catch(Exception ex){
			ex.printStackTrace();
			DBException dbException  = new DBException("DBErr", ex.getMessage());
			throw dbException;
		}finally{
			try{
				connection.close();
			}catch(SQLException ex){
				ex.printStackTrace();
				DBException dbException  = new DBException("DBErr", ex.getMessage());
				throw dbException;
			}
		}
		return false;
	}
	
	
	public boolean update(StudentDTO studentDTO) throws DBException{
		Connection connection = null;
		try{
			connection = DBUtil.getDBConnection();
			PreparedStatement pstmt = connection.prepareStatement("UPDATE Student SET sname=?,course=?,fee=?  WHERE sno=? ;");
			pstmt.setString(1, studentDTO.getSname() );
			pstmt.setInt(3, studentDTO.getAge());
			pstmt.setString(2, studentDTO.getCourse() );
			pstmt.setInt(4, studentDTO.getSno());
			int result = pstmt.executeUpdate();
			if( result == 1)
				return true;
		}catch(Exception ex){
			ex.printStackTrace();
			DBException dbException  = new DBException("DBErr", ex.getMessage());
			throw dbException;
		}finally{
			try{
				connection.close();
			}catch(SQLException ex){
				ex.printStackTrace();
				DBException dbException  = new DBException("DBErr", ex.getMessage());
				throw dbException;
			}
		}
		return false;
	}
	
	public boolean delete(int sno) throws DBException{
		Connection connection = null;
		try{
			connection = DBUtil.getDBConnection();
			PreparedStatement pstmt = connection.prepareStatement("DELETE FROM Student WHERE sno = ?;");
			pstmt.setInt(1, sno);
			int result = pstmt.executeUpdate();
			if( result == 1)
				return true;
		}catch(Exception ex){
			ex.printStackTrace();
			DBException dbException  = new DBException("DBErr", ex.getMessage());
			throw dbException;
		}finally{
			try{
				connection.close();
			}catch(SQLException ex){
				ex.printStackTrace();
				DBException dbException  = new DBException("DBErr", ex.getMessage());
				throw dbException;
			}
		}
		return false;
	}
	
	public StudentDTO getStudent(int sno) throws DBException{
		Connection connection = null;
		try{
			connection = DBUtil.getDBConnection();
			PreparedStatement pstmt = connection.prepareStatement("Select * from Student where sno = ?");
			pstmt.setInt(1, sno);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()){
				StudentDTO dto  = new StudentDTO();
				dto.setSno(rs.getInt("Sno"));
				dto.setSname(rs.getString("Sname"));
				dto.setCourse(rs.getString("Course"));
				dto.setAge(rs.getInt("Age"));
				return dto;
			}
		}catch(Exception ex){
			ex.printStackTrace();
			DBException dbException  = new DBException("DBErr", ex.getMessage());
			throw dbException;
		}finally{
			try{
				connection.close();
			}catch(SQLException ex){
				ex.printStackTrace();
				DBException dbException  = new DBException("DBErr", ex.getMessage());
				throw dbException;
			}
		}
		return null; //Not Found
	}
	
	public List<StudentDTO> getAllStudents() throws DBException{
		Connection connection = null;
		List<StudentDTO> stuList = new ArrayList<StudentDTO>();
		try{
			connection = DBUtil.getDBConnection();
			PreparedStatement pstmt = connection.prepareStatement("Select * from Student");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				StudentDTO dto  = new StudentDTO();
				dto.setSno(rs.getInt("Sno"));
				dto.setSname(rs.getString("Sname"));
				dto.setCourse(rs.getString("Course"));
				dto.setAge(rs.getInt("Age"));
				stuList.add(dto);
			}
		}catch(Exception ex){
			ex.printStackTrace();
			DBException dbException  = new DBException("DBErr", ex.getMessage());
			throw dbException;
		}finally{
			try{
				connection.close();
			}catch(SQLException ex){
				ex.printStackTrace();
				DBException dbException  = new DBException("DBErr", ex.getMessage());
				throw dbException;
			}
		}
		return stuList; 
	}

}
