package dev.PavelEA.GoS.servlet;

import dev.PavelEA.GoS.servlet.utility.PageConstructor;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "PrologueServlet", value = "/prologue")
public class PrologueServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        PageConstructor.createPages();
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("prologue", PageConstructor.getPage(1));
        getServletContext().getRequestDispatcher("/prologue.jsp").forward(request, response);
    }


}
