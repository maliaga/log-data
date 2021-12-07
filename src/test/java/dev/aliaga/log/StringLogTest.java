package dev.aliaga.log;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringLogTest {

    @Test
    void manyTimes() {
        Assertions.assertEquals(3, StringLog.manyTimes("hjgajhgjhgajgjga", 'a'));
    }

    @Test
    void palindrome() {
        Assertions.assertTrue(StringLog.palindrome("anna"));
        Assertions.assertTrue(StringLog.palindrome("asfggfsa"));
        Assertions.assertFalse(StringLog.palindrome("asfgtgfsa"));
    }
}