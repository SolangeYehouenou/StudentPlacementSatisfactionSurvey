package com.studentPlacement.Login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginCookies2
 */
@WebServlet("/LoginCookies2")
public class LoginCookies2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginCookies2() {
        super();
        // TODO Auto-generated constructor stub
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name, email;
		name = request.getParameter("txtName");
		email = request.getParameter("txtEmail");
		Cookie Cname = new Cookie ("Cname", name);
		Cookie Cemail = new Cookie ("Cemail", email);
		response.addCookie(Cname);
		response.addCookie(Cemail);
		response.sendRedirect("http://localhost:3030/StudentPlacementSatisfactionSurvey/LoginCookies3");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
