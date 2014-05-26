package com.tbse.datastructures.threads;

import android.util.Log;

/**
 * WNSW
 * Created by tbsmith on 5/25/14.
 */
public class ThreadAddHelper implements Runnable {

    int s1;
    int s2;

    @Override
    public void run() {

        ThreadSum.sum += (s1 + s2);

        Log.d("ds", Thread.currentThread().getName() + " is adding " + s1 + " " + s2 + ", sum is now " + ThreadSum.sum);

    }

    public ThreadAddHelper(int a, int b) {
        s1 = a;
        s2 = b;
    }


}
