package com.uni.Week3;

public class Product
{
    private String name;
    private String brand;
    private double unitPrice;

    public Product() {
        this.name = "name";
        this.brand = "brand";
        this.unitPrice = 1.23;
    }

    public Product(String name, String brand, double unitPrice) {
        this.name = name;
        this.brand = brand;
        this.unitPrice = unitPrice;
    }

    public String getName()
    {
        return name;
    }

    public String getBrand()
    {
        return brand;
    }

    public double getUnitPrice()
    {
        return unitPrice;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public void setUnitPrice(double unitPrice)
    {
        this.unitPrice = unitPrice;
    }
}
