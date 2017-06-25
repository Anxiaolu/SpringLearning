/*
 * Copyright 2016 Su Baochen and individual contributors by the 
 * @authors tag. See the copyright.txt in the distribution for
 * a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.edu.sdut.softlab.service;

import cn.edu.sdut.softlab.entity.Stuff;
import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.Stateless;
import javax.inject.Named;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Stateless
@Repository
@Named("stuff")
public class StuffService extends AbstractFacade<Stuff> {

  public StuffService() {
    super(Stuff.class);
  }
  
  public Stuff findByUsernameAndPassword(String username,String password) {
    Map<String,Object> parameters = new HashMap<>(0);
    parameters.put("username", username);
    parameters.put("password", password);
    return findSingleByNamedQuery("Stuff.findByUsernameAndPassword", parameters, Stuff.class).get();
  }
  
  public Stuff findById(Integer id) {
    Map<String,Object> parameters = new HashMap<>(0);
    parameters.put("id", id);
    return findSingleByNamedQuery("Stuff.findByUserId", parameters, Stuff.class).get();
  }
  
   public Stuff findByName(String username) {
    Map<String,Object> parameters = new HashMap<>(0);
    parameters.put("username", username);
    return findSingleByNamedQuery("Stuff.findByUsername", parameters, Stuff.class).get();
  } 
   
   public List<String> findAllStuffName(){
       List<String> allstuffnameList = new ArrayList<>();
       List<Stuff> allstuffList = findAll(Stuff.class);
       for(Stuff s:allstuffList){
           allstuffnameList.add(s.getUsername());
       }
       return allstuffnameList;
   }
}