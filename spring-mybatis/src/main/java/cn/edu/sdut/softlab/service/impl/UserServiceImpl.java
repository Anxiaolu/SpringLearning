/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.sdut.softlab.service.impl;

import cn.edu.sdut.softlab.dao.UserMapper;
import cn.edu.sdut.softlab.model.Role;
import cn.edu.sdut.softlab.model.User;
import cn.edu.sdut.softlab.service.UserService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author huanlu
 */
@Service("userservice")
public class UserServiceImpl implements UserService{
    
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(User record) {
        return userMapper.insert(record);
    }

    @Override
    public User selectByPrimaryKey(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKey(record);
    }

    @Override
    public User login(Map<String, Object> map) {
        return userMapper.login(map);
    }

    @Override
    public User findUserByEmail(String email) {
        return userMapper.findUserByEmail(email);
    }

    @Override
    public List<Role> selectRoleByUserId(Long id) {
        return userMapper.selectRoleByUserId(id);
    }
    
}
