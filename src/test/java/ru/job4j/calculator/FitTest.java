package ru.job4j.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class FitTest {

    @Test
    void whenManHeight187ThenIdealWeightIs100Dot05() {
        short heightMan = 187;
        double expectedWeight = 100.05;
        double actualWeight = Fit.idealWeight(heightMan, 100);

        assertThat(actualWeight).isEqualTo(expectedWeight);
    }

    @Test
    void whenWomanHeight170thenIdealWeightIs69Dot0() {
        short heightWoman = 170;
        double expectedWeight = 69.0;

        double actualWeight = Fit.idealWeight(heightWoman, 110);

        assertThat(actualWeight).isEqualTo(expectedWeight);
    }

}