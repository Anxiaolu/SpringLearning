/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.sdut.softlab.repository;

import cn.edu.sdut.softlab.entity.Stuff;
import java.io.Serializable;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author huanlu
 */
//@RepositoryDefinition(domainClass = StuffRepository.class,idClass = Integer.class)
public interface StuffRepository extends JpaRepository<Stuff, Integer>{
    
    @Override
    public List<Stuff> findAll();
    
    public Stuff findByName(String name);
    
    public Stuff findByNameAndPassword(String name,String passowrd);

    public void saveAndFlush();
}
