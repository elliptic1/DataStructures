package com.tbse.datastructures.finding_sums;

import android.util.Log;

import java.util.ArrayList;

/**
 * WNSW
 * Created by tbsmith on 5/25/14.
 */
public class SumFinder {

    static int[] list1;
    static int[] list2;
    static int[] list3;

    static int n = 5;  // lists are length n

    public static void main(String[] args) {

        list1 = new int[]{2,3,4,7,9};
        list2 = new int[]{-4,-2,1,4,3};
        list3 = new int[]{-3,-2,1,5,7};

        // does any pair in list1 and list2 sum to a number in list3?

        Log.d("ds", "there is a pair? " + onePairSumsToNumberInThirdList());


    }

    // O(n^2)
    public static boolean onePairSumsToNumberInThirdList() {

            for (int sum : list3) {

                int sumToFind = -sum;

                int i = 0;
                int j = 0;

                // O(n)
                while (true) {

                    int thisSum = list1[i] + list2[j];

                    if (thisSum == sumToFind) return true;

                    if (sumToFind < thisSum) {
                        if (i + 1 >= n) break;
                        i++;
                    } else {
                        if (j + 1 >= n) break;
                        j++;
                    }

                }

            }

            return false;

    }


}
