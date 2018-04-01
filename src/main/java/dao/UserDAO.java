package dao;

import models.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDAO {
    //create
    void add(User user) throws SQLException;
    //read
    List<User> getAll () throws SQLException;
}
