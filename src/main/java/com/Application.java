package com;

import com.playground.racingcar.Car;
import com.playground.view.InputView;
import com.playground.view.ResultView;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        InputView inputView = new InputView();
        inputView.start();

        ResultView resultView = new ResultView(inputView.getInput(), inputView.getCount());
        List<Car> winners = resultView.getWinners();

        System.out.print("최종 우승자: ");
        for (Car winner : winners) {
            System.out.println(winner.getName());
        }

    }
}
