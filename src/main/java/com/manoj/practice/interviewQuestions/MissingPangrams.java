package com.manoj.practice.interviewQuestions;

import java.util.Arrays;

public class MissingPangrams {

    public static void main(String[] args) {
        String s = "hello world";
        s.toLowerCase();

        int[] charPos = new int[26];

        for (int i = 0; i < s.length(); i++) {

            int charVal = s.charAt(i);
            if (charVal < 123 && charVal > 96)

                charPos[s.charAt(i) - 97] = 1;
        }

        System.out.println(Arrays.toString(charPos));
        for (int i = 0; i < 26; i++) {
            if (charPos[i] != 1) {
                System.out.print((char) (i + 97));
            }
        }
    }
}
