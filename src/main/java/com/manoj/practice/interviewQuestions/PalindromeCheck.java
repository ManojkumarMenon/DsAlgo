package com.manoj.practice.interviewQuestions;

public class PalindromeCheck {

    public static void main(String[] args) {
        System.out.println(check("nitin"));
        System.out.println(check("malayalam"));
        System.out.println(check("malayalam1"));

        System.out.println(check("nitin1"));

    }

    public static boolean check(String s) {

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }

        return true;

    }
}
