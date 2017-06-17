/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.SQLException;
import javax.sql.DataSource;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author huanlu
 */
public class Testssh {
    
    private ApplicationContext ctx = null;
    
    @Test
    public void testDatasource() throws SQLException{
        ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        SessionFactory sessionFactory = ctx.getBean(SessionFactory.class);
        System.out.println(sessionFactory);
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
    }
    
}
