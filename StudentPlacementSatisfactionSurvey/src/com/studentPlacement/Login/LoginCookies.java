package com.studentPlacement.Login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginCookies
 */
@WebServlet("/LoginCookies")
public class LoginCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginCookies() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<form action = 'http://localhost:3030/StudentPlacementSatisfactionSurvey/LoginCookies2'>");
		out.println("Name: <input type = 'text' name = 'txtName'><br><br>");
		out.println("Email: <input type = 'text' name = 'txtEmail'><br><br>");
		out.println("<input type = 'submit' value = 'LOGIN'>");
		out.println("</form>");
		out.println("</html>");
	}
		
		// These three loginCookies files are independent from the other parts of this project 
	//they only serve to showcase the workings of cookies in a software generally.
		
		/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
