package com.uni.Week3;

public class Container
{
    private int no;
    private double weight;
    private Owner own;
    private Product prod;

    public Container() {
        this.no = 789;
        this.weight = 1.23;
        this.own = new Owner();
        this.prod = new Product();
    }

    public Container(int no, double weight, Owner own, Product prod) {
        this.no = no;
        this.weight = weight;
        this.own = own;
        this.prod = prod;
    }

    public int getNo()
    {
        return no;
    }

    public double getWeight()
    {
        return weight;
    }

    public Owner getOwn()
    {
        return own;
    }

    public Product getProd()
    {
        return prod;
    }

    public void setNo(int no)
    {
        this.no = no;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public void setOwn(Owner own)
    {
        this.own = own;
    }

    public void setProd(Product prod)
    {
        this.prod = prod;
    }

    public static void main(String[] args)
    {
        Container container = new Container();
        Product product = new Product("Hats", "HatsRUs", 198);
        container.setProd(product);
    }
}
