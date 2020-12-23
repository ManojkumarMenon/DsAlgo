package com.manoj.practice.interviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesSortedList {

    public static void main(String[] args) {
        List<Integer> data = new ArrayList<Integer>();
        data.add(1);
        data.add(1);
        data.add(2);
        data.add(3);
        data.add(3);
        data.add(4);
        data.add(5);
        removeDuplicate(data);
        System.out.println(data);

    }

    public static void removeDuplicate(List<Integer> data) {
        int prev = -1;
        for (int i = 0; i < data.size(); i++) {
            if (prev == data.get(i)) {
                data.remove(i);
            }
            else {
                prev = data.get(i);
            }
        }
    }

}
