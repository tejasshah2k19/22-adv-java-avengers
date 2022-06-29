package com.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class UserCounterListener implements HttpSessionListener {
 
	static int userCounter = 0;
	//when session created this method will call 
	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		// first request --> server --> session
		userCounter++;
		System.out.println("User LoggedIn => " + userCounter);
	}
	
	
	//when session delete this method will call 
	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		// logout or timeout
		userCounter--;
		System.out.println("User LoggedOut => " + userCounter);
	}
}
