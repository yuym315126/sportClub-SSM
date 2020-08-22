package com.sportClub.web.controller;

import com.sportClub.pojo.User;
import com.sportClub.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author: 破晓
 * @date: 2020/8/20 16:05
 * @description:
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/findAll.do")
    public List<User> findAll(){
        return service.finAll();
    }

    @PostMapping("addUser.do")
    public String addUser(User user, HttpServletResponse response){

        response.setCharacterEncoding("utf-8");
//        response.setContentType("text/html;charset=utf-8");
        int i = service.addUser(user);
        if(i==1){
            return "添加成功";
        }else {
            return "添加失败";
        }
    }
    @GetMapping("/findAllTest.do")
    public String findAll(HttpServletResponse response){
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        return "成功";
    }
}