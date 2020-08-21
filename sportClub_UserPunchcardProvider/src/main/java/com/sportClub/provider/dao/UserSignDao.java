package com.sportClub.provider.dao;

import com.sportClub.pojo.UserSign;
import org.springframework.stereotype.Repository;

/**
 * @author: 破晓
 * @date: 2020/8/21 16:14
 * @description:
 */
@Repository
public interface UserSignDao {
    //查询用户签到记录
    UserSign findByUserId(Integer userId);

    //修改用户签到记录
    int updateSign(UserSign userSign);

    //添加签到数据
    int addUserSign(Integer userId);


}
