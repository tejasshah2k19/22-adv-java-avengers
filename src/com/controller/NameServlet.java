package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NameServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		RequestDispatcher rd = null;
		if (name == null || name.trim().length() == 0) {
			request.setAttribute("error", "Plese Enter Name");
			rd = request.getRequestDispatcher("Name.jsp");

		} else {
			request.setAttribute("myName", name);
			rd = request.getRequestDispatcher("NameOutput.jsp");

		}
		rd.forward(request, response);
	}
}
