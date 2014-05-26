package com.tbse.datastructures.threads;

import android.util.Log;

/**
 * WNSW
 * Created by tbsmith on 5/24/14.
 */
public class MyThread implements Runnable {

    private int id;

    public MyThread(int id) {
        this.id = id;
    }

    public void run() {

        Log.d("ds", "running thread " + id);

    }

}
