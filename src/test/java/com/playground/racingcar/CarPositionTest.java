package com.playground.racingcar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarPositionTest {

    @Test
    @DisplayName("자동차를 한칸 전진시키고 이를 mark 에 반영한다.")
    void 한칸_전진() {
        CarPosition defaultPosition = new CarPosition(1);
        for (int i = 0; i < 2; i++) {
            defaultPosition.move();
        }
        Assertions.assertEquals("---", defaultPosition.show());
    }


}