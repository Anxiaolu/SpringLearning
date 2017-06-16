/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.sdut.softlab.controller;

import cn.edu.sdut.softlab.entity.Stuff;
import cn.edu.sdut.softlab.service.StuffService;
import java.util.List;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author huanlu
 */
@Controller
@RequestMapping(value = "/login")
public class LoginController {
    private Logger logger;
    
    @Autowired
    StuffService stuffService;
    
    @RequestMapping(value = "/dologin",method = RequestMethod.POST)
    public String login(String username,String password){
        Stuff stuff = stuffService.findByUsernameAndPassword(username, password);
        Stuff stuff2 = stuffService.findByName(username);
        if (stuff != null) {
            return "redirect:home";
        }
        if (stuff2 == null) {
            return "redirect:index";
        }
        return "redirect:index";
    }
    
    @ModelAttribute
    @RequestMapping(value = "/is_login")
    public String isLogIn(Model model){
        
        return "";
    }
    
    @RequestMapping(value = "/getstuffs")
    @ResponseBody
    public List<Stuff> getAllStuffs(){
        List<Stuff> stuffs = stuffService.findAll(Stuff.class);
        return stuffs;
    }
    
    @RequestMapping(value = "/deletstuff")
    public void delectStuff(Stuff stuff)
    {
        stuffService.remove(stuff);
    }
}
