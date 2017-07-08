/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.sdut.softlab.repository;

import java.io.Serializable;

/**
 *
 * @author huanlu
 * @param <T>
 * @param <ID>
 */
public interface RepositoryFactory<T,ID extends Serializable> {
    
    public T findByName(String name);
    
}
