package dev.aliaga.log.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SelectionTest {

    @Test
    void selection() {
        int[] unsorted = {1, 4, 678, -4, 5, 77, 895, 12234, 5, 0};
        int[] sorted = {-4, 0, 1, 4, 5, 5, 77, 678, 895, 12234};
        assertArrayEquals(Selection.selection(unsorted), sorted);
    }

    @Test
    void selectionV2() {
        int[] unsorted = {1, 4, 678, -4, 5, 77, 895, 12234, 5, 0};
        int[] sorted = {-4, 0, 1, 4, 5, 5, 77, 678, 895, 12234};
        assertArrayEquals(SelectionV2.selectionV2(unsorted), sorted);
    }
}