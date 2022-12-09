package dev.PavelEA.GoS.servlet.utility.repository;

import dev.PavelEA.GoS.servlet.utility.model.User;
import dev.PavelEA.GoS.servlet.utility.repository.provider.PropertiesSessionFactoryProvider;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;
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
    public User findById(Long id) {
        try(Session session = new PropertiesSessionFactoryProvider().getSessionFactory().openSession()){
            User user = session.find(User.class, id);
            return user;
        }
    }

    public Long findByUsername(String username) {
        String HQL = "select id from User where username = :username";
        try (Session session = new PropertiesSessionFactoryProvider().getSessionFactory().openSession()) {
            Query<Long> query = session.createQuery(HQL, Long.class);
            query.setParameter("username", username);
            return query.getSingleResult();
        }

    }

    public void deleteByUsername(String username) {
        try (Session session = new PropertiesSessionFactoryProvider().getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            User user = findById(findByUsername(username));
                session.remove(user);
                transaction.commit();


        }
    }
    public Boolean usernameIsExist(String username) {
        String HQL = "select exists(select 1 from User where username = :username) from User";
        try (Session session = new PropertiesSessionFactoryProvider().getSessionFactory().openSession()) {
            Query<Boolean> query = session.createQuery(HQL, Boolean.class);
            query.setParameter("username", username);
            return query.getSingleResult();
        }

    }

    public List<Long> getAllUsersId(){
        try (Session session = new PropertiesSessionFactoryProvider().getSessionFactory().openSession()) {
            String HQL = "select id from User";
            Query<Long> query = session.createQuery(HQL, Long.class);
            List<Long> userList = query.list();
            return userList;
        }
    }        public List<String> getAllUsersUsername(){
        try (Session session = new PropertiesSessionFactoryProvider().getSessionFactory().openSession()) {
            String HQL = "select username from User";
            Query<String> query = session.createQuery(HQL, String.class);
            List<String> userList = query.list();
            return userList;
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
