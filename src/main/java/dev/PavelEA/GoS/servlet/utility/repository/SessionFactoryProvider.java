package dev.PavelEA.GoS.servlet.utility.repository;

import org.hibernate.SessionFactory;

public interface SessionFactoryProvider {

    SessionFactory getSessionFactory();
}
