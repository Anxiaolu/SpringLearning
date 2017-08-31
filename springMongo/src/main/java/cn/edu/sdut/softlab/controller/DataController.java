/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.sdut.softlab.controller;

import cn.edu.sdut.softlab.entity.Data;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import cn.edu.sdut.softlab.Repository.DataRepository;

/**
 *
 * @author huanlu
 */
@Controller
@RequestMapping(value = "/data")
public class DataController {
    
    @Autowired
    DataRepository dataRepository;
    
    @RequestMapping(value = "/getdata",method = RequestMethod.GET)
    public String dataes(ModelMap modelMap){
        List<Data> dataList = dataRepository.findAll();
        modelMap.addAttribute("dataList", dataList);
        return "datalist";
    }
}
