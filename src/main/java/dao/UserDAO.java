package dao;

import models.User;

import java.sql.SQLException;

public interface UserDAO {
    //create
    void add(User user) throws SQLException;
}
