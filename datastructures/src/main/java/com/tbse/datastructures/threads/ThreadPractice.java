package com.tbse.datastructures.threads;

/**
 * WNSW
 * Created by tbsmith on 5/24/14.
 */
public class ThreadPractice {

    public static void startThreadPractice() {

        ThreadGroup threadGroup = new ThreadGroup("All Threads");

        MyThread mt = new MyThread(1);
        MyThread mt2 = new MyThread(2);

        Thread t = new Thread(threadGroup, mt);
        Thread t2 = new Thread(threadGroup, mt2);

        t.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t.start();
        t2.start();




    }

}
