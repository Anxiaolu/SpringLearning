/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.sdut.softlab.controller;

import cn.edu.sdut.softlab.entity.Stuff;
import cn.edu.sdut.softlab.repository.StuffRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author huanlu
 */
@Controller
@RequestMapping(value = "/")
public class LoginController {
    private Logger logger = LoggerFactory.getLogger(LoginController.class);
    
    @Autowired
    StuffRepository stuffService;
    
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(@RequestParam("username")String username,
                        @RequestParam("password")String password,
                        Model model){
        logger.info("登录名:"+username+"密码为:"+password);
        Stuff stuff = stuffService.findByNameAndPassword(username, password);
        if (stuff != null) {
            return "redirect:home";
        }
        return "redirect:index";
    }
    
    @ModelAttribute
    @RequestMapping(value = "/islogin")
    public String isLogIn(Model model){
        return "";
    }
    
}
