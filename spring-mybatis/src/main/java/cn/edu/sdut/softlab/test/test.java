/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.sdut.softlab.test;

import cn.edu.sdut.softlab.dao.UserMapper;
import cn.edu.sdut.softlab.model.User;
import java.io.IOException;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 *
 * @author huanlu
 */
public class test {

    public static void main(String[] args) throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("classpath:spring/spring-mvc.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
    }
    
    public void testUser(SqlSession session){
        UserMapper userMapper = session.getMapper(UserMapper.class);
        User user = (User) userMapper.findUserByEmail("admin");
        System.out.println("cn.edu.sdut.softlab.test.test.testUser()" + user.toString());
    }
}
