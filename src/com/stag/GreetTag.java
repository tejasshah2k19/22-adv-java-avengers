package com.stag;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

//jsp api jar 
//implements SimpleTag
public class GreetTag extends SimpleTagSupport {
	@Override
	public void doTag() throws JspException, IOException {
		System.out.println("Good Afternoon");
		JspWriter out = getJspContext().getOut();
		out.print("Good AfterNoon..");
	}
}
