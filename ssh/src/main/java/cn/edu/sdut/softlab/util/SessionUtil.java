/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.sdut.softlab.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author huanlu
 */

public class SessionUtil {
    
    private ApplicationContext ctx;
    
    public Session cerateSession(){
        ctx =new ClassPathXmlApplicationContext("applicationContext.xml");
        SessionFactory sessionFactory = ctx.getBean(SessionFactory.class);
        return sessionFactory.getCurrentSession();
    }

}
