//Problem: https://www.hackerrank.com/challenges/equality-in-a-array
//Java 8
package com.test;

import java.util.*;

public class EqualityProblem {

    static int equalizeArray(List<Integer> list) {
        int maxFrequency = 0;
        for(int i : list) {
            maxFrequency = Math.max(maxFrequency, Collections.frequency(list, i));
        }
        return list.size()-maxFrequency;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> list = new ArrayList<>(n);
        for(int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }
        int result = equalizeArray(list);
        System.out.println(result);
        in.close();
    }
}
