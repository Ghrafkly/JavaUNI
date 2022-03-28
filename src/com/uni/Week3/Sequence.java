package com.uni.Week3;

import java.util.Scanner;

public class Sequence
{
    public static void main(String[] args)
    {
        String sequence = "";
        String[] forward, reverse;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your sequence");
        forward = scanner.nextLine().split(" ", 0);

        int j = 0;
        reverse = new String[forward.length];
        for (int i = forward.length-1; i >= 0; i--)
        {
            reverse[j] = forward[i];
            j++;
        }

        for (String s : reverse) {
            sequence = sequence.concat(s + " ");
        }

        System.out.println("Sequence in reverse");
        System.out.println(sequence);
    }
}
