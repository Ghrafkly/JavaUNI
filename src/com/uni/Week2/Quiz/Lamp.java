package com.uni.Week2.Quiz;

public class Lamp
{
    private boolean isOn;

    public Lamp()
    {
        this.isOn = false;
    }

    public Lamp(boolean isOn)
    {
        this.isOn = isOn;
    }

    public String display()
    {
        return (isOn) ? "On" : "Off";
    }

    public void setOn(boolean on)
    {
        isOn = on;
    }

    public static void main(String[] args) throws InterruptedException {
        Lamp lamp1 = new Lamp(true);
        Lamp lamp2 = new Lamp();

        System.out.printf("Lamp 1 is: %s\n", lamp1.display());
        Thread.sleep(1000);
        System.out.print("Turning off Lamp 1\r");
        Thread.sleep(1000);
        lamp1.setOn(false);
        System.out.printf("Lamp 1 is: %s\n", lamp1.display());

        System.out.println();
        Thread.sleep(1000);

        System.out.printf("Lamp 2 is: %s\n", lamp2.display());
        Thread.sleep(1000);
        System.out.print("Turning on Lamp 2\r");
        Thread.sleep(1000);
        lamp2.setOn(true);
        System.out.printf("Lamp 2 is: %s\n", lamp2.display());
    }
}