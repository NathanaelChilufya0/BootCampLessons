package com.SpringProject.SpringProjectArt;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Vehicles {
    @Id
    private int vehicleId;
    private String name;
    private String modelNumber;
    private String color;
    private double price;

    public Vehicles(String name, String modelNumber, String color, double price) {
        this.name = name;
        this.modelNumber = modelNumber;
        this.color = color;
        this.price = price;
    }

    public Vehicles(){
        System.out.println("Created");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
