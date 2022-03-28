package com.uni.RollingProjectv2;

import java.util.Scanner;

public class Input
{
    public Input()
    {
    }

    public char acceptCharInput(String displayMessage, int position)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print(displayMessage);
        String input = scanner.nextLine();
        return input.charAt(position);
    }

    public double acceptDouble(String displayMessage)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print(displayMessage);
        return Double.parseDouble(scanner.nextLine());
    }

    public int acceptInteger(String displayMessage)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print(displayMessage);
        return Integer.parseInt(scanner.nextLine());
    }

    public String acceptString(String displayMessage)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print(displayMessage);
        return scanner.nextLine();
    }
}
