package com.manoj.practice.interviewQuestions;

import java.util.Arrays;
import java.util.List;

public class StringSorting {

    public static void main(String[] args) {
        sort("My name is khan.");
    }

    public static void sort(String data) {
        String[] nonFullStop = data.replace(".", "").toLowerCase().split(" ");

        System.out.println(Arrays.toString(nonFullStop));

        List<String> lst = Arrays.asList(nonFullStop);
        lst.sort((o1, o2) -> {
            return o1.length() - o2.length();
        });
        Object[] objarr = lst.stream().toArray();
        StringBuilder buil = new StringBuilder();
        for (Object obj : objarr) {
            buil.append((String) obj).append(" ");

        }
        String outPut = buil.toString();
        outPut.substring(0, outPut.length() - 1);
        outPut = new StringBuilder().append(outPut.charAt(0)).toString().toUpperCase() + outPut.substring(1, outPut.length()) + ".";
        System.out.println(outPut);
    }
}
