package com.uni.RollingProjectv2;

public class Validation
{
    public Validation()
    {
    }

    public boolean isBlank(String s)
    {
        return s.trim().length() == 0;
    }

    public boolean lengthWithinRange(String s, int min, int max)
    {
        return s.trim().length() >= min
                && s.trim().length() <= max;

    }
}
