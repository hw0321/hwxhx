package com.controller;

import com.pojo.UserInfo;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "hello")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/index.html")
    public ModelAndView getIndex(){
        ModelAndView mav = new ModelAndView("index");
        UserInfo user = userService.selectUserById(1);
        mav.addObject("user", user);
        return mav;
    }
}
