/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensode.jsf.managedbeans;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "mhs")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mhs.findAll", query = "SELECT m FROM Mhs m"),
    @NamedQuery(name = "Mhs.findByNim", query = "SELECT m FROM Mhs m WHERE m.nim = :nim"),
    @NamedQuery(name = "Mhs.findByNama", query = "SELECT m FROM Mhs m WHERE m.nama = :nama"),
    @NamedQuery(name = "Mhs.findByJudul", query = "SELECT m FROM Mhs m WHERE m.judul = :judul")})
public class Mhs implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nim")
    private String nim;
    @Basic(optional = false)
    @Column(name = "nama")
    private String nama;
    @Basic(optional = false)
    @Column(name = "judul")
    private String judul;

    public Mhs() {
    }

    public Mhs(String nim) {
        this.nim = nim;
    }

    public Mhs(String nim, String nama, String judul) {
        this.nim = nim;
        this.nama = nama;
        this.judul = judul;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nim != null ? nim.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mhs)) {
            return false;
        }
        Mhs other = (Mhs) object;
        if ((this.nim == null && other.nim != null) || (this.nim != null && !this.nim.equals(other.nim))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ensode.jsf.managedbeans.Mhs[ nim=" + nim + " ]";
    }
    
}
