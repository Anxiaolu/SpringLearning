/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.sdut.softlab.springlearning1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 使用@Service注解声明当前UseFunctionService类是Spring管理的一个Bean.
 * 使用@autowired将Function的实体Bean注入到UseFunctionService中,
 * 让UseFunctionService具备FunctionService的功能
 * ,此处使用JSR-330@inject注解或者使用JSR-250注解的@Resource注解是等效的.
 *
 * @author huanlu
 */
@Service
public class UseFunctionService {

    @Autowired
    FunctionService functionService;

    public String SayHello(String word) {
        return functionService.sayHello(word);
    }
}
