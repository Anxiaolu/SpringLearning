/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.sdut.softlab.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.springframework.stereotype.Service;

/**
 *
 * @author huanlu
 */
@Service
public class EMFactory {
    
    public EntityManager CreateEntityManager(){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("labUnit");
        return entityManagerFactory.createEntityManager();
    }
    
}
