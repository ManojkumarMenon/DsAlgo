package com.manoj.practice.interviewQuestions;

import java.util.Stack;

public class DataMirrorChecker {

    public static void main(String[] args) {

        // () ---> true
        // (()) --> true
        // ()() --> true
        // ((( --> false
        // )( -- false
        // ()) -- false

        char[] chars = { '(', ')', '(', ')' };

        System.out.println(isCheckUsingPrimitive(chars));
        System.out.println(isCheckUsingDs(chars));

    }

    private static boolean isCheckUsingPrimitive(char[] str) {

        int count = 0;
        for (int i = 0; i < str.length; i++) {

            if (str[i] == '(') {
                count++;
            }
            if (str[i] == ')') {
                count--;
            }

            if (count < 0) {
                return false;
            }

        }

        return count == 0;
    }

    private static boolean isCheckUsingDs(char[] str) {

        Stack<Character> stk = new Stack<>();

        for (int i = 0; i < str.length; i++) {

            if (str[i] == '(') {
                stk.add('(');
            }
            if (str[i] == ')') {
                if (stk.empty() || stk.pop() != '(')
                    return false;

            }

        }

        return stk.empty();

    }

}
