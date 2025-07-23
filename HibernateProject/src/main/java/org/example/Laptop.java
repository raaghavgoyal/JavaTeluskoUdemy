package org.example;

import jakarta.persistence.*;

import java.util.List;

//since we want that laptop fields should be inside Aliens only
//not in a different table, we are not using entity
//@Embeddable
@Entity
public class Laptop {

    @Id
    private int lid;
    private String brand;
    private String model;
    private int ram;
//    @ManyToOne
//    private Aliens alien;
//    @ManyToMany(mappedBy = "laptops")
//    private List<Aliens> aliens;

    @Override
    public String toString() {
        return "Laptop{" +
                "lid=" + lid +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                '}';
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }


}
