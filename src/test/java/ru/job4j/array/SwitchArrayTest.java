package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap0to7() {
        int[] input = {3, 2, 3, 4, 5, 18, 6, 7};
        int source = 3;
        int dest = input.length - 2;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {3, 2, 3, 6, 5, 18, 4, 7};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap0to4() {
        int[] input = {3, 2, 3, 4, 5};
        int source = 1;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {3, 5, 3, 4, 2};
        assertThat(result).containsExactly(expected);
    }
}