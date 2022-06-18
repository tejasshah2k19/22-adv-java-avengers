package com.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ServerListener implements ServletContextListener {
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("Welcome....");
	}

	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("GoodBye...");
	}
}
