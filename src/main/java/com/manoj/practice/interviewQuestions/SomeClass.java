package com.manoj.practice.interviewQuestions;

import java.util.List;
import java.util.Scanner;

public class SomeClass {

    public static int diagonalDifference(List<List<Integer>> arr) {

        int val = arr.size();
        int rightDiag = 0;
        int leftDiag = 0;

        for( int i=0, j= val-1; i< val && j>=0; i++,j--){
            rightDiag=rightDiag+arr.get(i).get(i);
            leftDiag = leftDiag+arr.get(i).get(j);
        }
        return leftDiag>rightDiag? leftDiag-rightDiag:rightDiag-leftDiag;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
       // boolean ret = isAnagram(a, b);
       // System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
