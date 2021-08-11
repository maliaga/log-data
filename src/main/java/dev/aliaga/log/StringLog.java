package dev.aliaga.log;

public class StringLog {

    public static int manyTimes(String text, char a) {
        int count = 0;

        for (char x: text.toCharArray()) {
            if (x == a) count++;
        }
        return count;
    }

    public static boolean palindrome(String word) {
        if (word.equals("") || word.length()%2!=0) return false;

        char[] arr = word.toCharArray();
        int y = arr.length - 1;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[y]) return false;
            y--;
        }
        return true;
    }
}
