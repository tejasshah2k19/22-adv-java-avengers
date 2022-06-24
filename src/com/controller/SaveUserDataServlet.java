package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SaveUserDataServlet")
public class SaveUserDataServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstName = request.getParameter("firstName");
		String cc = request.getParameter("cc");

		// cookie
		Cookie c = new Cookie("firstName", firstName);
		response.addCookie(c);

		// session
		HttpSession session = request.getSession();
		session.setAttribute("cc", cc);

		session.setMaxInactiveInterval(60 * 3);//3 minute
		response.sendRedirect("UserDataDisplay.jsp");
	}
}
