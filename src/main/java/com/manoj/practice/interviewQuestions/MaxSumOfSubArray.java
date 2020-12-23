package com.manoj.practice.interviewQuestions;

public class MaxSumOfSubArray {

    public static void main(String[] args) {
        int[] data = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println(sum(data));
    }

    // Time Complexity is more
    public static Integer sum(int[] data) {

        Integer prevCount = null;
        for (int i = 0; i < data.length; i++) {

            for (int j = i; j < data.length; j++) {
                int t = i;
                int curCount = 0;
                System.out.print("[");
                while (t <= j) {
                    System.out.print(data[t] + " ");
                    curCount = curCount + data[t];
                    t++;
                }
                if (prevCount == null || curCount > prevCount) {
                    prevCount = curCount;
                }
                System.out.println("] -->" + curCount);

            }
        }
        return prevCount;
    }

}
