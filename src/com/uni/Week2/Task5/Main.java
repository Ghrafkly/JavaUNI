package com.uni.Week2.Task5;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Clock objClock = new Clock();

        String[] clockNumbers = {"hours", "minutes", "seconds"};

        for (int i = 0; i < clockNumbers.length; i++)
        {
            System.out.printf("Please enter %s: ", clockNumbers[i]);
            clockNumbers[i] = scanner.nextLine();
            if (i == 0)
                objClock.setHours(Integer.parseInt(clockNumbers[i]));
            else if (i == 1)
                objClock.setMinutes(Integer.parseInt(clockNumbers[i]));
            else
                objClock.setSeconds(Integer.parseInt(clockNumbers[i]));
        }
        objClock.display();
        objClock.showTime();
    }
}