package dev.PavelEA.GoS.servlet.utility.repository;

import dev.PavelEA.GoS.servlet.utility.User;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Optional;

public class UserRepositoryDB {

    public User save(User user) {
        try(Session session = new PropertiesSessionFactoryProvider().getSessionFactory().openSession()){
            Transaction transaction = session.beginTransaction();
            session.persist(user);
            transaction.commit();
            return user;
        }
    }
    public User update(User user) {
        try(Session session = new PropertiesSessionFactoryProvider().getSessionFactory().openSession()){
            Transaction transaction = session.beginTransaction();
            session.merge(user);
            transaction.commit();
            return user;
        }
    }
    public Optional<User> findById(long id) {
        try(Session session = new PropertiesSessionFactoryProvider().getSessionFactory().openSession()){
            User user = session.find(User.class, id);
            return Optional.of(user);
        }
    }
    public void delete(User user) {
        try(Session session = new PropertiesSessionFactoryProvider().getSessionFactory().openSession()){
            Transaction transaction = session.beginTransaction();
            session.remove(user);
            transaction.commit();
        }
    }
}
