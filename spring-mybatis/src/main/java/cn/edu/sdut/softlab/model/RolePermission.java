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
public class RolePermission implements Serializable{
    private static final long serialVersionUID = 1L;
	/**{@link URole.id}*/
    private Long rid;
    /**{@link UPermission.id}*/
    private Long pid;

    public RolePermission() {
	}
    public RolePermission(Long rid,Long pid) {
    	this.rid = rid;
    	this.pid = pid;
    }
    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }
    public String toString(){
    	return JSONObject.fromObject(this).toString();
    }
}
