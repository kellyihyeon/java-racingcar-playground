package com.playground.racingcar;

public class Car implements Comparable<Car>{

    private final CarName name;
    private int position;


    public Car(CarName name) {
        this.name = name;
        this.position = 1;
    }

    public void move(int condition) {
        validateCondition(condition);
        if (condition >= 4) {
            position++;
        }
    }

    private void validateCondition(int condition) {
        if (isConditionWrongNumber(condition)) {
            throw new IllegalArgumentException("자동차가 이동하기 위한 랜덤 값은 0이상 9이하이어야 합니다.");
        }
    }

    private boolean isConditionWrongNumber(int condition) {
        return condition < 0 || condition > 9;
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name.getName();
    }

    @Override
    public int compareTo(Car o) {
        return o.position - this.position;
    }

}
