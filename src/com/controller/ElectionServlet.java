package com.controller;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ElectionServlet")
public class ElectionServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String cname = request.getParameter("cname");
		String gender = request.getParameter("gender");
		String dob = request.getParameter("dob");

		dob = dob.substring(0, 4);
		System.out.println(dob);
	
		Calendar c = Calendar.getInstance(); 
		int year = c.get(Calendar.YEAR);
		System.out.println(year);
		// validation

	}
}
