package com.codecool.uml.overloading;

import java.util.Currency;
import java.util.Date;
import java.util.Locale;

public class Webshop {

    public static void main(String[] args) {
        Date start = new Date(1,1,1998);
        Date end = new Date();
        Currency usd = Currency.getInstance(Locale.US);;

        ProductCategory tampons = new ProductCategory("Tampon", "Pipere", "Tamponok for our dear ladies");
        FeaturedProductCategory featuredPC = new FeaturedProductCategory();
        featuredPC.schedule(start, end);
        Supplier supplier1 = new Supplier("Adidas", "Cipőgyáros");

        Product prod1 = new Product("termék1", 200, usd, tampons, supplier1);
        prod1.setSupplier(supplier1);
        prod1.getAllProductsBy(tampons);
        Product prod2 = new Product("termék2", 100, usd, tampons, supplier1);
        prod2.setProductCategory(tampons);
        Product prod3 = new Product();

        System.out.println(featuredPC);
        System.out.println("get all by prodcat1: " + prod1.getAllProductsBy(tampons));
        System.out.println("all supp: " + prod2.getAllProductsBy(supplier1));

    }
}
