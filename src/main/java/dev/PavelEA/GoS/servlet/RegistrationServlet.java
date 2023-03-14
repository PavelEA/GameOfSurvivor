package dev.PavelEA.GoS.servlet;

import dev.PavelEA.GoS.servlet.utility.model.User;
import dev.PavelEA.GoS.servlet.utility.UserRepository;
import dev.PavelEA.GoS.servlet.utility.repository.provider.PropertiesSessionFactoryProvider;
import dev.PavelEA.GoS.servlet.utility.repository.UserRepositoryDB;
import org.hibernate.SessionFactory;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "RegistrationServlet", value = "/registration")
public class RegistrationServlet extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);

    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PropertiesSessionFactoryProvider provider = new PropertiesSessionFactoryProvider();
        SessionFactory sessionFactory = provider.getSessionFactory();
        UserRepositoryDB db = new UserRepositoryDB(sessionFactory);

        // логика для юзерс лист модал
        HttpSession httpSession = request.getSession();
        List<String> allUsersUsername = db.getAllUsersUsername();
        httpSession.setAttribute("users",allUsersUsername);


        User user;
        String username = request.getParameter("username");
        String startBtn = request.getParameter("startBtn");
        if (startBtn != null) {
            if (!db.usernameIsExist(username)) {
                user = User.builder()
                        .username(username)
                        .victory(0)
                        .defeat(0)
                        .attempts(1)
                        .build();
                db.save(user);
                getServletContext().getRequestDispatcher("/menu").forward(request, response);
            } else {
                // user = db.findById(db.findByUsername(username)); // понадобится потом
                getServletContext().getRequestDispatcher("/menu").forward(request, response);
            }
        }

        String removeBtn = request.getParameter("removeBtn");
        if (removeBtn != null) {
            if (!db.usernameIsExist(username)) {
                request.setAttribute("tooltip", String.format("<span class='text-danger'>Пользователя '%s' не существует</span>", username));//todo define this logic
                getServletContext().getRequestDispatcher("/settingsGame.jsp").forward(request, response);
            } else {
                db.deleteByUsername((username));
                request.setAttribute("tooltip", String.format("<span class='text-success'>Пользователь '%s' удален</span>", username));//todo define this logic
                getServletContext().getRequestDispatcher("/settingsGame.jsp").forward(request, response);
            }
        }
        // логика для юзерс лист модал
//        List<String> allUsersUsername = db.getAllUsersUsername();
//        request.setAttribute("users",allUsersUsername);
//        request.setAttribute("uss","ssu");

//        allUsersUsername.forEach(x->session.setAttribute("users",x));

//        request.setAttribute("users", allUsersUsername);
    }
}