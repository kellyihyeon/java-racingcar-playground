package com.playground.racingcar;

public class CarPosition {

    private int number;
    private final String mark;

    public CarPosition(int number) {
        this.number = number;
        this.mark = "-";
    }

    public void move() {
        this.number++;
    }

    public int getNumber() {
        return number;
    }

    public String show() {
        return mark.repeat(number);
    }
}
