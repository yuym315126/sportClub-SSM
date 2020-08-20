package com.sportClub.provider.dao;

import com.sportClub.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * @author: 破晓
 * @date: 2020/8/20 16:12
 * @description:
 */
@Repository
public interface UserDao {
    List<User> finAll();
    int addUser(User user);
}