package com.manoj.practice.interviewQuestions;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MyLFUCache {

    private static Map<String, Integer> myCache = new HashMap<>();
    private static int capacity = 10;

    public static void main(String[] args) {

    }

    private void add(String s) {

        if (myCache.containsKey(s)) {
            Integer count = myCache.get(s);
            myCache.put(s, count++);
        }
        else {
            if (myCache.size() == capacity) {
                
               // myCache.entrySet();
            }
            myCache.put(s, 1);

        }

    }

    private void remove(String s) {

    }

}

class MyCustomComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }

}