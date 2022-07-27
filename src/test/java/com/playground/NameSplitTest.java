package com.playground;

import com.playground.utils.NameSplit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NameSplitTest {

    @Test
    @DisplayName("쉼표를 기준으로 자동차 이름 분리하기")
    void splitNameByComma() {
        String input = "prism,green,black";
        String[] carNames = NameSplit.splitByComma(input);

        Assertions.assertEquals("prism", carNames[0]);
        Assertions.assertEquals("green", carNames[1]);
        Assertions.assertEquals("black", carNames[2]);
    }
}
