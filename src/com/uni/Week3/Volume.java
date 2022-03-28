package com.uni.Week3;

import java.util.Scanner;

public class Volume
{
    public static void main(String[] args)
    {
        double radius, height, volume;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Volume of a Cylinder");
        System.out.println("--------------------");

        System.out.print("Please enter the radius: ");
        radius = Double.parseDouble(scanner.nextLine());

        System.out.print("Please enter the height: ");
        height = Double.parseDouble(scanner.nextLine());

        volume = Math.PI * Math.pow(radius, 2) * height;

        System.out.printf("The volume of the cylinder is: %.2f", volume);
    }
}
