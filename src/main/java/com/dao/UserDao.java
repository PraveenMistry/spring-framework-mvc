package com.dao;

import com.model.Login;
import com.model.User;

/**
 * Created by Pmistry on 23/11/18.
 */

public interface UserDao {
    void register(User user);
    User validateUser(Login login);
}
