package com.service;

import com.dao.UserDao;
import com.model.Login;
import com.model.User;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Pmistry on 23/11/18.
 */

public class UserServiceImpl implements UserService {

    @Autowired
    public UserDao userDao;

    public void register(User user) {
        userDao.register(user);
    }

    public User validateUser(Login login) {
        return userDao.validateUser(login);
    }

}