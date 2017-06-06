/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.sdut.softlab.springlearning1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author huanlu
 */
@Service
//使用@Service注解声明当前UseFunctionService类是Spring管理的一个Bean
public class UseFunctionService {
    @Autowired
    FunctionService functionService;
    
    public String SayHello(String word){
        return functionService.sayHello(word);
    }
}
