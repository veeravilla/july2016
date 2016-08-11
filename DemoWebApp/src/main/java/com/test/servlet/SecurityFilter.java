package com.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.test.dao.StudentDAO;
import com.test.dao.StudentDTO;
import com.test.dao.UserDAO;

public class SecurityFilter implements Filter {

	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println(" Security Filter Init ()");
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpReq = (HttpServletRequest) request;
		HttpServletResponse httpRes = (HttpServletResponse) response;
		HttpSession session = httpReq.getSession(false);
		if(session != null && session.getAttribute("isLoggedIn") != null){
			System.out.println(" USer Logged in");
			chain.doFilter(request, response);
		}else{
			System.out.println(" USer Not Logged in");
			//httpRes.sendRedirect("login.jsp");
			RequestDispatcher rd = httpReq.getRequestDispatcher("/login.jsp");
			httpReq.setAttribute("error", "Session is Timedout !!. Please Login again !!");
			rd.forward(httpReq, httpRes);
		}
		
	}

	public void destroy() {
		System.out.println(" Security Filter Destory ()");
		
	}

	
	
}
