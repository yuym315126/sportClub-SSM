package com.sportClub.provider.service.impl;

import com.sportClub.common.vo.R;
import com.sportClub.provider.config.JedisCore;
import com.sportClub.provider.dao.UserSignDao;
import com.sportClub.provider.service.UserSignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: 破晓
 * @date: 2020/8/21 19:58
 * @description:
 */
@Service
public class UserSignInServiceImpl implements UserSignService {


    @Autowired
    private UserSignDao userSignDao;
    @Autowired
    private JedisCore jedisCore;

    @Override
    public R findUserSignIn(String token) {

        return null;
    }

    @Override
    public R userSignIn(String token) {
        return null;
    }
}
