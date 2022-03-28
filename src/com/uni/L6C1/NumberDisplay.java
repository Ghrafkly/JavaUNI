package com.uni.L6C1;

public class NumberDisplay {
    private int limit;
    private int value;

    public NumberDisplay(int limit) {
        this.limit = limit;
        this.value = 0;
    }

    public NumberDisplay(int limit, int value) {
        this.limit = limit;
    }

    public void incrementValue() {
        this.value++;
    }

    public void display() {
        System.out.printf("Limit is %d. Value is currently: %d\n", limit, value);
    }

    public int getLimit() {
        return limit;
    }

    public int getValue() {
        return value;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
