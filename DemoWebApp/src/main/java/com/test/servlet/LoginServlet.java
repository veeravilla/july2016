package com.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.test.dao.StudentDAO;
import com.test.dao.StudentDTO;
import com.test.dao.UserDAO;

public class LoginServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		UserDAO userDAO = new UserDAO();
		
		//Read Input
		String username = req.getParameter("uname");
		String password = req.getParameter("upassword");
		
		System.out.println(" Uname : " + username);
		System.out.println(" Password " + password);
		
		PrintWriter out = resp.getWriter();
		
		if(userDAO.isValidUser(username, password)){
			//Login Success
			System.out.println(" Login Success !!");
			//out.println(" Login Success !! ");
			//resp.sendRedirect("welcome.html");
			
			//Create Session
			HttpSession session = req.getSession(true);
			session.setAttribute("username", username);
			session.setAttribute("isLoggedIn", "true");
			
			StudentDAO studentDAO = new StudentDAO();
			try{
				RequestDispatcher rd = req.getRequestDispatcher("secure/stulist.jsp");
				List<StudentDTO> stulist = studentDAO.getAllStudents();
				req.setAttribute("studentlist", stulist);
				rd.forward(req, resp);
			}catch(Exception ex){
				ex.printStackTrace();
				
				//Redirect to Error Page.
			}
		}else{
			//Login Failure
			System.out.println("Login Failed ");
			RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
			req.setAttribute("error", "Invalid USername & Password !!. Please Try Again.");
			rd.forward(req, resp);
		}
		
		//B.L
		/*if(username != null && username.equals("jhon") && 
				password != null && password.equals("pass1234")){
			//Login Success
			System.out.println(" Login Success !!");
			out.println(" Login Success !! ");
			resp.sendRedirect("http://google.com");
		}else{
			//Login Failure
			System.out.println("Login Failed ");
			RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
			req.setAttribute("error", "Invalid USername & Password !!. Please Try Again.");
			rd.forward(req, resp);
		}*/
		
	}
	
}
