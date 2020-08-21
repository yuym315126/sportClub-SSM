package com.sportClub.provider.service;

import com.sportClub.common.vo.R;

/**
 * @author: 破晓
 * @date: 2020/8/21 19:00
 * @description:
 */
public interface UserSignService {
    //查询签到信息（展示签到信息）
    R findUserSignIn(String token);
    //用户签到
    R userSignIn(String token);

}
