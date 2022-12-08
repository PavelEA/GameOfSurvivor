package dev.PavelEA.GoS.servlet.utility.repository.provider;

import dev.PavelEA.GoS.servlet.utility.model.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class PropertiesSessionFactoryProvider implements SessionFactoryProvider {
    @Override
    public SessionFactory getSessionFactory() {
        return new Configuration()
                .addAnnotatedClass(User.class)
                .buildSessionFactory();
    }
}
