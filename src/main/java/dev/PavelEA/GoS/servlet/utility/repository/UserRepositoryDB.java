package dev.PavelEA.GoS.servlet.utility.repository;

import dev.PavelEA.GoS.servlet.utility.model.User;
import dev.PavelEA.GoS.servlet.utility.repository.provider.PropertiesSessionFactoryProvider;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.Optional;


public class UserRepositoryDB {

    private final SessionFactory sessionFactory;

    public UserRepositoryDB(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    public User save(User user) {
        try(Session session = sessionFactory.openSession()){
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
    public Optional<User> findById(Long id) {
        try(Session session = new PropertiesSessionFactoryProvider().getSessionFactory().openSession()){
            User user = session.find(User.class, id);
            return Optional.of(user);
        }
    }
    public Optional<String> findByUsername(String username) {
        String HQL = "select username from User where username = :username";
        try (Session session = new PropertiesSessionFactoryProvider().getSessionFactory().openSession()) {
            Query<String> query = session.createQuery(HQL, String.class);
            query.setParameter("username", username);
            return Optional.ofNullable(query.uniqueResult());
        }
    }

    public void deleteByUsername(String username) {
        try (Session session = new PropertiesSessionFactoryProvider().getSessionFactory().openSession()) {
            session.remove(findByUsername(username));
            session.flush();
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
