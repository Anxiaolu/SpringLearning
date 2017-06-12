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

/**
 *
 * @author huanlu
 */
@Controller
public class LoginController {
    private Logger logger;
    
    @Autowired
    StuffService stuffService;
    
    @RequestMapping(value = "usr_log",method = RequestMethod.POST)
    public String login(Model model){
        List<Stuff> stuffs = stuffService.findAll(Stuff.class);
        model.addAttribute("sutffs", stuffs);
        model.addAttribute("stuff", new Stuff());
        for(Stuff s:stuffs){
            
        }
        return "home";
    }
    
    @RequestMapping(value = "login",method = RequestMethod.POST)
    public String userLog(@ModelAttribute Stuff stuff,Model model){
        
        return "";
    }
    
    @ModelAttribute
    @RequestMapping(value = "/is_login")
    public String isLogIn(Model model){
        
        return "";
    }
}
