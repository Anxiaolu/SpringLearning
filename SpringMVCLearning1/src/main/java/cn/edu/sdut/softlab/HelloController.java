/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.sdut.softlab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author huanlu
 */
@Controller
public class HelloController {
    
    @RequestMapping("/test")
    public String test(){
        System.out.println("Spring test!");
        return "home";
    }
}
