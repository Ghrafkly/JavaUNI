package com.uni.Week3;

import java.util.Scanner;

public class AgeCheck
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter age: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Please enter gender: ");
        String gender = scanner.nextLine();

        Person person = new Person(age, gender);

        if (person.getAge() >= 18)
            System.out.printf("Adult %s", gender);
        else if (person.getAge() < 13)
            System.out.printf("Minor %s", gender);
        else
            System.out.printf("Teen %s", gender);
    }
}
