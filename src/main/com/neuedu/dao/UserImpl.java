package com.neuedu.dao;

import com.neuedu.Until.JdbcUntil;
import com.neuedu.Until.RowMap;
import com.neuedu.pojo.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserImpl implements IUserDao {
    @Override
    public List<User> getUsers() {
        return JdbcUntil.executeQuery("select * from user", new RowMap<User>() {
            @Override
            public User RowMapping(ResultSet rs) {
                User u = new User();
                try {
                    u.setPwd(rs.getString("password"));
                    u.setName(rs.getString("username"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return u;
            }
        }, null);
    }
}
