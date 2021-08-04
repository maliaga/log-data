package dev.aliaga.log;

public class StringLog {

    public static int manyTimes(String text, char a) {
        int count = 0;

        for (char x: text.toCharArray()) {
            if (x == a) count++;
        }
        return count;
    }
}
