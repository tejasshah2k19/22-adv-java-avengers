package com.ctag;
//tag with attribute 

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

//Tag - interface
//TagSupport - class 
//<c:sqr num="4"/> 

public class SquareTag extends TagSupport {

	int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public int doStartTag() throws JspException {
		JspWriter out = pageContext.getOut();
		try {
			out.print(num * num);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return super.doStartTag();
	}

	@Override
	public int doEndTag() throws JspException {
		return EVAL_PAGE;//page execute 
//		return SKIP_PAGE;
	}
}
