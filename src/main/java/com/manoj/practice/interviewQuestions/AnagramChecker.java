package com.manoj.practice.interviewQuestions;

public class AnagramChecker {

    public static void main(String[] args) {

        String s1 = "geeksforgeeks";
        String s2 = "forgeeksgees";
        System.out.println(isAnagram(s1, s2));
    }

    public static boolean isAnagram(String s1, String s2) {

        for (int i = 0; i < s1.length(); i++) {
            String t = s1.substring(i, s1.length()) + s1.substring(0, i);
            if (t.equals(s2)) {
                return true;
            }

        }
        return false;
    }

}
