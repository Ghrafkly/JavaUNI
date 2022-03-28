package com.uni.Week3;

public class Owner
{
    private String name;
    private double insured;

    public Owner()
    {
        this.name = "name";
        this.insured = 1.23;
    }

    public Owner(String name, double insured)
    {
        this.name = name;
        this.insured = insured;
    }

    public String getName()
    {
        return name;
    }

    public double getInsured()
    {
        return insured;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setInsured(double insured)
    {
        this.insured = insured;
    }
}
