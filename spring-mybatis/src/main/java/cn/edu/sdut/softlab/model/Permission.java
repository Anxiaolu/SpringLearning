/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.sdut.softlab.model;

import java.io.Serializable;
import net.sf.json.JSONObject;

/**
 *
 * @author huanlu
 */
public class Permission implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;
    /**
     * 操作的url
     */
    private String url;
    /**
     * 操作的名称
     */
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return JSONObject.fromObject(this).toString();
    }
}
