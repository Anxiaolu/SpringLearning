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

import cn.edu.sdut.softlab.entity.Item;
import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.Stateless;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Stateless
@Repository
public class ItemService extends AbstractFacade<Item> {

    public ItemService() {
        super(Item.class);
    }

    public Item findByName(String name) {
        Map<String, Object> parameters = new HashMap<>(0);
        parameters.put("name", name);
        return findSingleByNamedQuery("Item.findByName", parameters, Item.class).get();
    }
    
    public Item findById(int id) {
        Map<String, Object> parameters = new HashMap<>(0);
        parameters.put("id", id);
        return findSingleByNamedQuery("Item.findById", parameters, Item.class).get();
    }

    public Item findByNameAndCode(String name, String code) {
        Map<String, Object> parameters = new HashMap<>(0);
        parameters.put("name", name);
        parameters.put("code", code);
        return findSingleByNamedQuery("Item.findByNameAndCode", parameters, Item.class).get();
    }

    public List<Item> getAvailableItems(){
        List<Item> alllist = this.findAll(Item.class);
        List<Item> list = new ArrayList<>();
        for(Item i:alllist){
            if (i.getStatus().equals("AVALIABLE")) {
               list.add(i);
            }
        }
        return list;
    }
    
   
}
