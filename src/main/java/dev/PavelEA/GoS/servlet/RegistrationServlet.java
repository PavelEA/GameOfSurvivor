package dev.PavelEA.GoS.servlet;

import dev.PavelEA.GoS.servlet.utility.User;
import dev.PavelEA.GoS.servlet.utility.UserRepository;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "RegistrationServlet", value = "/registration")
public class RegistrationServlet extends HttpServlet {
    private UserRepository userRepository = null;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        ServletContext servletContext = config.getServletContext();
        userRepository = (UserRepository) servletContext.getAttribute("userRepository");
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        HttpSession session = request.getSession();
        String removeBtn = request.getParameter("removeBtn");
        User user;
        if (removeBtn != null) {
            if (userRepository.isExists(username)) {
                user = this.userRepository.fetchByUsername(username);
                userRepository.delete(user);
                request.setAttribute("tooltip", String.format("<span class='text-success'>Пользователь '%s' удален</span>", username));
            } else {
                request.setAttribute("tooltip", String.format("<span class='text-danger'>Пользователя '%s' не существует</span>", username));
            }

            getServletContext().getRequestDispatcher("/settingsGame.jsp").forward(request, response);
        } else {
            String startBtn = request.getParameter("startBtn");
            if (startBtn != null) {
                if (userRepository.isExists(username)) {
                    getServletContext().getRequestDispatcher("/menu").forward(request, response);
                } else {
                    user = new User();
                    user.setAttempts(1);
                    user.setUsername(username);
                    userRepository.save(user);
                }

                getServletContext().getRequestDispatcher("/menu").forward(request, response);
            }

        }
    }
}