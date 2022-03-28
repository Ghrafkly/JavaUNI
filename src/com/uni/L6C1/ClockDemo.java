package com.uni.L6C1;

public class ClockDemo
{
    private static int hours;
    private static int minutes;
    private static int seconds;

    public static void main(String[] args) throws InterruptedException
    {
        timeSinceMidnight(10000);
        ClockDisplay clock = new ClockDisplay(hours, minutes, seconds);
        System.out.printf("Hours: %d, Minutes: %d, Seconds: %d\n", hours, minutes, seconds);

        for (int i = 0; i < 3; i++)
        {
            System.out.println(clock.getTime());
            clock.timeTick("seconds");
            Thread.sleep(1000);
        }
    }

    public static void timeSinceMidnight(int s)
    {
        hours = s/3600;
        minutes = (s - hours * 3600) / 60;
        seconds = (s - hours * 3600) - minutes * 60;
    }
}