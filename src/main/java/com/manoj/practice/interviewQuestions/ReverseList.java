package com.manoj.practice.interviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class ReverseList {

    private static int count = 0;

    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);

        reverse(lst);
        lst.forEach(s -> System.out.print(s));
        System.out.println();
        System.out.println(count);
    }

    public static void reverse(List<Integer> data) {
        count = count + 1;

        if (data.size() == 0) {
            return;
        }
        int val = data.remove(0);
        reverse(data);
        data.add(val);
        return;
    }
}
