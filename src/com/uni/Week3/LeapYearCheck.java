package com.uni.Week3;

import java.util.Scanner;

public class LeapYearCheck
{
    public static boolean isLeapYear(int year)
    {
        // https://en.wikipedia.org/wiki/Leap_year#Gregorian_calendar

//        if (year % 4 != 0) return false;
//        else if (year % 400 == 0) return true;
//        else return year % 100 != 0;
//
//        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);


        boolean r = false;

        switch (year % 400)
        {
            case 0 -> r = true;
            default ->
            {
                switch (year % 4)
                {
                    case 0 ->
                    {
                        if (year % 100 != 0)
                            r = true;
                    }
                }
            }
        }
        return r;


    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Year: ");
        int year = Integer.parseInt(scanner.nextLine());

        System.out.printf(
                isLeapYear(year)
                        ? "%d is a Leap Year"
                        : "%d is not a Leap Year", year);
    }
}
