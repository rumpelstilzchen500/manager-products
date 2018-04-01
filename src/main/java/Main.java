import models.User;

import service.UserService;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserService userService = new UserService();

        User user = new User();
            user.setFirst_name("test_first_n123123123123123");
            user.setLast_name("test_last_name2");
            user.setPhone(932071888);
            user.setSex("man");


        //userService.add(user);

        System.out.println(userService.getAll());
    }
}