package org.example;

public class CellPhone {
    private String manufact;
    private String model;
    private double retailPrice;

    public CellPhone(String man, String mod, double price) {
        this.manufact = man;
        this.model = mod;
        this.retailPrice = price;
    }


    public double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }

    public String getManufact() {
        return manufact;
    }

    public void setManufact(String manufact) {
        this.manufact = manufact;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
