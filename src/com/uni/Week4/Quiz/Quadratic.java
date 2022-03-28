package com.uni.Week4.Quiz;

import java.util.Scanner;

public class Quadratic
{
    public static String[] calculateQuad(double a, double b, double c)
    {
        String root1, root2;
        double real, imaginary;
        double determinate = Math.pow(b, 2) - (4 * a * c);

        if (determinate > 0)
        {
            root1 = String.valueOf(((-b) + Math.sqrt(determinate))
                    /(2*a));

            root2 = String.valueOf(((-b) - Math.sqrt(determinate))
                    /(2*a));
        }
        else if (determinate < 0)
        {
            real = (-b) / (2*a);
            imaginary = Math.sqrt(-determinate) / (2*a);

            root1 = String.format("%.2f + %.2fi", real, imaginary);
            root2 = String.format("%.2f - %.2fi", real, imaginary);
        }
        else
            root1 = root2 = String.valueOf((-b) / (2 * a));

        return new String[] { root1, root2 };
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String[] s = { "a", "b", "c" };
        double[] value = new double[s.length];

        for (int i = 0; i < s.length; i++)
        {
            System.out.printf("Please enter the value of %s: ", s[i]);
            value[i] = Double.parseDouble(scanner.nextLine());
        }

        String[] d = calculateQuad(value[0], value[1], value[2]);

        System.out.printf("""
                root1 = %s
                root2 = %s""", d[0], d[1]);
    }
}
