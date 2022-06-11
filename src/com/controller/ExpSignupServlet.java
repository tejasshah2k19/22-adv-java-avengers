package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.ExpUserBean;
import com.util.UserStorage;

@WebServlet("/ExpSignupServlet")
public class ExpSignupServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");

		ExpUserBean user = new ExpUserBean();
		user.setEmail(email);
		user.setFirstName(firstName);
		user.setGender(gender);
		user.setPassword(password);
		int x = (int) (Math.random() * 100000);
		user.setUserId(x);
		UserStorage.users.add(user); 
	
		RequestDispatcher rd = request.getRequestDispatcher("ListUsers.jsp");
		rd.forward(request, response);
	}
}
