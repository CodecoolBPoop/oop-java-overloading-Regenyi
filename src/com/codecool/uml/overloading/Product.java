package com.codecool.uml.overloading;

import java.util.*;

public class Product {
    private int id;
    private static int idCounter = 0;
    private String name;
    private float defaultPrice;
    private Currency defaultCurrency;
    private ProductCategory productCategory;
    private Supplier supplier;
    private static List<Product> productList = new ArrayList<>();

    Currency currency = Currency.getInstance(Locale.US);

    public Product() {
        ProductCategory tempPC = new ProductCategory();
        Supplier tempSupp = new Supplier();
        this.name = "n/a";
        this.defaultPrice = 0;
        this.defaultCurrency = currency;
        this.id = idCounter;
        this.setProductCategory(tempPC);
        this.setSupplier(tempSupp);
        productList.add(this);
        idCounter++;
    }

    public Product(String name, float defaultPrice, Currency defaultCurrency, ProductCategory prodCat, Supplier supplier) {
        this.name = name;
        this.defaultPrice = defaultPrice;
        this.defaultCurrency = defaultCurrency;
        this.id = idCounter;
        this.setProductCategory(prodCat);
        this.setSupplier(supplier);
        productList.add(this);
        idCounter++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDefaultPrice() {
        return defaultPrice;
    }

    public void setDefaultPrice(float defaultPrice) {
        this.defaultPrice = defaultPrice;
    }

    public void setDefaultCurrency(Currency defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Currency getDefaultCurrency() {
        return defaultCurrency;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    //todo: q: can't the parameter be converted to 'object', and do pc and supp in one batch?
    public List<Product> getAllProductsBy(ProductCategory productCategory) {
        List<Product> tempList = new ArrayList<>();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getProductCategory().equals(productCategory)) {
                tempList.add(productList.get(i));
            }
        }
        return tempList;
    }

    public List<Product> getAllProductsBy(Supplier supplier) {
        List<Product> tempList = new ArrayList<>();
        for (Product prod : productList) {
            if (prod.getSupplier().equals(supplier)) {
                tempList.add(prod);
            }
        }
        return tempList;
    }

    //todo: remove brackets, put in loop
    @Override
    public String toString() {
        String listString = new String();
        listString = "\nid:"+this.id + ",name:"+ this.getName() + ",defaultprice:" + this.defaultPrice ;
        return listString;
    }

}
