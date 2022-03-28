package com.uni.L6C1;

public class Main {

    public static void main(String[] args) throws InterruptedException
    {
        ClockDisplay clock = new ClockDisplay(24, 59, 59);
        System.out.println(clock.getTime());

        for (int i = 0; i < 86400; i++) // 86400 = seconds in a day
        {
            clock.timeTick("seconds");
            if (clock.getSeconds() == 0)
            {
                clock.timeTick("minutes");
                if (clock.getMinutes() == 0)
                {
                    clock.timeTick("hours");
                }
            }
            Thread.sleep(1000); // Tick every second
            System.out.println(clock.getTime()); // Output clock
        }
    }
}
