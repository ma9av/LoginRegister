package com.company.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.company.dao.UserDao;
import com.company.dao.UserDaoImpl;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L; 
	
	private static UserDao userDao = new UserDaoImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    	
    	HttpSession curSession = request.getSession(false);

    	if(curSession != null)
    	{
    		curSession.invalidate();
    	}

    	response.sendRedirect("login.jsp");
    }
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Login Servlet");
		
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		if(userDao.isValidUser(userName,password)){
				
			HttpSession session = request.getSession();
			session.setAttribute("userName",userName);
			response.sendRedirect("welcome.jsp");
				}else {
			response.sendRedirect("login.jsp?error=1");
		}
		
	}

}
