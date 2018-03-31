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
}
