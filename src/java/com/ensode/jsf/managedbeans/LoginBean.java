/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensode.jsf.managedbeans;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author isa_sai
 */
@ManagedBean
@RequestScoped
public class LoginBean {

    /**
     * Creates a new instance of DaftarBean
     */
    public LoginBean() {
    }
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
    
}
