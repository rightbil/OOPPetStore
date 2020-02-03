package com.company;

//import com.sun.org.apache.xpath.internal.operations.String;

public class Animal {
    String name;
    String type;
    String description;
    double price;
    boolean isInStock;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }

    public Animal() {
    }

    public Animal(String name, String type, String description) {
        this.name = name;
        this.type = type;
        this.description = description;
    }




    }

