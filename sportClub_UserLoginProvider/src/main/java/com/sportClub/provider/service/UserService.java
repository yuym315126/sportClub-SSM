package com.sportClub.provider.service;

import com.sportClub.pojo.User;

import java.util.List;

/**
 * @author: 破晓
 * @date: 2020/8/20 16:12
 * @description:
 */
public interface UserService {
    List<User> finAll();
    int addUser(User user);
}