import models.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import service.UserService;
import util.HibernateUtil;

import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserService userService = new UserService();

        User user = new User();
            user.setFirst_name("test_first_n123123123123123");
            user.setLast_name("test_last_name2");
            user.setPhone(932071888);
            user.setSex("man");


        userService.add(user);
        HibernateUtil.shutdown();
    }
}