package dev.PavelEA.GoS.servlet;

import dev.PavelEA.GoS.servlet.utility.UserRepository;

import javax.servlet.*;
import javax.servlet.annotation.*;

@WebListener
public class AppContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ServletContext ctx = servletContextEvent.getServletContext();
        ctx.setAttribute("userRepository", new UserRepository());
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        ServletContext ctx = servletContextEvent.getServletContext();
    }
}
