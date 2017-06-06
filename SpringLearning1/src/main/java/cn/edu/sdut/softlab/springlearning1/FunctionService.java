/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.sdut.softlab.springlearning1;

import org.springframework.stereotype.Service;

/**
 * 使用@Service注解声明当前FunctionService类是Spring管理的一个Bean.
 * 其中,使用@Compent,@Service,@Reponstory和@Controller是等效的,可以根据需要选用.
 * @author huanlu
 */
@Service
public class FunctionService {
    public String sayHello(String word){
        return "Hello" + " "+ word + " " + "!";
    }
}
