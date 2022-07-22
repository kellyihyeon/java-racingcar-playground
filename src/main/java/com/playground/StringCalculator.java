package com.playground;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

    private static final Pattern CUSTOM_PATTERN = Pattern.compile("//(.)\n(.*)");


    public static int splitAndAdd(String inputString) {
        if (isNullOrEmpty(inputString)) {
            return 0;
        }

        String[] components = splitByDelimiter(inputString);

        int sum = 0;
        for (String component : components) {
            checkComponentValidation(component);
            sum += Integer.parseInt(component);
        }

        return sum;
    }

    private static String[] splitByDelimiter(String inputString) {
        Matcher matcher = CUSTOM_PATTERN.matcher(inputString);

        if (matcher.find()) {
            String customDelimiter = matcher.group(1);
            return matcher.group(2).split(customDelimiter);
        }

        return inputString.split(",|:");
    }


    private static void checkComponentValidation(String str) {
        if (!Character.isDigit(str.charAt(0)) || Integer.parseInt(str) < 0) {
            throw new RuntimeException();
        }
    }

    private static boolean isNullOrEmpty(String inputString) {
        return inputString == null || inputString.isEmpty();
    }
}
