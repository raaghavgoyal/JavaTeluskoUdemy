package org.example;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Aliens {
    @Id
    private int aid;
    private String aname;
    private String tech;
    //@OneToOne
    //private Laptop laptop;

    //mappedBy avoids redundancy by not creating a separate table... when we have
    //already specified the ManyToOne relationship in Laptop
    //@OneToMany(mappedBy = "alien")
    @ManyToMany
    private List<Laptop> laptops;

    @Override
    public String toString() {
        return "Aliens{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", tech='" + tech + '\'' +
                ", laptops=" + laptops +
                '}';
    }


    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
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
