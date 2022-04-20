package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		// validation
		// required
		// format
		// length

		// db insert
		// home

		boolean isError = false;
		String errorMessage = "";
		if (firstName == null || firstName.trim().length() == 0) {
			isError = true;
			errorMessage += "Please Enter FirstName<br>";
		}
		if (email == null || email.trim().length() == 0) {
			isError = true;
			errorMessage += "Please Enter Email<br>";
		}

		if (password == null || password.trim().length() == 0) {
			isError = true;
			errorMessage += "Please Enter Password<br>";
		}

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		if (isError == true) {
			out.print(errorMessage);
		} else {
			out.print("REgistraion done now you can Login");
		}
		out.print("</body></html>");
	}
}
