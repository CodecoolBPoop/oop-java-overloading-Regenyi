package com.codecool.uml.overloading;

import java.util.ArrayList;
import java.util.List;

public class Supplier {
    private int id;
    private String name;
    private String description;

    public Supplier() {}

    public Supplier(String name, String description) {
        this.name = name;
        this.description = description;
    };

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    List<Product> getProducts () {
        //Product prod = new Product();
        //return prod.getAllProductsBy(this);
        return Product.getAllProductsBy(this);
    }

    @Override
    public String toString() {
        String listString = new String();
        listString = this.getClass() + ":id:" + ",name:"+ this.getName() + "," + this.description;
        return listString;
    }
}
