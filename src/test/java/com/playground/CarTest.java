package com.playground;

import com.playground.racingcar.Car;
import com.playground.racingcar.CarName;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    @Test
    @DisplayName("random 값이 4 이상일 경우 전진한다.")
    void 랜덤_값이_4이상인_경우() {
        Car prism = new Car(new CarName("prism"));
        prism.move(4);
        assertEquals(2, prism.getPosition());
    }

    @Test
    @DisplayName("random 값이 4 미만일 경우 제자리에 있는다.")
    void 랜덤_값이_4미만인_경우() {
        Car prism = new Car(new CarName("prism"));
        prism.move(3);
        assertEquals(1, prism.getPosition());
    }
}
