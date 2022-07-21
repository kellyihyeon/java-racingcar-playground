package com.playground;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {

    @Test
    @DisplayName("기본 구분자 콤마와 콜론을 기준으로 문자열을 분리한 뒤 그 합을 반환한다.")
    void 콤마와_콜론을_기준으로_문자열_분리() {
        StringCalculator calc = new StringCalculator("1,2:3");
        assertEquals(6, calc.plus());
    }

    @Test
    @DisplayName("기본 구분자 콜론을 기준으로 문자열을 분리한 뒤 그 합을 반환한다.")
    void 콜론을_기준으로_문자열_분리() {
        StringCalculator calc = new StringCalculator("1:2");
        assertEquals(3, calc.plus());
    }

    @Test
    @DisplayName("기본 구분자 콤마를 기준으로 문자열을 분리한 뒤 그 합을 반환한다.")
    void 콤마를_기준으로_문자열_분리() {
        StringCalculator calc = new StringCalculator("1,2");
        assertEquals(3, calc.plus());
    }


}
