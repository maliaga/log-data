package dev.aliaga.log.hackerrank;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

    private static boolean isBalanced(String s) {
        if (s == null || s.length() % 2 != 0)
            return false;
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stk.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (!stk.isEmpty()) {
                    char latestOpenP = stk.pop();
                    if (latestOpenP == '(' && c != ')') {
                        return false;
                    } else if (latestOpenP == '{' && c != '}') {
                        return false;
                    } else if (latestOpenP == '[' && c != ']') {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return stk.isEmpty();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int numTest = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < numTest; i++) {

                if (isBalanced(sc.nextLine())) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        } catch (Exception e) {
            System.out.println("Invalid Input");
        }
    }


}
