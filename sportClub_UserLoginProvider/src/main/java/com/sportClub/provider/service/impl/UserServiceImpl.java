package com.sportClub.provider.service.impl;

import com.sportClub.pojo.User;
import com.sportClub.provider.dao.UserDao;
import com.sportClub.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: 破晓
 * @date: 2020/8/20 16:13
 * @description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> finAll() {
        return userDao.finAll();
    }

    @Override
    public int addUser(User user) {
        return userDao.addUser(user);
    }

}
