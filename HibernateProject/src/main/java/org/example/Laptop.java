package org.example;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;

//since we want that laptop fields should be inside Aliens only
//not in a different table, we are not using entity
@Embeddable
public class Laptop {

    private String brand;
    private String model;
    private int ram;

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                '}';
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
