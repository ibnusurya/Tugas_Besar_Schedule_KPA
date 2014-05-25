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
public class DaftarPaBean {

    /**
     * Creates a new instance of daftarPaBean
     */
    public DaftarPaBean() {
    }
    private String prodi;
    private String nama;
    private String topikpa;
    private String dosen;
    private String email;
}
