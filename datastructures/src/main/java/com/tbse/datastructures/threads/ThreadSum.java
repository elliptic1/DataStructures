package com.tbse.datastructures.threads;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * WNSW
 * Created by tbsmith on 5/25/14.
 */
public class ThreadSum {

    public static int sum;

    public static void main() {

        int[] numbersToSum = {1,2,3,4,5,6,7,8}; // pad with 0 so cardinality is even

        sum = 0;

        for (int i=0; i<numbersToSum.length/2; i++) {
            new Thread(new ThreadAddHelper(numbersToSum[i], numbersToSum[numbersToSum.length-1-i])).start();
        }




    }


}
