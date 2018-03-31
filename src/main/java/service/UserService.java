package service;

import dao.UserDAO;
import models.User;
import org.hibernate.Session;
import util.SessionUtil;

import java.sql.SQLException;

public class UserService extends SessionUtil implements UserDAO{

        public void add(User user) throws SQLException {

            openTransactionSession();
            Session session = getSession();
            session.save(user);
            closeTransactionSession();
        }

/*        public List<User> getAll() throws SQLException {
            //open session with a transaction
            openTransactionSession();

            String sql = "SELECT * FROM ADDRESS";

            Session session = getSession();
            Query query = session.createQuery(sql);

            List<User> addressList = query.list();

            //close session with a transaction
            closeTransactionSesstion();

            return addressList;
        }*/

/*        public User getById(Long id) throws SQLException {
            //open session with a transaction
            openTransactionSession();

            String sql = "SELECT * FROM ADDRESS WHERE ID = :id";

            Session session = getSession();
            Query query = session.createQuery(sql);
            query.setParameter("id", id);

            User user = (User) query

            //close session with a transaction
            closeTransactionSesstion();

            return user;
        }*/

/*        public void update(User user) throws SQLException {
*//*            //open session with a transaction
            openTransactionSession();

            Session session = getSession();
            session.update(user);

            //close session with a transaction
            closeTransactionSesstion();*//*
        }*/

/*        public void remove(User user) throws SQLException {
            openTransactionSession();
            Session session = getSession();
            session.delete(user);
            closeTransactionSession();

        }*/

}
