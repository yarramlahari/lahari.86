package com.niit.ShoppingCart;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userId =request.getParameter("userId");
		String password =request.getParameter("password");
		
		LoginDAO dao = new 	LoginDAO ();
		
		RequestDispatcher dispatcher;
		
		
		if(dao.isValidUser(userId, password)==true)
		{
			dispatcher=request.getRequestDispatcher("Home.html");
					dispatcher.forward(request, response);
		}
		else
		{
			
			PrintWriter writer=response.getWriter();
			writer.println("please enter valid credentials");
			dispatcher=request.getRequestDispatcher("Login.html");
					
					dispatcher.include(request, response);
		}
	}

}
