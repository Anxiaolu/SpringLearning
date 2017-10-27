/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.sdut.softlab.service;

import cn.edu.sdut.softlab.model.Role;
import cn.edu.sdut.softlab.model.User;
import java.util.List;
import java.util.Map;

/**
 *
 * @author huanlu
 */
public interface UserService {
    List<User> findAll();
    
    int deleteByPrimaryKey(Long id);
    
    int insert(User record);
    
    User selectByPrimaryKey(Long id);
    
    int updateByPrimaryKeySelective(User record);
    
    int updateByPrimaryKey(User record);
    
    User login(Map<String, Object> map);
    
    User findUserByEmail(String email);
    
    List<Role> selectRoleByUserId(Long id);
}
