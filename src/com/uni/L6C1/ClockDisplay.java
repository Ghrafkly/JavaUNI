package com.uni.L6C1;

public class ClockDisplay {
    private final NumberDisplay hours;
    private final NumberDisplay minutes;
    private final NumberDisplay seconds;
    private String displayString;

    public ClockDisplay() {
        hours = new NumberDisplay(24, 24);
        minutes = new NumberDisplay(60, 59);
        seconds = new NumberDisplay(60, 30);
        updateDisplay();
    }

    public ClockDisplay(int h, int m, int s) {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(59);
        seconds = new NumberDisplay(59);
        setTime(h,m,s);
        updateDisplay();
    }

    public void timeTick(String name) {
        switch (name) {
            case "hours" -> hours.incrementValue();
            case "minutes" -> minutes.incrementValue();
            case "seconds" -> seconds.incrementValue();
        }

        if (hours.getValue() > hours.getLimit()) hours.setValue(0);
        if (minutes.getValue() > minutes.getLimit()) minutes.setValue(0);
        if (seconds.getValue() > seconds.getLimit()) seconds.setValue(0);

        updateDisplay();
    }

    public void updateDisplay() {
        String hoursDual = Integer.toString(hours.getValue());
        String minutesDual = Integer.toString(minutes.getValue());
        String secondsDual = Integer.toString(seconds.getValue());

        if (hours.getValue() < 10) hoursDual = String.format("0%s", hours.getValue());
        if (minutes.getValue() < 10) minutesDual = String.format("0%s", minutes.getValue());
        if (seconds.getValue() < 10) secondsDual = String.format("0%s", seconds.getValue());

        displayString = String.format("%s:%s:%s", hoursDual, minutesDual, secondsDual);
    }

    public void setTime(int h, int m, int s) {
        hours.setValue(h);
        minutes.setValue(m);
        seconds.setValue(s);
        updateDisplay();
    }

    public String getTime() {
        return displayString;
    }

    public int getHours() {
        return hours.getValue();
    }

    public int getMinutes() {
        return minutes.getValue();
    }

    public int getSeconds() {
        return seconds.getValue();
    }
}
