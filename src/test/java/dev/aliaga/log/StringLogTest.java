package dev.aliaga.log;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringLogTest {

    @Test
    void manyTimes() {
        Assertions.assertEquals(3, StringLog.manyTimes("hjgajhgjhgajgjga", 'a'));
    }
}