package com.manoj.practice;

import java.util.ArrayList;
import java.util.List;

public class SubSequenceOfString {

    static List<String> al = new ArrayList<>();

    public static void main(String[] args) {
        String s = "abcd";
        findsubsequences("", s);
        System.out.println(al);
    }

    /*
     * <p> 
     *      Initially data will be --> "" & abcd 
     * a & bcd ----> will give all of ab , abc, abcd in first sub sequence
     * <p> 
     *      acd, ad in the second sub sequence
     */
    private static void findsubsequences(String substr, String str) {

        System.out.println(substr + "-" + str);

        if (str.length() == 0) {
            return;
        }

        String nsubstr = substr + str.charAt(0);
        str = str.substring(0 + 1);
        al.add(nsubstr);
        // Step :- a & bcd
        findsubsequences(nsubstr, str);
        // Step :- "" & bcd
        findsubsequences(substr, str);

    }

}
