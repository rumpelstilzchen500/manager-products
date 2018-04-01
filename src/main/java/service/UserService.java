package service;

import dao.UserDAO;
import models.User;
import org.hibernate.Query;
import org.hibernate.Session;
import util.SessionUtil;

import java.sql.SQLException;
import java.util.List;

public class UserService extends SessionUtil implements UserDAO{

    public void add(User user) throws SQLException {
        openTransactionSession();
        Session session = getSession();
        session.save(user);
        closeTransactionSession();
    }

    public List<User> getAll() throws SQLException {
        openTransactionSession();
        Session session = getSession();
        Query query = session.createSQLQuery("SELECT first_name FROM user");//user - table
        List<User> first_nameList = query.list();
        closeTransactionSession();
        return first_nameList;
    }

    public List<User> getNameById() throws SQLException {
        openTransactionSession();
        Session session = getSession();
        Query query = session.createQuery("SELECT U.first_name FROM User U WHERE U.id = 1"); //User - class

        List firstLastName = query.list();

        closeTransactionSession();
        return firstLastName;

    }
}
