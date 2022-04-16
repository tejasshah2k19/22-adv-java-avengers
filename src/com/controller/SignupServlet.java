package com.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//HttpServlet --> servlet-api.jar 
public class SignupServlet extends HttpServlet {

	// init
	// service
	// destroy

	public void service(HttpServletRequest request, HttpServletResponse response) {
		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		System.out.println(firstName);
		System.out.println(email);
		System.out.println(password);

		response.setContentType("text/html");

		try {
			PrintWriter out = response.getWriter();
			out.print("<html><body>");
			out.print("FirstName : " + firstName + "<br>");
			out.print("Email : " + email + "<br>");
			out.print("Password : " + password);
			out.print("</body></html>");

		} catch (Exception e) {

		}

	}
}
