package com.playground.view;

import com.playground.racingcar.Car;
import com.playground.racingcar.Cars;
import com.playground.utils.NameSplit;

import java.util.List;

public class ResultView {

    private final Cars cars;

    public ResultView(String input, int count) {
        cars = new Cars(NameSplit.splitByComma(input));
        play(count);
    }

    private void play(int count) {
        System.out.println("실행 결과");
        showResult();
        for (int i = 0; i < count; i++) {
            cars.play();
            showResult();
        }
    }

    private void showResult() {
        for (Car car : cars.getCars()) {
            System.out.println(car.getName() + " : " + car.getPosition().show());
        }
    }

    public List<Car> getWinners() {
        return cars.getWinner();
    }
}
