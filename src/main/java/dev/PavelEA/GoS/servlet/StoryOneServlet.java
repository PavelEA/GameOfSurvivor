package dev.PavelEA.GoS.servlet;

import dev.PavelEA.GoS.servlet.utility.AnswerConstructor;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "StoryOneServlet", value = "/origin")
public class StoryOneServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        AnswerConstructor.createAnswers();
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/story1.jsp").forward(request, response);
    }
}