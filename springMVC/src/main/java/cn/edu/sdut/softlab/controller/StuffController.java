/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.sdut.softlab.controller;

import cn.edu.sdut.softlab.entity.Stuff;
import cn.edu.sdut.softlab.repository.StuffRepository;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author huanlu
 */
@Controller
public class StuffController {
    private Logger logger;
    
    @Autowired
    StuffRepository stuffService;
    
   @RequestMapping(value = "/stuff_add",method = RequestMethod.POST)
   public String stuffAdd(@ModelAttribute("user") Stuff stuff){
       stuffService.saveAndFlush(stuff);
       return "redirect:/stuffs";
   }
   
}
