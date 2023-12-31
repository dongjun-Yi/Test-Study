package sample.cafekiosk.unit.beverage;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AmericanoTest {

    @Test
    void getName() {
        Americano americano = new Americano();

        // Junit API인 assertEquals로 테스트
        assertEquals(americano.getName(), "아메리카노");

        // assertJ의 API인 assertThat으로 테스트
        assertThat(americano.getName()).isEqualTo("아메리카노");
    }
}