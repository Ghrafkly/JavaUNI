package com.uni.Week4.Quiz;

public class RNG
{
    public int RandomNumber(int min, int max)
    {
        return (int)(Math.random() * ((max - min) + 1) + min);
    }
}
