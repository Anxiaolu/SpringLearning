/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.sdut.softlab.springlearning1;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author huanlu
 */
public class Main {

    @Test
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = 
                new AnnotationConfigApplicationContext(DiConfig.class);
        
        UseFunctionService useFunctionService = 
                context.getBean(UseFunctionService.class);
        
        System.out.println(useFunctionService.SayHello("di"));
        context.close();
    }
}
