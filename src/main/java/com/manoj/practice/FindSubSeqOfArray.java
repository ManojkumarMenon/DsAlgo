package com.manoj.practice;

import java.util.ArrayList;
import java.util.List;

public class FindSubSeqOfArray {

    private static List<String> subSeq = new ArrayList<>();

    public static void main(String[] args) {

        int[] data = { 1, 2, 3, 4 };
        String s = "";

        for (int i : data) {
            s = s + i;
        }
        System.out.println(s);
        subsequence("", s);
        System.out.println(subSeq.toString());

    }

    public static void subsequence(String subData, String data) {

        if (data.length() == 0) {
            return;
        }

        String nsubData = subData + data.charAt(0);
        data = data.substring(1);

        subSeq.add(nsubData);

        subsequence(nsubData, data);
        subsequence(subData, data);

    }

}
