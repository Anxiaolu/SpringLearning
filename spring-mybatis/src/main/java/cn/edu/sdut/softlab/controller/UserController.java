/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.sdut.softlab.controller;

import cn.edu.sdut.softlab.model.User;
import cn.edu.sdut.softlab.service.UserService;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author huanlu
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;
    
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(){
        return "login";
    }

    @RequestMapping(value = "/login")
    @SuppressWarnings("unchecked")
    public ModelAndView login(@RequestParam("loginname") String loginname,
            @RequestParam("password") String password,
            HttpSession session,
            ModelAndView mv) {
        System.out.println("loginname:" + loginname);
        Map map = new HashMap();
        map.put("loginname", loginname);
        map.put("password", password);
        User user = userService.login(map);
        System.out.print(user.toString());
        if (user != null) {
            session.setAttribute("loginuser", user);
            mv.setViewName("redirect:/show");
        } else {
            mv.addObject("message", "登录出错!");
            mv.setViewName("redirect:/show");
        }
        return mv;
    }

    @RequestMapping("/show")
    public String show() {
        return "show";
    }
}
