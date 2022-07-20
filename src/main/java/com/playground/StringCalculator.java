package com.playground;

public class StringCalculator {
    private final String[] strArr;

    public StringCalculator(String inputString) {
        strArr = inputString.split(",");
    }

    public int plus() {
        int sum = 0;

        for (String str : strArr) {
            sum += Integer.parseInt(str);
        }

        return sum;
    }
}
