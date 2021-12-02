package dev.aliaga.log.hackerrank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.println(addFormatString(s1.trim()) + addFormat(String.valueOf(x)));
        }
        System.out.println("================================");
    }

    private static String addFormatString(String value) {
        System.out.println(15 - value.length());
        int loop = 15 - value.length();

        for (int i = 0; i < loop; i++) {
            value+=" ";
        }

        return value;
    }

    private static String addFormat(String value) {
        int loop = 3 - value.length();
        String resu = "";
        for (int i = 0; i < loop; i++) {
            resu+="0";
        }
        return resu + value;
    }
}
