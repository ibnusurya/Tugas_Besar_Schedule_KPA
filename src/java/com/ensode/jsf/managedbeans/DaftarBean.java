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
public class DaftarBean {

    /**
     * Creates a new instance of DaftarBean
     */
    public DaftarBean() {
    }
    private String prodi;
    private String nama;
    private String topikpa;
    private String dosen;
    private String email;

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTopikpa() {
        return topikpa;
    }

    public void setTopikpa(String topikpa) {
        this.topikpa = topikpa;
    }

    public String getDosen() {
        return dosen;
    }

    public void setDosen(String dosen) {
        this.dosen = dosen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
