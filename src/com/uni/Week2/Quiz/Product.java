package com.uni.Week2.Quiz;

public class Product
{
    private int prodCode;
    private String prodName;
    private String prodDescription;
    private double prodPrice;

    public Product()
    {
        prodCode = 1234;
        prodName = "Jelly Beans";
        prodPrice = 1.23;
    }

    public Product(int prodCode, String prodName, String prodDescription, double prodPrice) {
        this.prodCode = prodCode;
        this.prodName = prodName;
        this.prodDescription = prodDescription;
        this.prodPrice = prodPrice;
    }

    public void display()
    {
        System.out.printf("Code: %d\nName: %s | Description: %s\nPrice: %f\n\n", prodCode, prodName, prodDescription, prodPrice);
    }
}
