package com.sportClub.provider.service;

import com.sportClub.common.dto.user.UserDto;
import com.sportClub.common.dto.user.UserLoginDto;
import com.sportClub.common.vo.R;

public interface UserLoginService {
    //登录
    R Login(UserLoginDto userLoginDto);
    //检查手机号是否存在
    R checkPhone(String phone);
    //注册
    R register(UserDto userDto);

}
