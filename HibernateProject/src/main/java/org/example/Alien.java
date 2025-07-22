package org.example;

import jakarta.persistence.*;

@Entity
@Table(name = "alien_table")
public class Alien {

    @Id
    private int aid;
    @Column(name = "alien_name")
    private String aname;

    //this will not be stored in the database due to transient annotation
    @Transient
    private String tech;

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", tech='" + tech + '\'' +
                '}';
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }
}
