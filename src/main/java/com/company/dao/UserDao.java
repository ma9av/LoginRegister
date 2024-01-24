package com.company.dao;

import org.apache.catalina.User;

public interface UserDao {

	boolean isValidUser(String userName, String password);

	  boolean addUser(Users user);
	
	

}
