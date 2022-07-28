package com.playground.racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CarNameTest {

    @Test
    @DisplayName("자동차 이름이 5자를 초과하면 IllegalArgumentException 예외가 발생한다.")
    void 자동차_이름이_5자_이상인_경우() {
        assertThrows(IllegalArgumentException.class, () -> new CarName("golden"));
    }

    @Test
    @DisplayName("각 자동차에 이름을 부여할 수 있다.")
    void getName() {
        CarName prism = new CarName("prism");
        CarName green = new CarName("green");

        assertEquals("prism", prism.getName());
        assertEquals("green", green.getName());
    }
}
