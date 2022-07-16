package com.ctag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class PrintTag extends TagSupport {

	int count;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public int doStartTag() throws JspException {
		JspWriter out = pageContext.getOut();

		return EVAL_BODY_INCLUDE;// read body and
		// call doAfterBody
	}

	@Override
	public int doAfterBody() throws JspException {
		// print body on jsp
		if (count == 0)
			return SKIP_BODY;
		else {
			count--;
			return EVAL_BODY_AGAIN;//doAfterBody 
		}
	}

	@Override
	public int doEndTag() throws JspException {
		return EVAL_PAGE;
	}
}
