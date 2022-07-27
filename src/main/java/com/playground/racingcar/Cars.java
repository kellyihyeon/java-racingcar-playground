package com.playground.racingcar;

import lombok.extern.slf4j.Slf4j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@Slf4j
public class Cars {

    private final List<Car> cars = new ArrayList<>();

    public Cars(String[] carNames) {
        createCar(carNames);
    }

    private void createCar(String[] carNames) {
        for (String carName : carNames) {
            cars.add(new Car(new CarName(carName)));
        }
    }

    public void play() {
        for (Car car : cars) {
            int random = new Random().nextInt(10);
            log.info("{}의 position: {}, random 값: {}", car.getName(), car.getPosition(), random);
            car.move(random);
            log.info("└> random 값을 반영한 position: {}", car.getPosition());
        }
    }

    public List<Car> getWinner() {
        List<Car> winners = new ArrayList<>();
        Collections.sort(cars);
        log.info("자동차의 max 포지션은 {}", cars.get(0).getPosition());

        for (Car car : cars) {
            if (isMax(car)) {
                winners.add(car);
            }
        }
        return winners;
    }

    private boolean isMax(Car car) {
        int max = cars.get(0).getPosition();
        return car.getPosition() == max;
    }

    public List<Car> getCars() {
        return this.cars;
    }
}
