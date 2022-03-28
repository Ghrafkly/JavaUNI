package com.uni.Week4.Quiz;

import java.util.Scanner;

public class TestRandom
{
    public static void main(String[] args)
    {
        RNG rng = new RNG();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter min number: ");
        int min = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Please enter max number: ");
        int max = scanner.nextInt();
        scanner.nextLine();

        int randomNumber1 = rng.RandomNumber(min, max);
        int randomNumber2 = rng.RandomNumber(min, max);

        int addition = randomNumber1 + randomNumber2;
        int multiplication = randomNumber1 * randomNumber2;

        System.out.printf("""
                Min:Max        - %d:%d
                Addition       - %d
                Multiplication - %d
                """,
                randomNumber1, randomNumber2,
                addition, multiplication);
    }
}
