package com.playground;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {

    private static Stream<Integer> createEmptyAndNullInputString() {
        return Stream.of(
                StringCalculator.splitAndAdd(""),
                StringCalculator.splitAndAdd(null)
        );
    }

    @ParameterizedTest
    @MethodSource("createEmptyAndNullInputString")
    @DisplayName("빈문자열 또는 null 을 입력하면 0을 반환한다.")
    void 빈문자열_또는_null_입력(int input) {
        assertEquals(0, input);
    }

    @Test
    @DisplayName("음수를 전달하면 RuntimeException 예외가 발생한다.")
    void 음수_입력() {
        assertThrows(RuntimeException.class, () -> StringCalculator.splitAndAdd("-1:2:3"));
    }

    @Test
    @DisplayName("숫자 이외의 값을 전달하면 RuntimeException 예외가 발생한다.")
    void 숫자_이외의_값_입력() {
        assertThrows(RuntimeException.class, () -> StringCalculator.splitAndAdd("a:2:3"));
    }

    @Test
    @DisplayName("커스텀 구분자를 기준으로 문자열을 분리한 뒤 그 합을 반환한다.")
    void 커스텀_구분자를_기준으로_문자열_분리() {
        int result = StringCalculator.splitAndAdd("//;\n1;2;3");
        assertEquals(6, result);
    }

    @Test
    @DisplayName("기본 구분자 콤마와 콜론을 기준으로 문자열을 분리한 뒤 그 합을 반환한다.")
    void 콤마와_콜론을_기준으로_문자열_분리() {
        int result = StringCalculator.splitAndAdd("1,2:3");
        assertEquals(6, result);
    }

    @Test
    @DisplayName("기본 구분자 콜론을 기준으로 문자열을 분리한 뒤 그 합을 반환한다.")
    void 콜론을_기준으로_문자열_분리() {
        int result = StringCalculator.splitAndAdd("1:2");
        assertEquals(3, result);
    }

    @Test
    @DisplayName("기본 구분자 콤마를 기준으로 문자열을 분리한 뒤 그 합을 반환한다.")
    void 콤마를_기준으로_문자열_분리() {
        int result = StringCalculator.splitAndAdd("1,2");
        assertEquals(3, result);
    }


}
