package com.uni.Week3;

public class Ship
{
    private String name;
    private String origin;
    private Container contain;

    public Ship()
    {
        this.name = "name";
        this.origin = "origin";
        this.contain = new Container();
    }

    public Ship(String name, String origin, Container contain)
    {
        this.name = name;
        this.origin = origin;
        this.contain = contain;
    }

    public void display()
    {
        System.out.println("Ship: " + name);
        System.out.println("Origin: " + origin);
        System.out.println();
        System.out.println("Container contents: " + contain.getProd().getName());
        System.out.println("Owner: " + contain.getOwn().getName());
        System.out.println();
        System.out.println("--------------------------");
        System.out.println();
    }

    public String getName()
    {
        return name;
    }

    public String getOrigin()
    {
        return origin;
    }

    public Container getContain()
    {
        return contain;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setOrigin(String origin)
    {
        this.origin = origin;
    }

    public void setContain(Container contain)
    {
        this.contain = contain;
    }
}
