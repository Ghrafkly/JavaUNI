package com.uni.Week2.Task5;

import java.util.Scanner;

public class Clock
{
    private int hours;
    private int minutes;
    private int seconds;

    public Clock()
    {
        hours = 10;
        minutes = 10;
        seconds = 10;
    }

    public Clock(int h, int m, int s)
    {
        hours = h;
        minutes = m;
        seconds = s;
    }

    public Clock(int newHour)
    {
        hours = newHour;
        minutes = 0;
        seconds = 0;
    }

    public void display()
    {
        System.out.printf("Hours: %d\nMinutes: %d\nSeconds: %d\n", hours, minutes, seconds);
    }

    public void showTime()
    {
        System.out.printf("%d:%d:%d\n\n", hours, minutes, seconds);
    }

    public void setHours(int h)
    {
        hours = h;
    }

    public void setMinutes(int m)
    {
        Scanner scanner = new Scanner(System.in);
        while (m < 0 || m > 59)
        {
            System.out.print("Invalid minutes. Please enter a number between 0-59: ");
            m = scanner.nextInt();
        }

        minutes = m;
    }

    public void setSeconds(int s)
    {
        seconds = s;
    }
}
