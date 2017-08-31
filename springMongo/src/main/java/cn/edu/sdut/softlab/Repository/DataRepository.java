/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.sdut.softlab.Repository;

import cn.edu.sdut.softlab.entity.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author huanlu
 */
@Repository("DataRepository")
public interface DataRepository extends MongoRepository<Data,String>, DataOptions{
    
    static final Logger logger = LoggerFactory.getLogger(DataRepository.class);
    
}
