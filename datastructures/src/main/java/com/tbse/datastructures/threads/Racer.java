package com.tbse.datastructures.threads;

import android.util.Log;

/**
 * WNSW
 * Created by tbsmith on 5/25/14.
 */
public class Racer  implements Runnable {

    int totalDistanceRan;
    Thread threadToJoin;

    public void run() {

        for (int i = 0; i<ThreadRacer.raceLength/2; i++) {
            totalDistanceRan += 1;
            Log.d("ds", Thread.currentThread().getName() + " ran " + totalDistanceRan);
        }

        if (threadToJoin != null) {
            try {
                threadToJoin.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public Racer(Thread t) {
        threadToJoin = t;
    }
    public Racer() {}
}
