package com.springboot.demo.autoconfiguration;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by yz on 2017/12/26.
 */
public class MyServletListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.printf("servlet is starting");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.printf("servlet is stoping");
    }
}
