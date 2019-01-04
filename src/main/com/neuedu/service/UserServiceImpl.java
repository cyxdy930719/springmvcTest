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
}
