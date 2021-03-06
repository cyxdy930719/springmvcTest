package com.neuedu.dao;

import com.neuedu.pojo.User;

import java.util.List;

public interface IUserDao {
    public List<User> getUsers();
    public int insertOne(User user);
    public int updateOne(User user);
    public User getOne(String name);
    public int delOne(String name);
}
