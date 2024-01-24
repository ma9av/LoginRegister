package com.company.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.company.util.DBUtil;

public class UserDaoImpl implements UserDao{

	@Override
	public boolean isValidUser(String userName, String password) {
		
		String query = "SELECT * FROM userdata WHERE userName = ? AND password = ? ; ";
		try (Connection connection = DBUtil.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(query)){
			
			preparedStatement.setString(1, userName);
			preparedStatement.setString(2, password);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			
			System.out.println("Query");
			
			return resultSet.next();
		}
		
				
			
		 catch (SQLException e) {
			e.printStackTrace();
			return false ;
			
		}
		
	}

	@Override
	public boolean addUser(Users user) {
		// TODO Auto-generated method stub
		String query = "Insert into userdata (userName, password, email) values (?, ?, ?)";
		
		try (Connection connection = DBUtil.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(query)){
			
			preparedStatement.setString(1, user.getUserName());
			preparedStatement.setString(2, user.getPassword());
			preparedStatement.setString(3, user.getEmail());
			
			int rows = preparedStatement.executeUpdate();
			System.out.println("user added");
			return rows>0 ;
			
	
			
			
		}catch (SQLException e) {
			e.printStackTrace();
			return false ;
		}
	}
	
	

}
