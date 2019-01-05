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

    @Override
    public int insertOne(User user) {
        return JdbcUntil.executeUpdate("insert into user(username,password) values(?,?)",user.getName(),user.getPwd());
    }

    @Override
    public int updateOne(User user) {
        return JdbcUntil.executeUpdate("update user set password=? where username=?",user.getPwd(),user.getName());
    }

    @Override
    public User getOne(String name) {
        return JdbcUntil.QueryOne("select * from user where username=?", new RowMap<User>() {
            @Override
            public User RowMapping(ResultSet rs) {
                User u  = new User();
                try {
                    u.setPwd(rs.getString("password"));
                    u.setName(rs.getString("username"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return u;
            }
        }, name);
    }

    @Override
    public int delOne(String name) {
        return JdbcUntil.executeUpdate("delete from user where username=?",name);
    }
}
