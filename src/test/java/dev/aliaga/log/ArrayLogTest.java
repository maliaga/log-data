package dev.aliaga.log;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class ArrayLogTest {

    @Test
    void reverseArrayList() {
        Assertions.assertEquals(Arrays.asList(6, 5, 4, 3, 2, 1),
                ArrayLog.reverseArrayList(Arrays.asList(1, 2, 3, 4, 5, 6)));
        Assertions.assertEquals(Arrays.asList(61, 51, 41, 31, 21, 11),
                ArrayLog.reverseArrayList(Arrays.asList(11, 21, 31, 41, 51, 61)));
        Assertions.assertEquals(Arrays.asList(62, 52, 42, 32, 22, 12),
                ArrayLog.reverseArrayList(Arrays.asList(12, 22, 32, 42, 52, 62)));
        Assertions.assertEquals(Arrays.asList(67, 57, 47, 37, 27, 17),
                ArrayLog.reverseArrayList(Arrays.asList(17, 27, 37, 47, 57, 67)));
    }

    @Test
    void reverseArray() {
        Assertions.assertArrayEquals(new int[]{6, 5, 4, 3, 2, 1},
                ArrayLog.reverseArray(new int[]{1, 2, 3, 4, 5, 6}));
        Assertions.assertArrayEquals(new int[]{16, 15, 14, 13, 12, 11},
                ArrayLog.reverseArray(new int[]{11, 12, 13, 14, 15, 16}));
        Assertions.assertArrayEquals(new int[]{62, 52, 42, 32, 22, 12},
                ArrayLog.reverseArray(new int[]{12, 22, 32, 42, 52, 62}));
        Assertions.assertArrayEquals(new int[]{76, 75, 74, 73, 72, 71},
                ArrayLog.reverseArray(new int[]{71, 72, 73, 74, 75, 76}));
    }

    @Test
    void lowerValue() {
        Assertions.assertEquals(2, ArrayLog.lowestNumber(new int[]{4,7,9,2,10}));
        Assertions.assertEquals(20, ArrayLog.lowestNumber(new int[]{40,75,95,20,100}));
        Assertions.assertEquals(4, ArrayLog.lowestNumber(new int[]{4,70,95,25,10}));
    }

    @Test
    void highestValue() {
        Assertions.assertEquals(10, ArrayLog.highestNumber(new int[]{4,7,9,2,10}));
        Assertions.assertEquals(100, ArrayLog.highestNumber(new int[]{40,75,95,20,100}));
        Assertions.assertEquals(95, ArrayLog.highestNumber(new int[]{4,70,95,25,10}));
    }
}