package com.sportClub.provider.dao;

import com.sportClub.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLoginDao {
    //查询手机号
    User selectPhone(String phone);
    //注册
    int insert(User user);
}
