package com.uni.Week4.Quiz;

import java.util.Scanner;

public class ThreeNumbers
{
    public static void main(String[] args)
    {
        double x = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers separated by a space");
        /*
         Split the string on a space
         as many times as possible as limit = 0
        */
        String[] s = scanner.nextLine().split(" ", 0);

        for (String num : s)
            switch (Integer.parseInt(num) % 5)
            {
                case 0 -> x += Double.parseDouble(num) / 5;
                default -> x += Double.parseDouble(num) * 5;
            }

        System.out.printf("The total is %.2f", x);
    }
}
