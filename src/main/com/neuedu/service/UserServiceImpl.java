package com.neuedu.service;

import com.neuedu.dao.IUserDao;
import com.neuedu.dao.UserImpl;
import com.neuedu.pojo.User;

import java.util.List;

public class UserServiceImpl implements IUserService {
    private IUserDao dao = new UserImpl();
    @Override
    public List<User> getUsers() {
        return dao.getUsers();
    }

    @Override
    public int insertOne(User user) {
        return dao.insertOne(user);
    }

    @Override
    public int updateOne(User user) {
        return dao.updateOne(user);
    }

    @Override
    public User getOne(String name) {
        return dao.getOne(name);
    }

    @Override
    public int delOne(String name) {
        return dao.delOne(name);
    }
}
