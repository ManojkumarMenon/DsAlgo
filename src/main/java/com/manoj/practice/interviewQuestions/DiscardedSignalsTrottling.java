package com.manoj.practice.interviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class DiscardedSignalsTrottling {

    /*
     * Complete the 'droppedRequests' function below.
     *
     * The function is expected to return an INTEGER. The function accepts
     * INTEGER_ARRAY requestTime as parameter.
     * 
     * rules:- every 1 sec --> limit is 3 trns every 10 sec --> limit is 20 trns
     * every 1 min --> 60 trns
     * 
     * Any trn in each of the category is treated as dropped. Every signals
     * including dropped is considerd in the next category.
     */

    public static void main(String... args) {
        List<Integer> data = new ArrayList<Integer>();
        data.add(1);
        data.add(1);
        data.add(1);
        data.add(1);
        data.add(2);
        data.add(2);
        data.add(3);
        data.add(4);
        data.add(4);
        data.add(4);
        data.add(4);
        data.add(5);
        data.add(5);
        data.add(5);
        data.add(5);
        data.add(6);
        data.add(6);
        data.add(7);
        data.add(7);
        data.add(7);
        data.add(8);
        data.add(9);
        data.add(10);
        data.add(10);
        data.add(10);
        data.add(10);
        data.add(10);
        data.add(11);
        data.add(12);
        data.add(12);

        int count = droppedRequests(data);
        System.out.println(count);
    }

    public static int droppedRequests(List<Integer> requestTime) {
        int secCount = 0;
        int tenSecCount = 0;
        int minCount = 0;

        Map<Integer, Integer> mapData = new TreeMap<>();

        for (Integer i : requestTime) {
            Integer count = 1;
            if (mapData.containsKey(i)) {
                count = (Integer) mapData.get(i);
                count++;
            }
            mapData.put(i, count);
        }

        int prevTenSecPointer = 1;
        int prevMinPointer = 1;

        for (Entry<Integer, Integer> entry : mapData.entrySet()) {
            int k = entry.getKey();
            int v = entry.getValue();

            if (v > 3) {
                secCount++;
            }
            if (k - prevTenSecPointer == 10 - 1) {
                int c = 0;
                for (int i = prevTenSecPointer; i <= k; i++) {
                    c = c + mapData.get(i);
                }
                if (c > 20) {
                    tenSecCount = tenSecCount + c - 20;
                }
                prevTenSecPointer++;
            }

            if (k - prevMinPointer == 60 - 1) {
                int c = 0;
                for (int i = prevMinPointer; i <= k; i++) {
                    c = c + mapData.get(i);
                }
                if (c > 60) {
                    minCount++;
                }
                prevMinPointer++;
            }
        }

        return secCount + tenSecCount + minCount;

    }

}
