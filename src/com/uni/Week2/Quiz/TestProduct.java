package com.uni.Week2.Quiz;

public class TestProduct
{
    public static void main(String[] args)
    {
        Product product1 = new Product();
        Product product2 = new Product(2164, "Computer Desk", "Desk for gaming", 100.45);
        product1.display();
        product2.display();
    }
}