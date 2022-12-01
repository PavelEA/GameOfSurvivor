package dev.PavelEA.GoS.servlet.utility.repository;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class PropertiesSessionFactoryProvider implements SessionFactoryProvider {
    @Override
    public SessionFactory getSessionFactory() {
        return new Configuration()
                .buildSessionFactory();
    }
}
