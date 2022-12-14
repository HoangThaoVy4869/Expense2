/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.htv.nttv.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author USER
 */
@Entity
@Table(name = "details")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Details.findAll", query = "SELECT d FROM Details d"),
    @NamedQuery(name = "Details.findById", query = "SELECT d FROM Details d WHERE d.id = :id"),
    @NamedQuery(name = "Details.findByName", query = "SELECT d FROM Details d WHERE d.name = :name"),
    @NamedQuery(name = "Details.findByExpense", query = "SELECT d FROM Details d WHERE d.expense = :expense"),
    @NamedQuery(name = "Details.findByDescription", query = "SELECT d FROM Details d WHERE d.description = :description"),
    @NamedQuery(name = "Details.findByDate", query = "SELECT d FROM Details d WHERE d.date = :date")})
public class Details implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "name")
    private String name;
    @Column(name = "expense")
    private Long expense;
    @Size(max = 200)
    @Column(name = "description")
    private String description;
    @Column(name = "date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date date;
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private User userId;

    public Details() {
        date = new Date();
    }

    public Details(Integer id) {
        this.id = id;
    }

    public Details(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getExpense() {
        return expense;
    }

    public void setExpense(Long expense) {
        this.expense = expense;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Details)) {
            return false;
        }
        Details other = (Details) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.htv.nttv.pojo.Details[ id=" + id + " ]";
    }
    
}
