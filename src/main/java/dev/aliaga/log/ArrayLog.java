package dev.aliaga.log;

import java.util.ArrayList;
import java.util.List;

public class ArrayLog {

    public static List<Integer> reverseArrayList(List<Integer> array) {
        if (array.size() == 0) return array;

        List<Integer> reverse = new ArrayList<>(array.size());

        for (int i = array.size() - 1; i >= 0; i--) {
            reverse.add(array.get(i));
        }

        return reverse;
    }

    public static int[] reverseArray(int[] array) {
        if (array.length == 0) return array;

        int[] reverse = new int[array.length];
        int y = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reverse[y] = array[i];
            y++;
        }
        return reverse;
    }
}
