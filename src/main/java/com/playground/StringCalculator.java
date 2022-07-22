package com.playground;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

    private final String[] strArr;


    public StringCalculator(String inputString) {
        Pattern pattern = Pattern.compile("//(.)\n(.*)");
        Matcher matcher = pattern.matcher(inputString);

        if (matcher.find()) {
            String customDelimiter = matcher.group(1);
            strArr = matcher.group(2).split(customDelimiter);
        } else {
            strArr = inputString.split(",|:");
        }

    }

    public int plus() {
        int sum = 0;
        for (String str : strArr) {
            checkStringValidation(str);
            sum += Integer.parseInt(str);
        }

        return sum;
    }

    private void checkStringValidation(String str) {
        if (!Character.isDigit(str.charAt(0)) || Integer.parseInt(str) < 0) {
            throw new RuntimeException();
        }
    }
}
