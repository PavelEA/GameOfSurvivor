package dev.PavelEA.GoS.servlet;

import dev.PavelEA.GoS.servlet.utility.User;
import dev.PavelEA.GoS.servlet.utility.UserRepository;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

@WebServlet(name = "StatisticServlet", value = "/statistic")
public class StatisticServlet extends HttpServlet {
    UserRepository userRepository = null;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        ServletContext servletContext = config.getServletContext();
        this.userRepository = (UserRepository) servletContext.getAttribute("userRepository");
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Collection<User> users = this.userRepository.getUsers();
        List<User> userList = users.stream().sorted().toList();

        for (int i = 0; i < users.size(); ++i) {
            request.setAttribute("username_" + i, userList.get(i).getUsername());
            request.setAttribute("attempts_u" + i, userList.get(i).getAttempts());
            request.setAttribute("victory_u" + i, userList.get(i).getVictory());
            request.setAttribute("defeat_u" + i, userList.get(i).getDefeat());
        }

        this.getServletContext().getRequestDispatcher("/statistic.jsp").forward(request, response);
    }
}