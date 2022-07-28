package com.playground.racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    private Car prism;

    @BeforeEach
    void setUp() {
        prism = new Car(new CarName("prism"));
    }

    @DisplayName("랜덤값이 음수이거나 9를 초과하면 IllegalArgumentException 예외가 발생한다.")
    @ParameterizedTest(name = "{index} 랜덤값이 {0} 이면 IllegalArgumentException 예외가 발생한다.")
    @ValueSource(ints = {-1, 10})
    void 랜덤값이_음수이거나_9를_초과하는_경우(int inputNumber) {
        assertThrows(IllegalArgumentException.class, () -> prism.move(inputNumber));
    }

    @Test
    @DisplayName("random 값이 4 이상일 경우 전진한다.")
    void 랜덤_값이_4이상인_경우() {
        prism.move(4);
        assertEquals(2, prism.getPosition().getNumber());
    }

    @Test
    @DisplayName("random 값이 4 미만일 경우 제자리에 있는다.")
    void 랜덤_값이_4미만인_경우() {
        prism.move(3);
        assertEquals(1, prism.getPosition().getNumber());
    }
}
