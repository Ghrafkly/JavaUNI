package com.uni.Week3;

import java.util.Scanner;

public class WageCalculation
{
    private final static int STDHOURS = 35;
    private final static int WAGE = 30;
    private final static int OVERTIME = 40;
    private static double EXTRAHOURS = 0;

    public static double hoursWorked(double hours)
    {
        if (hours > STDHOURS)
            EXTRAHOURS = hours - STDHOURS;

        return (hours - EXTRAHOURS) * WAGE
                + EXTRAHOURS * OVERTIME;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of hours worked this week: ");
        double hours = Double.parseDouble(scanner.nextLine());

        System.out.printf("Wage: %.2f", hoursWorked(hours));
    }
}
