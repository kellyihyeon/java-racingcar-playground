package com.playground.view;

import java.util.Scanner;

public class InputView {

    private String input = "";
    private int count = 0;

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,)를 기준으로 구분)");
        input = scanner.nextLine();

        System.out.println("시도할 횟수는 몇회인가요?");
        count = scanner.nextInt();
    }

    public String getInput() {
        return this.input;
    }

    public int getCount() {
        return this.count;
    }
}
