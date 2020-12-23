package com.manoj.practice.interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SumInUnSortedArray {

    public static void main(String[] args) {

        int data[] = { 3, 2, 1, 4, 5, 6 };
        sum(data).forEach(s -> System.out.println(Arrays.toString(s)));
    }

    public static List<Integer[]> sum(int[] data) {
        int count = 0;
        List<Integer[]> lst = new ArrayList<>();

        Set<Integer> set = new HashSet<>();
        for (int i : data) {
            count++;
            int diff = 8 - i;
            if (set.contains(diff)) {
                Integer[] vals = { i, diff };
                lst.add(vals);
            }
            set.add(i);
        }

        System.out.println(count);
        return lst;
    }
}
