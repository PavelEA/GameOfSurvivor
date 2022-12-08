package dev.PavelEA.GoS.servlet.utility.repository.provider;

import org.hibernate.SessionFactory;

public interface SessionFactoryProvider {

    SessionFactory getSessionFactory();
}
