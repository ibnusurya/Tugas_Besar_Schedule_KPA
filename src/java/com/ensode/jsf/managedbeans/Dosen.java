/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensode.jsf.managedbeans;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author isa_sai
 */
@Entity
@Table(name = "dosen")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dosen.findAll", query = "SELECT d FROM Dosen d"),
    @NamedQuery(name = "Dosen.findByNo", query = "SELECT d FROM Dosen d WHERE d.no = :no"),
    @NamedQuery(name = "Dosen.findByInisial", query = "SELECT d FROM Dosen d WHERE d.inisial = :inisial"),
    @NamedQuery(name = "Dosen.findByNama", query = "SELECT d FROM Dosen d WHERE d.nama = :nama")})
public class Dosen implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "no")
    private Integer no;
    @Basic(optional = false)
    @Column(name = "inisial")
    private String inisial;
    @Basic(optional = false)
    @Column(name = "nama")
    private String nama;

    public Dosen() {
    }

    public Dosen(Integer no) {
        this.no = no;
    }

    public Dosen(Integer no, String inisial, String nama) {
        this.no = no;
        this.inisial = inisial;
        this.nama = nama;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getInisial() {
        return inisial;
    }

    public void setInisial(String inisial) {
        this.inisial = inisial;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (no != null ? no.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dosen)) {
            return false;
        }
        Dosen other = (Dosen) object;
        if ((this.no == null && other.no != null) || (this.no != null && !this.no.equals(other.no))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ensode.jsf.managedbeans.Dosen[ no=" + no + " ]";
    }
    
}
