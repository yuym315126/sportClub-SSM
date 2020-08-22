package com.sportClub.web.controller;

import com.sportClub.common.dto.user.UserDto;
import com.sportClub.common.dto.user.UserLoginDto;
import com.sportClub.common.vo.R;
import com.sportClub.provider.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("toLogin")
public class UserLoginController {
    @Autowired
    private UserLoginService userLoginService;

    @PostMapping("login")
    public R Login(@RequestBody UserLoginDto userLoginDto) {
        return userLoginService.Login(userLoginDto);
    }

    @GetMapping("checkPhone/{phone}")
    public R checkPhone(@PathVariable String phone){
        return userLoginService.checkPhone(phone);
    }

    @PostMapping("register")
    public R register(@RequestBody UserDto userDto){
        return userLoginService.register(userDto);
    }

}
