/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.sdut.softlab.repository;

import cn.edu.sdut.softlab.entity.Category;
import java.util.List;
import org.springframework.data.repository.RepositoryDefinition;

/**
 *
 * @author huanlu
 */
@RepositoryDefinition(domainClass = CategoryRepository.class,idClass = Integer.class)
public interface CategoryRepository {
    public Category findByname(String name);
    
    public Category findOne();
    
    //where name like ?%
    public List<Category> findByNameStartingWith(String name);
    
    //where name end of like ?%
    public List<Category> findByNameEndingWith(String name);
}
