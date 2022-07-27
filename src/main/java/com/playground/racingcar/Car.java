package com.playground.racingcar;

public class Car {

    private final CarName name;
    private int position;


    public Car(CarName name) {
        this.name = name;
        this.position = 1;
    }

    public void move(int condition) {
        if (condition >= 4) {
            position++;
        }
    }

    public int getPosition() {
        return position;
    }
}
