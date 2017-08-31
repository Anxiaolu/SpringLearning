/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.sdut.softlab.Repository;

import cn.edu.sdut.softlab.entity.Data;
import java.util.List;

/**
 *
 * @author huanlu
 */
public interface DataOptions{

    List<Data> findOne(String Company,String League,String Year);
    
    List<Data> findByCompany(String Company);
    
}
