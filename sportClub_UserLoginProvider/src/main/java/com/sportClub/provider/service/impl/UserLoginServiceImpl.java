package com.sportClub.provider.service.impl;

import com.sportClub.common.dto.user.UserDto;
import com.sportClub.common.dto.user.UserLoginDto;
import com.sportClub.common.until.EncryptUtil;
import com.sportClub.common.until.TokenUtil;
import com.sportClub.common.vo.R;
import com.sportClub.pojo.User;
import com.sportClub.provider.config.JedisCore;
import com.sportClub.provider.dao.UserLoginDao;
import com.sportClub.provider.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.sportClub.common.util.RedisKeyConfig.PHONE_TOKEN;

@Service
public class UserLoginServiceImpl implements UserLoginService {
    @Autowired
    private UserLoginDao userLoginDao;
    @Autowired
    private JedisCore jedisCore;

    //登录
    public R Login(UserLoginDto userLoginDto) {

        User user = userLoginDao.selectPhone(userLoginDto.getPhone());
        if (user != null) {
            //比较密码
            if (user.getUserPwd().equals(userLoginDto.getPassword())){
                //正确生成令牌 设置有效期 存储到Redis
                String token = TokenUtil.createToken(user.getUserId());
                //存储到Redis
                jedisCore.set(PHONE_TOKEN,token,);
                return R.ok(token);
            } else {
                //错误登录失败
            }


        }
        return null;
    }

    /**
     *  检查手机号是否存在
     * @param phone
     * @return
     */
    @Override
    public R checkPhone(String phone) {
        return null;
    }

    /**
     * 注册
     * @param userDto
     * @return
     */
    @Override
    public R register(UserDto userDto) {
        return null;
    }
}
