package com.codecool.uml.overloading;

import java.util.Date;

public class FeaturedProductCategory extends ProductCategory {
    private Date startDate;
    private Date endDate;

    public void schedule(Date startDate, Date endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        String listString = new String();
        listString = this.getClass() + ":id:" + ",name:"+ this.getName();
        return listString;
    }

}
