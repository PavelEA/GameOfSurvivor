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
        this.userRepository = (UserRepository) servletContext.getAttribute("userRepository");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        HttpSession session = request.getSession();
        String removeBtn = request.getParameter("removeBtn");
        User user;
        if (removeBtn != null) {
            if (this.userRepository.isExists(username)) {
                user = this.userRepository.fetchByUsername(username);
                this.userRepository.delete(user);
                request.setAttribute("tooltip", String.format("<span class='text-success'>Пользователь '%s' удален</span>", username));
            } else {
                request.setAttribute("tooltip", String.format("<span class='text-danger'>Пользователя '%s' не существует</span>", username));
            }

            this.getServletContext().getRequestDispatcher("/settingsGame.jsp").forward(request, response);
        } else {
            String startBtn = request.getParameter("startBtn");
            if (startBtn != null) {
                if (this.userRepository.isExists(username)) {
                    user = this.userRepository.fetchByUsername(username);
                    user.setAttempts(user.getAttempts() + 1);
                    session.setAttribute("attempts", user.getAttempts());
                } else {
                    user = new User();
                    user.setAttempts(1);
                    user.setUsername(username);
                    this.userRepository.save(user);
                }

                this.getServletContext().getRequestDispatcher("/menu").forward(request, response);
            }

        }
    }
}