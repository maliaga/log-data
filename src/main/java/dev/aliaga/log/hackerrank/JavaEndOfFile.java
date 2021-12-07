package dev.aliaga.log.hackerrank;

import java.util.Scanner;

public class JavaEndOfFile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        for (int i = 0; sc.hasNext(); i++) {
            System.out.println(i + " " + sc.nextLine());
        }
    }
}
