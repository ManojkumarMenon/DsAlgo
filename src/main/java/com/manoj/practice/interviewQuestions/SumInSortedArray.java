package com.manoj.practice.interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumInSortedArray {

    public static void main(String[] args) {

        int data[] = { 1, 2, 3, 4, 5, 6 };
        sum(data).forEach(s -> System.out.println(Arrays.toString(s)));
    }

    public static List<Integer[]> sum(int[] data) {

        int low = 0;
        int high = data.length - 1;
        int sum = 0;
        List<Integer[]> lst = new ArrayList<>();

        while (low < high) {
            sum = data[low] + data[high];
            if (sum == 7) {
                Integer[] t = { data[low], data[high] };
                lst.add(t);
                high = high - 1;
                low = low + 1;
            }
            else if (sum > 7)
                high = high - 1;
            else
                low = low + 1;

        }
        return lst;
    }
}
